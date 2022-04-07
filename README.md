<b><h2>Powerful library to handle full-screen mode in WebView</h2></b>
<br>
The implementation is very easy.
Just initialize this,
```FullScreenClient fullScreenClient = new FullScreenClient(this,webView);```
or if you want to add WebView after initializing
```FullScreenClient fullScreenClient = new FullScreenClient(this);
        fullScreenClient.register(webView);```
