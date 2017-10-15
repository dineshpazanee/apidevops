
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/dinesh/Documents/devlopment/apidevops/apidevops-git/apidevops/conf/routes
// @DATE:Sun Oct 15 22:10:20 IST 2017

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers.javascript {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def addUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "adduser"})
        }
      """
    )
  
    // @LINE:23
    def demo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.demo",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "demo"})
        }
      """
    )
  
    // @LINE:19
    def user: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.user",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user"})
        }
      """
    )
  
    // @LINE:25
    def register: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.register",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
        }
      """
    )
  
    // @LINE:15
    def createuser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.createuser",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "createuser"})
        }
      """
    )
  
    // @LINE:7
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:21
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:12
  class ReverseScalaEventSourceController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ScalaEventSourceController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "scala/eventSource"})
        }
      """
    )
  
    // @LINE:13
    def streamClock: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ScalaEventSourceController.streamClock",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "scala/eventSource/liveClock"})
        }
      """
    )
  
  }

  // @LINE:29
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:9
  class ReverseScalaCometController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ScalaCometController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "scala/comet"})
        }
      """
    )
  
    // @LINE:10
    def streamClock: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ScalaCometController.streamClock",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "scala/comet/liveClock"})
        }
      """
    )
  
  }


}
