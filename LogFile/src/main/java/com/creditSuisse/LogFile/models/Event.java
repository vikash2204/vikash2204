package com.creditSuisse.LogFile.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@Table(name="Events")
@AllArgsConstructor

public class Event {

	@Id
	private String eventId;
	  private long timestampDifference;
	  private String type;
	  private String host;
	  private boolean longEventFlag;
	  

	public Event(String eventId, long timestampDifference, String type, String host, boolean longEventFlag) {
		super();
		this.eventId = eventId;
		this.timestampDifference = timestampDifference;
		this.type = type;
		this.host = host;
		this.longEventFlag = longEventFlag;
	}

	public Event() {
		// TODO Auto-generated constructor stub
		super();
	}

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public long getTimestampDifference() {
		return timestampDifference;
	}

	public void setTimestampDifference(long timestampDifference) {
		this.timestampDifference = timestampDifference;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public boolean isLongEventFlag() {
		return longEventFlag;
	}

	public void setLongEventFlag(boolean longEventFlag) {
		this.longEventFlag = longEventFlag;
	}
	  
}
