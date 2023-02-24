package com.fwatanabe.patterns.templatemethod.datarenderer;

public class XmlDataRenderer extends DataRenderer {

	@Override
	public String readData() {
		return "XML data";
	}

	@Override
	public String processData(String data) {
		return "Processed " + data;
	}

}
