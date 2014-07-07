package com.spengilley.MVPTemplate.preferences;


public class FloatPreference {
    private PreferencesWrapper preferences;
    private String key;
    private float defaultValue;


    public FloatPreference(PreferencesWrapper preferences, String key) {
        this(preferences, key, 0.0f);
    }


    public FloatPreference(PreferencesWrapper preferences, String key, float defaultValue) {
        this.preferences = preferences;
        this.key = key;
        this.defaultValue = defaultValue;
    }


    public float get() {
        return preferences.getFloat(key, defaultValue);
    }


    public void set(float value) {
        preferences.putFloat(key, value);
    }


    public boolean isSet(String key) {
        return preferences.contains(key);
    }


    public void delete(String key) {
        preferences.remove(key);
    }
}
