package com.spengilley.mvptemplate.ui.common;

import android.app.Activity;
import android.os.Bundle;
import com.spengilley.mvptemplate.App;
import java.util.List;
import dagger.ObjectGraph;

/**
 * Base Activity which injects itself into Object Graph
 * Any Activity that wants access to Object Graph should override this
 */
public abstract class BaseActivity extends Activity {
    private ObjectGraph activityGraph;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityGraph = ((App) getApplication()).createScopedGraph(getModules().toArray());
        activityGraph.inject(this);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        activityGraph = null;
    }

    protected abstract List<Object> getModules();

    public void inject(Object object) {
        activityGraph.inject(object);
    }
}
