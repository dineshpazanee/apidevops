
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/dinesh/Documents/devlopment/apidevops/play-scala-streaming-example-2.6.x/conf/routes
// @DATE:Sun Oct 08 20:03:27 IST 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseScalaEventSourceController ScalaEventSourceController = new controllers.ReverseScalaEventSourceController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseScalaCometController ScalaCometController = new controllers.ReverseScalaCometController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseScalaEventSourceController ScalaEventSourceController = new controllers.javascript.ReverseScalaEventSourceController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseScalaCometController ScalaCometController = new controllers.javascript.ReverseScalaCometController(RoutesPrefix.byNamePrefix());
  }

}
