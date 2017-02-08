package io.kristal.firebasedemo.fragments;

import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;
import org.cobaltians.cobalt.fragments.CobaltFragment;
import org.cobaltians.cobalt.Cobalt;
import io.kristal.firebasedemo.R;



public class MainFragment extends CobaltFragment {

    private final String GETAPIKEY = "getApiKey";
    private final String APIKEY = "apiKey";
    protected final static String TAG = MainFragment.class.getSimpleName();


    @Override
    protected boolean onUnhandledCallback(String callback, JSONObject data) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    protected boolean onUnhandledEvent(String event, JSONObject data, String callback) {
        // TODO Auto-generated method stub
        if (event.equals(GETAPIKEY)){
            try{
                JSONObject infos = new JSONObject();
                infos.put(APIKEY, getString(R.string.API_KEY));
                sendCallback(callback, infos);
                return true;
            }
            catch (JSONException e){
                if (Cobalt.DEBUG) {
                    Log.e(TAG, "Unexpected error occurs during creating apiKey Data Object");
                    e.printStackTrace();
                }
            }
        }

        return false;
    }

    @Override
    protected boolean onUnhandledMessage(JSONObject message) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    protected void onPullToRefreshRefreshed() {
        // TODO Auto-generated method stub
    }

    @Override
    protected void onInfiniteScrollRefreshed() {
        // TODO Auto-generated method stub
    }

}
