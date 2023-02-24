package com.fwatanabe.patterns.templatemethod.datarenderer;

public class CsvDataRenderer extends DataRenderer {

	@Override
	public String readData() {
		return "CSV data";
	}

	@Override
	public String processData(String data) {
		return "Processed " + data;
	}

}
