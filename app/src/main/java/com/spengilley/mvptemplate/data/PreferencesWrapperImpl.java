package com.spengilley.mvptemplate.data;


import android.content.SharedPreferences;

import com.spengilley.MVPTemplate.preferences.PreferencesWrapper;

import javax.inject.Inject;

public class PreferencesWrapperImpl implements PreferencesWrapper {
    private SharedPreferences sharedPreferences;


    @Inject
    public PreferencesWrapperImpl(SharedPreferences sharedPreferences) {
        this.sharedPreferences = sharedPreferences;
    }


    private SharedPreferences.Editor getEditor() {
        return sharedPreferences.edit();
    }


    @Override
    public String getString(String key, String defaultValue) {
        return sharedPreferences.getString(key, defaultValue);
    }

    @Override
    public boolean contains(String key) {
        return sharedPreferences.contains(key);
    }

    @Override
    public void putString(String key, String value) {
        getEditor().putString(key, value).apply();
    }

    @Override
    public void remove(String key) {
        getEditor().remove(key).apply();
    }

    @Override
    public boolean getBoolean(String key, boolean defaultValue) {
        return sharedPreferences.getBoolean(key, defaultValue);
    }

    @Override
    public void putBoolean(String key, boolean value) {
        getEditor().putBoolean(key, value).apply();
    }

    @Override
    public int getInt(String key, int defaultValue) {
        return sharedPreferences.getInt(key, defaultValue);
    }

    @Override
    public void putInt(String key, int value) {
        getEditor().putInt(key, value).apply();
    }

    @Override
    public long getLong(String key, long defaultValue) {
        return sharedPreferences.getLong(key, defaultValue);
    }

    @Override
    public void putLong(String key, long value) {
        getEditor().putLong(key, value).apply();
    }


    @Override
    public float getFloat(String key, float defaultValue) {
        return sharedPreferences.getFloat(key, defaultValue);
    }

    @Override
    public void putFloat(String key, float value) {
        getEditor().putFloat(key, value).apply();
    }
}
