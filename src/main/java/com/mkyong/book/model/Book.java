package com.mkyong.book.model;

import java.sql.Timestamp;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "ryan_v2")
public class Book {

    @Id
    private String id;

    private String ticketNumber;

    private Timestamp startdate;
    
    private Timestamp enddate;
    
    private double spentTime;
    
    private boolean meetSLA;

    public Book() {
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTicketNumber() {
		return ticketNumber;
	}

	public void setTicketNumber(String ticketNumber) {
		this.ticketNumber = ticketNumber;
	}

	public Timestamp getStartdate() {
		return startdate;
	}

	public void setStartdate(Timestamp startdate) {
		this.startdate = startdate;
	}

	public Timestamp getEnddate() {
		return enddate;
	}

	public void setEnddate(Timestamp enddate) {
		this.enddate = enddate;
	}

	public double getSpentTime() {
		return spentTime;
	}

	public void setSpentTime(double spentTime) {
		this.spentTime = spentTime;
	}

	public boolean isMeetSLA() {
		return meetSLA;
	}

	public void setMeetSLA(boolean meetSLA) {
		this.meetSLA = meetSLA;
	}

}
