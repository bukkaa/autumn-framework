package ru.bukkaa.autumnframework.police;

import ru.bukkaa.autumnframework.place.Room;

public class AngryRoomPoliceman implements Policeman<Room> {

    @Override
    public void expelEveryoneFrom(Room room) {
        System.out.println("AngryRoomPoliceman: а ну-ка все валите из '" + room.getName() + "'!!!");
    }
}
