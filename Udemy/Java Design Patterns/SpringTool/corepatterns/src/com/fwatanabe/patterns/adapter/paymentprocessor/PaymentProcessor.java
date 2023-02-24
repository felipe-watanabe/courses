package com.fwatanabe.patterns.adapter.paymentprocessor;

import java.math.BigDecimal;

public interface PaymentProcessor {

	public void pay(BigDecimal dollars);
	
}
