package com.eventsystem;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class EventService {

    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Event> eventList = new ArrayList<>();

    // Method to add an event
    public void addEvent() {
        System.out.println("Enter Event Name: ");
        String eventName = scanner.nextLine();

        System.out.println("Enter Event Date (format: YYYY-MM-DD): ");
        String eventDateString = scanner.nextLine();
        Date eventDate = java.sql.Date.valueOf(eventDateString); // Assuming proper date format

        Event event = new Event(eventName, eventDate);
        eventList.add(event);
        System.out.println("Event added successfully.");
    }

    // Method to list all events
    public void listEvents() {
        if (eventList.isEmpty()) {
            System.out.println("No events found.");
        } else {
            for (Event event : eventList) {
                System.out.println(event);
            }
        }
    }

    // Method to delete an event
    public void deleteEvent() {
        System.out.println("Enter Event Name to delete: ");
        String eventName = scanner.nextLine();

        Event event = findEventByName(eventName);
        if (eventList.remove(event)) {
            System.out.println("Event deleted successfully.");
        } else {
            System.out.println("Event not found, deletion failed.");
        }
    }

    // Private method to find an event by name
    private Event findEventByName(String eventName) {
        for (Event event : eventList) {
            if (event.getEventName().equalsIgnoreCase(eventName)) {
                return event;
            }
        }
        return null;
    }

    // Method to update an event
    public void updateEvent() {
        System.out.println("Enter Event Name to update: ");
        String eventName = scanner.nextLine();

        Event event = findEventByName(eventName);
        if (event != null) {
            System.out.println("Enter new Event Name: ");
            String newEventName = scanner.nextLine();

            System.out.println("Enter new Event Date (format: YYYY-MM-DD): ");
            String newEventDateString = scanner.nextLine();
            Date newEventDate = java.sql.Date.valueOf(newEventDateString); // Assuming proper date format

            event.setEventName(newEventName);
            event.setEventDate(newEventDate);
            System.out.println("Event updated successfully.");
        } else {
            System.out.println("Event not found, update failed.");
        }
    }
}
