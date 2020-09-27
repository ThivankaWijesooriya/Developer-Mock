package com.onezero.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.onezero.model.Survey;

@Repository
public class SurveyDaoImpl implements SurveyDao {

	@Autowired
	@Qualifier("jdbcTemplate2")
	JdbcTemplate jdbcTemplate;

	
	@Override
	public void createSurvey(Survey survey) {

		try {

			SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("sp_insertsurvey");

			MapSqlParameterSource in = new MapSqlParameterSource();

			in.addValue("lastinspecteduserid", survey.getUser().getUsername());
			in.addValue("lastinspectedusername", survey.getUser().getName());
			in.addValue("machineScreenCondition", survey.getMachineScreenCondition());
			in.addValue("machineKeyboardCondition", survey.getMachineKeyboardCondition());
			in.addValue("machineFaciaCondition", survey.getMachineFaciaCondition());
			in.addValue("machineBodyCondition", survey.getMachineBodyCondition());
			in.addValue("cubicleOutterAppearance", survey.getCubicleOutterAppearance());
			in.addValue("cubicleInnerAppearance", survey.getCubicleInnerAppearance());
			in.addValue("cubicleWaterleakage", survey.getCubicleWaterleakage());
			in.addValue("brandingSignboardAppearance", survey.getBrandingSignboardAppearance());
			in.addValue("brandingInsideCubicle", survey.getBrandingInsideCubicle());
			in.addValue("lightingSignboardAppearance", survey.getLightingSignboardAppearance());
			in.addValue("lightingInsideCubicle", survey.getLightingInsideCubicle());
			in.addValue("ventilation", survey.getVentilation());
			in.addValue("atmStatus", survey.getAtmStatus());
			in.addValue("otherComments", survey.getOtherComments());
			in.addValue("deviceid", survey.getAtm().getId());
			in.addValue("atmname", survey.getAtm().getLocation());
			in.addValue("atmcity", survey.getAtm().getCity());
			in.addValue("inspecteddate", survey.getInspectedDate());
			in.addValue("gpslocation", survey.getGpslocation());

			jdbcCall.execute(in);

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
