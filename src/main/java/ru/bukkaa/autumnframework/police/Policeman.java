package ru.bukkaa.autumnframework.police;

import ru.bukkaa.autumnframework.place.Place;

public interface Policeman<T extends Place> {

    void expelEveryoneFrom(T place);
}
