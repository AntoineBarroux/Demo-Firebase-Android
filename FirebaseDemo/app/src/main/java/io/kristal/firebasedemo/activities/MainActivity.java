package io.kristal.firebasedemo.activities;

import android.util.Log;

import org.cobaltians.cobalt.Cobalt;
import org.cobaltians.cobalt.activities.CobaltActivity;
import org.cobaltians.cobalt.fragments.CobaltFragment;
import io.kristal.firebasedemo.fragments.MainFragment;



public class MainActivity extends CobaltActivity {

    protected final static String TAG = MainActivity.class.getSimpleName();

    public MainActivity(){
        super();
    }

    protected CobaltFragment getFragment(){
        return Cobalt.getInstance(this).getFragmentForController(MainFragment.class, "default", "index.html");
    }
}
