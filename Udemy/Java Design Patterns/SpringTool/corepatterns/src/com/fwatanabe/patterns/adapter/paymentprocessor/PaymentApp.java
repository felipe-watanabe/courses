package com.fwatanabe.patterns.adapter.paymentprocessor;

import java.math.BigDecimal;

public class PaymentApp {

	public static void main(String[] args) {
		PaymentAdapter adapter = new PaymentAdapter();
		adapter.pay(BigDecimal.TEN);
	}
}
