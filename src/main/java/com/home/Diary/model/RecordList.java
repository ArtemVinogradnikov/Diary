package com.home.Diary.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RecordList {
	private List<Record> records;
	
	public RecordList() {
		records = new ArrayList<>();
	}
	
	public List<Record> getList() {
		return records;
	}
	
	public void addRecord(Record rec) {
		records.add(rec);
	}
	
	public void delete(Record rec) {
		records.remove(rec);
	}
	
	public Record getRecordByDate(Date date) {
		Record record;
		
		for(int i = 0; i < records.size(); i++) {
			
			record = records.get(i);
			
			if(record.getDate().equals(date)) {
				return record;
			}
			
		}
		
		return null;
	}
	
	public Record[] findRecords(String date, String title, String description) {
		Record record;
		List<Record> recordsList = new ArrayList<>();
		
		for(int i = 0; i < records.size(); i++) {
			record = records.get(i);
			
			if(record.getDate().toString().contains(date) && record.getTitle().contains(title) && record.getDescription().contains(description)) {
				recordsList.add(record);
			}
		}
		
		return recordsList.toArray(new Record[0]);
	}
	
	public void clear() {
		records.clear();
	}
}
