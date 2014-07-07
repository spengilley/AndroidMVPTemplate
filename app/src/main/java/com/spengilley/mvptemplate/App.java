package com.spengilley.mvptemplate;

import android.app.Application;
import android.content.Context;

import dagger.ObjectGraph;
import timber.log.Timber;


public class App extends Application {
    private ObjectGraph objectGraph;


    public static App get(Context context) {
        return (App) context.getApplicationContext();
    }


    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    /**
     * Build object graph on creation so that objects are available
     */
    @Override
    public void onCreate() {
        super.onCreate();
        buildObjectGraphAndInject();

        // Timber logging for debug
        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());

        } else {
            // Do some release logging here
        }
    }


    /**
     * Used by Activities to create a scoped graph
     */
    public ObjectGraph createScopedGraph(Object... modules) {
        return objectGraph.plus(modules);
    }


    public void buildObjectGraphAndInject() {
        objectGraph = ObjectGraph.create(Modules.list(this));
        inject(this);
    }


    public void inject(Object object) {

        objectGraph.inject(object);
    }


    public ObjectGraph getApplicationGraph() {

        return objectGraph;
    }
}
