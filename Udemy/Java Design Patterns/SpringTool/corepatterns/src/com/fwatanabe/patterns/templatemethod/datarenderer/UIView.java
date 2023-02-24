package com.fwatanabe.patterns.templatemethod.datarenderer;

public class UIView {

	public static void main(String[] args) {
		DataRenderer renderer = new CsvDataRenderer();
		renderer.render();
	}

}
