package com.fwatanabe.patterns.adapter.paymentprocessor;

import java.math.BigDecimal;

public class PaymentAdapter {
	
	private final BigDecimal dollarPrice = BigDecimal.valueOf(5.163);
	
	public void pay(BigDecimal real) {
		PaymentProcessor processor = new PaymentProcessorImpl();
		processor.pay(real.multiply(dollarPrice).setScale(2));
	}
}
