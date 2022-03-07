package ru.bukkaa.autumnframework.desinfector;

import lombok.SneakyThrows;
import ru.bukkaa.autumnframework.announcer.Announcer;
import ru.bukkaa.autumnframework.announcer.ConsoleRoomAnnouncer;
import ru.bukkaa.autumnframework.place.Room;
import ru.bukkaa.autumnframework.police.Policeman;
import ru.bukkaa.autumnframework.police.RoomPoliceman;

import static java.lang.String.format;

public class CoronaRoomDesinfector {

    private Announcer announcer = new ConsoleRoomAnnouncer();
    private Policeman policeman = new RoomPoliceman();

    public void start(Room room) {
        announcer.announce(format("Начинаем дезинфекцию комнаты '%s', все вон!", room.getName()));
        policeman.expelEveryoneFrom(room);
        String message = desinfect(room);
        announcer.announce(message);
    }

    @SneakyThrows
    public String desinfect(Room room) {
        System.out.printf("CoronaRoomDesinfector: Начинается дезинфекция комнаты '%s'%n", room.getName());
        Thread.sleep(200);
        System.out.println("\tИдёт дезинфекция... 0%");
        Thread.sleep(200);
        System.out.println("\tИдёт дезинфекция... 20%");
        Thread.sleep(200);
        System.out.println("\tИдёт дезинфекция... 34%");
        Thread.sleep(200);
        System.out.println("\tИдёт дезинфекция... 61%");
        Thread.sleep(200);
        System.out.println("\tИдёт дезинфекция... 89%");
        Thread.sleep(200);
        System.out.println("\tИдёт дезинфекция... 100%");

        return format("Комната '%s' продезинфецирована!%n", room.getName());
    }
}
/*
private Announcer announcer = ObjectFactory.getInstance().createObject(Announcer.class);
    private Policeman policeman = ObjectFactory.getInstance().createObject(Policeman.class);
 */