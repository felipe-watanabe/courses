package com.fwatanabe.patterns.adapter.paymentprocessor;

import java.math.BigDecimal;

public class PaymentProcessorImpl implements PaymentProcessor {

	public void pay(BigDecimal dollars) {
		System.out.println("Paid US$ " + dollars);
	}
}
