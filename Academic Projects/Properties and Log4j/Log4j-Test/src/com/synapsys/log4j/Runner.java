package com.synapsys.log4j;

import org.apache.log4j.Logger;

public class Runner {

	public static void main(String[] args) {
		
		final Logger logger = Logger.getLogger(Runner.class);

		//logs a debug message
		if(logger.isDebugEnabled()){
		    logger.debug("This is debug");
		}
		
	}

}
