package com.fwatanabe.patterns.singleton.dateutil;

import java.io.Serializable;

public class DateUtil implements Serializable, Cloneable {

//	private static DateUtil instance = new DateUtil(); // Eager initialization. Recommended if there will be at least one use

	// Alternative initialization. Static block. Executed when class is loaded into
	// memory
//	static {
//		instance = new DateUtil();
//	}

	private static final long serialVersionUID = 1L;

	private static volatile DateUtil instance; // volatile -> avoid issues in multi threading

	private DateUtil() {
	}

//	public static synchronized DateUtil getInstance() { // THREAD SAFE method
	public static DateUtil getInstance() {

		if (instance == null) {
			synchronized (DateUtil.class) { // thread safe block - expensive process

				if (instance == null) // Lazy initialization. Recommended
					instance = new DateUtil();
			}
		}
		return instance;
	}

	protected Object readResolve() {
		return instance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}
