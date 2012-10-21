function goGBrowserTest () {
};(function() { 
  var _proto = goGBrowserTest.prototype;
  _proto.getLocalHost = function(){
     var num = gBrowser.browsers.length;
     var _ret = false;
     for (var i = 0; i < num; i++) {
       var b = gBrowser.getBrowserAtIndex(i);
       try {
         Components.utils.reportError(b.currentURI.spec); // 開いている全てのタブの URL をコンソールへ出力
       } catch(e) {
         Components.utils.reportError(e);
         return _ret;
       }
     }
     _ret = true;
     return _ret;
  };
})();