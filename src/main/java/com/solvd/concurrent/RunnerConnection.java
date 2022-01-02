
package com.solvd.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

public class RunnerConnection {

	static final int MAX_TH = 5;
	private final static Logger LOG = Logger
			.getLogger(RunnerConnection.class.getName());
	private static final BConnectionPool CONNECTION_POOL = BConnectionPool
			.getInstance();

	public static void main(String[] args) {

		Runnable rb1 = new ThreadMssg("Inicialization").CONNECTION_POOL;
		Runnable rb2 = new ThreadMssg("Authorization");
		Runnable rb3 = new ThreadMssg("Info");
		Runnable rb4 = new ThreadMssg("Execute");
		Runnable rb5 = new ThreadMssg("close");

		ExecutorService pl = Executors.newFixedThreadPool(MAX_TH);

		pl.execute(rb1);
		pl.execute(rb2);
		pl.execute(rb3);
		pl.execute(rb4);
		pl.execute(rb5);

		pl.isShutdown();

	}

}
