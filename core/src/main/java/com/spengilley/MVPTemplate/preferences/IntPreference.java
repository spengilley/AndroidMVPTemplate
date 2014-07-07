package com.spengilley.MVPTemplate.preferences;


public class IntPreference {
    private PreferencesWrapper preferences;
    private String key;
    private int defaultValue;


    public IntPreference(PreferencesWrapper preferences, String key) {
        this(preferences, key, 0);
    }


    public IntPreference(PreferencesWrapper preferences, String key, int defaultValue) {
        this.preferences = preferences;
        this.key = key;
        this.defaultValue = defaultValue;
    }


    public int get() {
        return preferences.getInt(key, defaultValue);
    }


    public void set(int value) {
        preferences.putInt(key, value);
    }


    public boolean isSet(String key) {
        return preferences.contains(key);
    }


    public void delete(String key) {
        preferences.remove(key);
    }
}
