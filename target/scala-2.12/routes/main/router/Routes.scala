
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/dinesh/Documents/devlopment/apidevops/play-scala-streaming-example-2.6.x/conf/routes
// @DATE:Sun Oct 08 20:03:27 IST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  HomeController_0: controllers.HomeController,
  // @LINE:9
  ScalaCometController_3: controllers.ScalaCometController,
  // @LINE:12
  ScalaEventSourceController_2: controllers.ScalaEventSourceController,
  // @LINE:20
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    HomeController_0: controllers.HomeController,
    // @LINE:9
    ScalaCometController_3: controllers.ScalaCometController,
    // @LINE:12
    ScalaEventSourceController_2: controllers.ScalaEventSourceController,
    // @LINE:20
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, ScalaCometController_3, ScalaEventSourceController_2, Assets_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, ScalaCometController_3, ScalaEventSourceController_2, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """scala/comet""", """controllers.ScalaCometController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """scala/comet/liveClock""", """controllers.ScalaCometController.streamClock()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """scala/eventSource""", """controllers.ScalaEventSourceController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """scala/eventSource/liveClock""", """controllers.ScalaEventSourceController.streamClock()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """createuser""", """controllers.HomeController.createuser()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adduser""", """controllers.HomeController.addUser()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_ScalaCometController_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("scala/comet")))
  )
  private[this] lazy val controllers_ScalaCometController_index1_invoker = createInvoker(
    ScalaCometController_3.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ScalaCometController",
      "index",
      Nil,
      "GET",
      this.prefix + """scala/comet""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_ScalaCometController_streamClock2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("scala/comet/liveClock")))
  )
  private[this] lazy val controllers_ScalaCometController_streamClock2_invoker = createInvoker(
    ScalaCometController_3.streamClock(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ScalaCometController",
      "streamClock",
      Nil,
      "GET",
      this.prefix + """scala/comet/liveClock""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_ScalaEventSourceController_index3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("scala/eventSource")))
  )
  private[this] lazy val controllers_ScalaEventSourceController_index3_invoker = createInvoker(
    ScalaEventSourceController_2.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ScalaEventSourceController",
      "index",
      Nil,
      "GET",
      this.prefix + """scala/eventSource""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_ScalaEventSourceController_streamClock4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("scala/eventSource/liveClock")))
  )
  private[this] lazy val controllers_ScalaEventSourceController_streamClock4_invoker = createInvoker(
    ScalaEventSourceController_2.streamClock(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ScalaEventSourceController",
      "streamClock",
      Nil,
      "GET",
      this.prefix + """scala/eventSource/liveClock""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HomeController_createuser5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("createuser")))
  )
  private[this] lazy val controllers_HomeController_createuser5_invoker = createInvoker(
    HomeController_0.createuser(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "createuser",
      Nil,
      "GET",
      this.prefix + """createuser""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_HomeController_addUser6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adduser")))
  )
  private[this] lazy val controllers_HomeController_addUser6_invoker = createInvoker(
    HomeController_0.addUser(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addUser",
      Nil,
      "POST",
      this.prefix + """adduser""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_Assets_at7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at7_invoker = createInvoker(
    Assets_1.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index())
      }
  
    // @LINE:9
    case controllers_ScalaCometController_index1_route(params@_) =>
      call { 
        controllers_ScalaCometController_index1_invoker.call(ScalaCometController_3.index())
      }
  
    // @LINE:10
    case controllers_ScalaCometController_streamClock2_route(params@_) =>
      call { 
        controllers_ScalaCometController_streamClock2_invoker.call(ScalaCometController_3.streamClock())
      }
  
    // @LINE:12
    case controllers_ScalaEventSourceController_index3_route(params@_) =>
      call { 
        controllers_ScalaEventSourceController_index3_invoker.call(ScalaEventSourceController_2.index())
      }
  
    // @LINE:13
    case controllers_ScalaEventSourceController_streamClock4_route(params@_) =>
      call { 
        controllers_ScalaEventSourceController_streamClock4_invoker.call(ScalaEventSourceController_2.streamClock())
      }
  
    // @LINE:15
    case controllers_HomeController_createuser5_route(params@_) =>
      call { 
        controllers_HomeController_createuser5_invoker.call(HomeController_0.createuser())
      }
  
    // @LINE:17
    case controllers_HomeController_addUser6_route(params@_) =>
      call { 
        controllers_HomeController_addUser6_invoker.call(HomeController_0.addUser())
      }
  
    // @LINE:20
    case controllers_Assets_at7_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at7_invoker.call(Assets_1.at(path, file))
      }
  }
}
