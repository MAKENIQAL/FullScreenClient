<b><h2>Powerful library to handle full-screen mode in WebView</h2></b>
<br>
The implementation is very easy.
* Just initialize with `Context` and `Activity`
  ```sh
  FullScreenClient fullScreenClient = new FullScreenClient(this,webView);
  ```
  
* if you want to add `WebView` after initializing  
  ```sh
  FullScreenClient fullScreenClient = new FullScreenClient(this);
  fullScreenClient.register(webView);
  ```
