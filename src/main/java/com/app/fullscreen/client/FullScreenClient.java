package com.app.fullscreen.client;

import android.app.Activity;
import android.graphics.Bitmap;
import android.util.Log;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.app.fullscreen.mScreen.FullScreenSettings;

public class FullScreenClient extends WebChromeClient {
    public boolean isFullScreen = false;
    private CustomViewCallback callback = null;
    private String TAG= "fullscreenclient";
    public Activity activity;
    private WebView webView;
    private FullScreenSettings settings;

    public FullScreenClient(Activity activity, WebView webView){
        this.activity = activity;
        this.webView = webView;
        settings = new FullScreenSettings(this);
    }

    public FullScreenClient(Activity activity){
        this.activity = activity;
        settings = new FullScreenSettings(this);
    }

    public void register(WebView webView){
        this.webView = webView;
    }

    public void onShowCustomView(View view, CustomViewCallback callback){
        isFullScreen = true;
        this.callback = callback;
        settings.showFullScreen(view, callback);
        super.onShowCustomView(view,callback);
    }


    public void onHideCustomView() {
        isFullScreen = false;
        settings.hideFullScreen(webView);
        super.onHideCustomView();
    }

    public void exitFullScreen(){
        try{
            if (isFullScreen&&callback!=null){
                callback.onCustomViewHidden();
            }
        }catch (Exception e){
            Log.d(TAG,"unable to exit fullscreen");
        }
    }


    public Bitmap getDefaultVideoPoster() {
        return settings.videoBitmap();
    }
}
