package io.kristal.firebasedemo;

import io.kristal.fcmplugin.FcmPlugin;
import android.app.Application;


import org.cobaltians.cobalt.Cobalt;

/**
 * Created by antoine on 06/02/2017.
 */

public class FirebaseDemo extends Application {

    public void onCreate(){
        super.onCreate();
        Cobalt.getInstance(this).setResourcePath("common/");
        FcmPlugin.getInstance(Cobalt.getAppContext());
    }

}
