package io.kristal.firebasedemo.fragments;

import org.json.JSONObject;
import org.cobaltians.cobalt.fragments.CobaltFragment;



public class MainFragment extends CobaltFragment {


    @Override
    protected boolean onUnhandledCallback(String callback, JSONObject data) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    protected boolean onUnhandledEvent(String event, JSONObject data, String callback) {
        // TODO Auto-generated method stub
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
