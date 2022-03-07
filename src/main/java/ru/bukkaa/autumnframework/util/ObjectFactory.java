package ru.bukkaa.autumnframework.util;

import lombok.Getter;
import lombok.SneakyThrows;
import ru.bukkaa.autumnframework.police.AngryRoomPoliceman;
import ru.bukkaa.autumnframework.police.Policeman;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings({"rawtypes", "unchecked"})
public class ObjectFactory {
    @Getter
    private static final ObjectFactory instance = new ObjectFactory();

    private final Config config;


    private ObjectFactory() {
        config = new JavaConfig("ru.bukkaa.autumnframework",
                                new HashMap<>(Map.of(Policeman.class, AngryRoomPoliceman.class)));
    }


    @SneakyThrows
    public <T> T createObject(Class type) {
        Class<? extends T> implClass = type;

        if (type.isInterface()) {
            implClass = config.getImplClass(type);
        }

        T instance = implClass.getDeclaredConstructor().newInstance();

        // todo set up bean

        return instance;
    }
}
