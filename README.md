<b><h2>Powerful library to handle full-screen mode in WebView</h2></b>
<br>
The implementation is very easy.
* Just initialize with `Context` and `Activity`
  ```java
  FullScreenClient fullScreenClient = new FullScreenClient(this,webView);
  ```
  
* or, if you want to add `WebView` after initializing,  
  ```java
  FullScreenClient fullScreenClient = new FullScreenClient(this);
  fullScreenClient.register(webView); //add or change WebView
  ```
* Set this for automation,
  ```java
     webView.setWebChromeClient(new WebChromeClient() {
            @Override
            public void onShowCustomView(View view, CustomViewCallback callback) {
                fullScreenClient.onShowCustomView(view, callback);
            }

            @Override
            public void onHideCustomView() {
                fullScreenClient.onHideCustomView();
            }

            @Nullable
            @Override
            public Bitmap getDefaultVideoPoster() {
                return fullScreenClient.getDefaultVideoPoster();
            }
        });```
