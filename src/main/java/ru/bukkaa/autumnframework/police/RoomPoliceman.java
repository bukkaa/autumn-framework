package ru.bukkaa.autumnframework.police;

import ru.bukkaa.autumnframework.place.Room;

public class RoomPoliceman implements Policeman<Room> {

    @Override
    public void expelEveryoneFrom(Room room) {
        System.out.println("RoomPoliceman: пожалуйста, покиньте комнату '" + room.getName() + "'");
    }
}
