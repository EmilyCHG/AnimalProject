
package com.solvd.concurrent;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadMssg implements Runnable {

	private final static Logger LOG = Logger
			.getLogger(ThreadMssg.class.getName());

	public Runnable CONNECTION_POOL;

	public String taskName;

	public ThreadMssg(String tsk) {
		taskName = tsk;
	}

	@Override
	public void run() {

		try {
			for (int i = 0; i < 1; i++) {
				if (i == 0) {
					Date dt = new Date();
					SimpleDateFormat sdf = new SimpleDateFormat(" hh:mm:ss ");
					LOG.log(Level.INFO,
							" Inicialization time for the task name:  "
									+ taskName + sdf.format(dt));
				} else {
					Date dt = new Date();
					SimpleDateFormat sdf = new SimpleDateFormat(" hh:mm:ss ");
					LOG.log(Level.INFO,
							" Time of execution for the task name:  " + taskName
									+ sdf.format(dt));
				}

				Thread.sleep(2000);
			}
			LOG.log(Level.INFO, " is complete ", taskName);
		} catch (InterruptedException ie) {
			{
				ie.printStackTrace();
			}
		}

	}

}
