package ru.bukkaa.autumnframework.announcer;

public class ConsoleRoomAnnouncer implements Announcer {

    @Override
    public void announce(String message) {
        System.out.println("ConsoleRoomAnnouncer: " + message);
    }
}
