package ru.bukkaa.autumnframework;

import lombok.SneakyThrows;

import static java.lang.String.format;

public class CoronaDesinfector {

    public void start(Room room) {
        // TODO: 06/03/2022 сообщить всем присутствующим в комнате о начале дезинфекции, попросить выйти
        // TODO: 06/03/2022 выгнать всех кто остался
        desinfect(room);
        // TODO: 06/03/2022 позвать всех обратно
    }

    @SneakyThrows
    public String desinfect(Room room) {
        System.out.printf("Начинается дезинфекция комнаты '%s'%n", room.getName());
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
announcer.announce(format("Начинаем дезинфекцию комнаты '%s', все вон!", room.getName()));
        policeman.expelEveryoneFromRoom(room);
        String message = desinfect(room);
        announcer.announce(message);
 */