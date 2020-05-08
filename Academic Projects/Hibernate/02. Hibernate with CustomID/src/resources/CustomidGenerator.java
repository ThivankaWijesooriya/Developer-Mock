package resources;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CustomidGenerator implements IdentifierGenerator {

	public int generateCustId() {
		Random random = new Random();
		return random.nextInt(1000);
	}

	@Override
	public Serializable generate(SharedSessionContractImplementor arg0, Object arg1) throws HibernateException {

		Date date = new Date();

		Calendar calendar = Calendar.getInstance();
		return "CUS" + this.generateCustId() + calendar.get(Calendar.YEAR);
	}

}
