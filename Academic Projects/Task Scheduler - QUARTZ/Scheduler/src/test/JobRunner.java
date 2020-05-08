package test;

import java.util.Date;

import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SimpleTrigger;
import org.quartz.impl.StdSchedulerFactory;

public class JobRunner {

	public static void main(String[] args) {
		
		
		JobDetail job = new JobDetail();
    	job.setName("dummyJobName");
    	job.setJobClass(TestJob.class);
    	
    	//configure the scheduler time
    	SimpleTrigger trigger = new SimpleTrigger();
    	trigger.setName("tester");
    	trigger.setStartTime(new Date(System.currentTimeMillis() + 1000));
    	trigger.setRepeatCount(SimpleTrigger.REPEAT_INDEFINITELY);
    	trigger.setRepeatInterval(3000);
    	
    	
    	
    	try {
    		
    		
    		//schedule it
        	Scheduler scheduler = new StdSchedulerFactory().getScheduler();
        	scheduler.start();
        	scheduler.scheduleJob(job, trigger);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
