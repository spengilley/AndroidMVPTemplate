package com.spengilley.MVPTemplate.preferences;


public interface PreferencesWrapper {
    String getString(String key, String defaultValue);

    void putString(String key, String value);

    boolean contains(String key);

    void remove(String key);

    boolean getBoolean(String key, boolean defaultValue);

    void putBoolean(String key, boolean value);

    int getInt(String key, int defaultValue);

    void putInt(String key, int value);

    long getLong(String key, long defaultValue);

    void putLong(String key, long value);

    float getFloat(String key, float defaultValue);

    void putFloat(String key, float value);
}
