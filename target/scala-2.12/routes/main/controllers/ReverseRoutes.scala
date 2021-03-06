
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/dinesh/Documents/devlopment/apidevops/apidevops-git/apidevops/conf/routes
// @DATE:Sun Oct 15 18:37:42 IST 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def addUser(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "adduser")
    }
  
    // @LINE:15
    def createuser(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "createuser")
    }
  
    // @LINE:7
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:19
    def user(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user")
    }
  
  }

  // @LINE:12
  class ReverseScalaEventSourceController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "scala/eventSource")
    }
  
    // @LINE:13
    def streamClock(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "scala/eventSource/liveClock")
    }
  
  }

  // @LINE:22
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def at(file:String): Call = {
      implicit val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:9
  class ReverseScalaCometController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "scala/comet")
    }
  
    // @LINE:10
    def streamClock(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "scala/comet/liveClock")
    }
  
  }


}
