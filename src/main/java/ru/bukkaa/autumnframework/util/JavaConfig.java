package ru.bukkaa.autumnframework.util;

import org.reflections.Reflections;

import java.util.Map;
import java.util.Set;

@SuppressWarnings({"rawtypes", "unchecked"})
public class JavaConfig implements Config {

    private final Reflections scanner;
    private final Map<Class, Class> ifc2ImplClass;

    public JavaConfig(String packageToScan, Map<Class, Class> ifc2ImplClass) {
        this.scanner = new Reflections(packageToScan);
        this.ifc2ImplClass = ifc2ImplClass;
    }


    @Override
    public <T> Class<? extends T> getImplClass(Class<T> ifc) {
        return ifc2ImplClass.computeIfAbsent(ifc, aClass -> {
            Set<Class<? extends T>> classes = scanner.getSubTypesOf(ifc);

            if (classes.isEmpty()) throw new RuntimeException("No implementations found for " + ifc + ". Please update your configuration");
            if (classes.size() > 1) throw new RuntimeException(ifc + " has more than 1 implementations. Please update your configuration");

            return classes.iterator().next();
        });
    }
}
