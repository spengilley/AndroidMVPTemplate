package com.spengilley.MVPTemplate.preferences;

@SuppressWarnings("UnusedDeclaration")
public class StringPreference {
    private PreferencesWrapper preferences;
    private String key;
    private String defaultValue;


    public StringPreference(PreferencesWrapper preferences, String key) {
        this(preferences, key, null);
    }


    public StringPreference(PreferencesWrapper preferences, String key, String defaultValue) {
        this.preferences = preferences;
        this.key = key;
        this.defaultValue = defaultValue;
    }


    public String get() {
        return preferences.getString(key, defaultValue);
    }


    public void set(String value) {
        preferences.putString(key, value);
    }


    public boolean isSet(String key) {
        return preferences.contains(key);
    }


    public void delete(String key) {
        preferences.remove(key);
    }
}
