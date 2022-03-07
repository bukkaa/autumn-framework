package ru.bukkaa.autumnframework.util;

public interface Config {

    <T> Class<? extends T> getImplClass(Class<T> type);
}
