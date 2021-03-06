package com.toddway.shelf.storage;


import java.util.List;

public interface Storage {

    <T> T get(String key, Class<T> type);

    <T> void put(String key, T value);

    boolean delete(String key);

    boolean contains(String key);

    long lastModified(String key);

    /**
     * @deprecated use defaultMaxAge instead
     */
    @Deprecated
    long defaultLifetime();

    long defaultMaxAge();

    List<String> keys(String startsWith);
}
