package com.spengilley.mvptemplate.data;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.spengilley.MVPTemplate.preferences.PreferencesModule;
import com.spengilley.MVPTemplate.preferences.PreferencesWrapper;
import com.spengilley.MVPTemplate.resources.ResourceWrapper;
import com.spengilley.MVPTemplate.resources.ResourcesModule;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(
        includes = {
                PreferencesModule.class,
                ResourcesModule.class
        },
        complete = false,
        library = true
)
public class DataModule {


    /**
     * Provide SharedPreferences instance
     */
    @Provides
    @Singleton
    SharedPreferences provideSharedPreferences(Application app) {
        return app.getSharedPreferences("ngsw", Context.MODE_PRIVATE);
    }


    /**
     * Provide PreferencesWrapper implementation
     */
    @Provides
    @Singleton
    PreferencesWrapper providePreferencesWrapper(SharedPreferences prefs) {
        return new PreferencesWrapperImpl(prefs);
    }


    /**
     * Provide ResourceWrapper implementation
     */
    @Provides
    @Singleton
    ResourceWrapper provideResourceWrapper(Application app) {
        return new ResourceWrapperImpl(app.getApplicationContext());
    }


}
