package com.spengilley.MVPTemplate.preferences;

@SuppressWarnings("UnusedDeclaration")
public class BooleanPreference {
    private PreferencesWrapper preferences;
    private String key;
    private boolean defaultValue;


    public BooleanPreference(PreferencesWrapper preferences, String key) {
        this(preferences, key, false);
    }


    public BooleanPreference(PreferencesWrapper preferences, String key, boolean defaultValue) {
        this.preferences = preferences;
        this.key = key;
        this.defaultValue = defaultValue;
    }


    public boolean get() {
        return preferences.getBoolean(key, defaultValue);
    }


    public void set(boolean value) {
        preferences.putBoolean(key, value);
    }


    public boolean isSet(String key) {
        return preferences.contains(key);
    }


    public void delete(String key) {
        preferences.remove(key);
    }
}
