package org.inlakeshsoft.jdk17.features;

import org.inlakeshsoft.jdk17.features.record.Record;

public class RecordFeature {
	
	private void testingRecord() {
		Record record = new Record(1, "Record Name");
		System.out.println(record.id());
		System.out.println(record.name());
	}
	
	public static void main(String[] args) {
		RecordFeature recordFeature = new RecordFeature();
		recordFeature.testingRecord();
	}
}
