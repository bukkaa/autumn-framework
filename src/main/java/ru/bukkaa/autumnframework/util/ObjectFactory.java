package ru.bukkaa.autumnframework.util;

import lombok.Getter;
import lombok.SneakyThrows;

@SuppressWarnings({"rawtypes", "unchecked"})
public class ObjectFactory {
    @Getter
    private static final ObjectFactory instance = new ObjectFactory();

    private final Config config = new JavaConfig("ru.bukkaa.autumnframework");


    private ObjectFactory() { }


    @SneakyThrows
    public <T> T createObject(Class type) {
        Class<? extends T> implClass = type;

        if (type.isInterface()) {
            implClass = config.getImplClass(type);
        }

        return implClass.getDeclaredConstructor().newInstance();
    }
}
