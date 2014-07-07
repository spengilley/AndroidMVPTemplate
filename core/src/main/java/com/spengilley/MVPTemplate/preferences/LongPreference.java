package com.spengilley.MVPTemplate.preferences;


public class LongPreference {
    private PreferencesWrapper preferences;
    private String key;
    private long defaultValue;


    public LongPreference(PreferencesWrapper preferences, String key) {
        this(preferences, key, 0);
    }


    public LongPreference(PreferencesWrapper preferences, String key, long defaultValue) {
        this.preferences = preferences;
        this.key = key;
        this.defaultValue = defaultValue;
    }


    public long get() {
        return preferences.getLong(key, defaultValue);
    }


    public void set(long value) {
        preferences.putLong(key, value);
    }


    public boolean isSet(String key) {
        return preferences.contains(key);
    }


    public void delete(String key) {
        preferences.remove(key);
    }
}
