package com.eventsystem;

import java.util.Date;

public class Event {
    private String eventName;
    private Date eventDate;

    public Event(String eventName, Date eventDate) {
        this.eventName = eventName;
        this.eventDate = eventDate;
    }

    public String getEventName() {
        return eventName; // Corrected: return eventName instead of EventName
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    @Override
    public String toString() {
        return "Event [eventName=" + eventName + ", eventDate=" + eventDate + "]";
    }
}
