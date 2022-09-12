package com.combank.ips.outward.producer.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.combank.ips.outward.producer.constant.IsoDirection;
import com.combank.ips.outward.producer.constant.IsoMessageId;
import com.combank.ips.outward.producer.constant.QueueStatus;
import com.combank.ips.outward.producer.dao.CreditTransferDao;
import com.combank.ips.outward.producer.model.pacs_008_001.Document;
import com.combank.ips.outward.producer.model.pacs_008_001.ObjectFactory;
import com.combank.ips.outward.producer.util.DateUtil;
import com.combank.ips.outward.producer.util.XmlFormatter;

@Repository
public class CreditTransferDaoImpl implements CreditTransferDao {

	@Autowired
	private DataSource dataSource;

	@Autowired
	private DateUtil dateUtil;

	@Autowired
	private XmlFormatter xmlFormatter;

	@Override
	public boolean createCreditTransfer(Document document) {

		String sql = "INSERT INTO LOGPRDDT1.IPP0007H (LGLGFL,LGLGDT,LGLGTM,LGLGUS,LGLGTS,LGDATA,LGMSGID,LGQSTS,LGTREF) VALUES (?,?,?,?,?,?,?,?,?)";

		try (Connection con = dataSource.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {

			pstmt.setString(1, IsoDirection.RECEIVED.getFlag());
			pstmt.setInt(2, dateUtil.getCurrentTimestamp().getDate());
			pstmt.setInt(3, dateUtil.getCurrentTimestamp().getTime());
			pstmt.setString(4, "OPNBANKMLD");
			pstmt.setString(5, dateUtil.getCurrentTimestamp().getTimeStamp());

			Object message = new ObjectFactory().createDocument(document);
			pstmt.setString(6, xmlFormatter.beautify(message));
			
			pstmt.setString(7, IsoMessageId.Credit_Transfer.getValue());
			pstmt.setString(8, QueueStatus.TOBEQUEUED.getFlag());
			pstmt.setString(9, document.getFIToFICstmrCdtTrf().getGrpHdr().getMsgId());

			int row = pstmt.executeUpdate();
			System.out.println("Rows Affected : " + row);

			if (row > 0) {
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;

	}

	@Override
	public boolean updateCreditTransfer(Document document) {

		String sql = "UPDATE LOGPRDDT1.IPP0007H SET LGQSTS = ? WHERE LGTREF = ?";

		try (Connection con = dataSource.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {

			pstmt.setString(1, QueueStatus.QUEUED.getFlag());
			pstmt.setString(2, document.getFIToFICstmrCdtTrf().getGrpHdr().getMsgId());

			int row = pstmt.executeUpdate();
			System.out.println("Rows Affected : " + row);

			if (row > 0) {
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

}
