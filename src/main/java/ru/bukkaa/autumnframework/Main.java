package ru.bukkaa.autumnframework;

import ru.bukkaa.autumnframework.desinfector.CoronaRoomDesinfector;
import ru.bukkaa.autumnframework.place.Room;

public class Main {

    public static void main(String[] args) {
        putEmptyLinesBefore();

        CoronaRoomDesinfector desinfector = new CoronaRoomDesinfector();
        desinfector.start(new Room("Гостиная"));
    }

    private static void putEmptyLinesBefore() {
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
