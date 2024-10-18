package com.eventsystem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EventService eventService = new EventService();

        while (true) {
            System.out.println("1. Add Event");
            System.out.println("2. View Events");
            System.out.println("3. Delete Event");
            System.out.println("4. Update Event");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1: {
                    eventService.addEvent();
                    break;
                }
                case 2: {
                    eventService.listEvents();
                    break;
                }
                case 3: {
                    eventService.deleteEvent();
                    break;
                }
                case 4: {
                    eventService.updateEvent();
                    break;
                }
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid Choice. Please Try Again...");
            }
        }
    }
}
