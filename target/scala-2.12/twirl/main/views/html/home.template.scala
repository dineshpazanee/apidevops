
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object home extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""()
<!DOCTYPE html>
<html lang="en" data-textdirection="ltr" class="loading">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimal-ui">
    <meta name="author" content="dinesh pazani">
    <title>Apidevops Cloud platform tool</title>
    <link rel="apple-touch-icon" sizes="60x60" href='"""),_display_(/*10.55*/routes/*10.61*/.Assets.at("/app-assets/images/ico/apple-icon-60.png")),format.raw/*10.115*/("""'>
    <link rel="apple-touch-icon" sizes="76x76" href='"""),_display_(/*11.55*/routes/*11.61*/.Assets.at("/app-assets/images/ico/apple-icon-76.png")),format.raw/*11.115*/("""'>
    <link rel="apple-touch-icon" sizes="120x120" href='"""),_display_(/*12.57*/routes/*12.63*/.Assets.at("/app-assets/images/ico/apple-icon-120.png")),format.raw/*12.118*/("""'>
    <link rel="apple-touch-icon" sizes="152x152" href='"""),_display_(/*13.57*/routes/*13.63*/.Assets.at("/app-assets/images/ico/apple-icon-152.png")),format.raw/*13.118*/("""'>
    <link rel="shortcut icon" type="image/x-icon" href='"""),_display_(/*14.58*/routes/*14.64*/.Assets.at("/app-assets/images/ico/favicon.ico")),format.raw/*14.112*/("""'>
    <link rel="shortcut icon" type="image/png" href='"""),_display_(/*15.55*/routes/*15.61*/.Assets.at("/app-assets/images/ico/favicon-32.png")),format.raw/*15.112*/("""'>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*16.50*/routes/*16.56*/.Assets.at("stylesheets/main.css")),format.raw/*16.90*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*17.55*/routes/*17.61*/.Assets.at("images/favicon.png")),format.raw/*17.93*/("""">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-touch-fullscreen" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="default">
    <!-- BEGIN VENDOR CSS-->
    <link rel="stylesheet" type="text/css" href='"""),_display_(/*22.51*/routes/*22.57*/.Assets.at("/app-assets/css/bootstrap.css")),format.raw/*22.100*/("""'>
    <!-- font icons-->
    <link rel="stylesheet" type="text/css" href='"""),_display_(/*24.51*/routes/*24.57*/.Assets.at("/app-assets/fonts/icomoon.css")),format.raw/*24.100*/("""'>
    <link rel="stylesheet" type="text/css" href='"""),_display_(/*25.51*/routes/*25.57*/.Assets.at("/app-assets/fonts/flag-icon-css/css/flag-icon.min.css")),format.raw/*25.124*/("""'>
    <link rel="stylesheet" type="text/css" href='"""),_display_(/*26.51*/routes/*26.57*/.Assets.at("/app-assets/vendors/css/extensions/pace.css")),format.raw/*26.114*/("""'>
    <!-- END VENDOR CSS-->
    <!-- BEGIN ROBUST CSS-->
    <link rel="stylesheet" type="text/css" href='"""),_display_(/*29.51*/routes/*29.57*/.Assets.at("/app-assets/css/bootstrap-extended.css")),format.raw/*29.109*/("""'>
    <link rel="stylesheet" type="text/css" href='"""),_display_(/*30.51*/routes/*30.57*/.Assets.at("/app-assets/css/app.css")),format.raw/*30.94*/("""'>
    <link rel="stylesheet" type="text/css" href='"""),_display_(/*31.51*/routes/*31.57*/.Assets.at("/app-assets/css/colors.css")),format.raw/*31.97*/("""'>
    <!-- END ROBUST CSS-->
    <!-- BEGIN Page Level CSS-->
    <link rel="stylesheet" type="text/css" href='"""),_display_(/*34.51*/routes/*34.57*/.Assets.at("/app-assets/css/core/menu/menu-types/vertical-menu.css")),format.raw/*34.125*/("""'>
    <link rel="stylesheet" type="text/css" href='"""),_display_(/*35.51*/routes/*35.57*/.Assets.at("/app-assets/css/core/menu/menu-types/vertical-overlay-menu.css")),format.raw/*35.133*/("""'>
    <link rel="stylesheet" type="text/css" href='"""),_display_(/*36.51*/routes/*36.57*/.Assets.at("/app-assets/css/core/colors/palette-gradient.css")),format.raw/*36.119*/("""'>
    <!-- END Page Level CSS-->
    <!-- BEGIN Custom CSS-->
    <link rel="stylesheet" type="text/css" href='"""),_display_(/*39.51*/routes/*39.57*/.Assets.at("/assets/css/style.css")),format.raw/*39.92*/("""'>
    <!-- END Custom CSS-->
  </head>
  <body data-open="click" data-menu="vertical-menu" data-col="2-columns" class="vertical-layout vertical-menu 2-columns  fixed-navbar">

    <!-- navbar-fixed-top-->
    <nav class="header-navbar navbar navbar-with-menu navbar-fixed-top navbar-semi-dark navbar-shadow">
      <div class="navbar-wrapper">
        <div class="navbar-header">
          <ul class="nav navbar-nav">
            <li class="nav-item mobile-menu hidden-md-up float-xs-left"><a class="nav-link nav-menu-main menu-toggle hidden-xs"><i class="icon-menu5 font-large-1"></i></a></li>
            <li class="nav-item"><a href="#" class="navbar-brand nav-link"><img alt="branding logo" src='"""),_display_(/*50.107*/routes/*50.113*/.Assets.at("/app-assets/images/apidevops-log1.png")),format.raw/*50.164*/("""' data-expand='"""),_display_(/*50.180*/routes/*50.186*/.Assets.at("/app-assets/images/apidevops-log1.png")),format.raw/*50.237*/("""' style="width:150px;height:60px;" data-collapse='"""),_display_(/*50.288*/routes/*50.294*/.Assets.at("/app-assets/images/apidevops-avathor.png")),format.raw/*50.348*/("""' style="width:150px;height:60px;" class="brand-logo")'></a></li>
            <li class="nav-item hidden-md-up float-xs-right"><a data-toggle="collapse" data-target="#navbar-mobile" class="nav-link open-navbar-container"><i class="icon-ellipsis pe-2x icon-icon-rotate-right-right"></i></a></li>
          </ul>
        </div>
        <div class="navbar-container content container-fluid">
          <div id="navbar-mobile" class="collapse navbar-toggleable-sm">
            <ul class="nav navbar-nav">
              <li class="nav-item hidden-sm-down"><a class="nav-link nav-menu-main menu-toggle hidden-xs"><i class="icon-menu5">         </i></a></li>
              <li class="nav-item hidden-sm-down"><a href="#" class="nav-link nav-link-expand"><i class="ficon icon-expand2"></i></a></li>
              <li class="nav-item hidden-sm-down"><a href="http://www.apidevops.com" target="_blank" class="btn btn-success upgrade-to-pro">Apidevops</a></li>
            </ul>
            <ul class="nav navbar-nav float-xs-right">
              <li class="dropdown dropdown-language nav-item"><a id="dropdown-flag" href="#" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" class="dropdown-toggle nav-link"><i class="flag-icon flag-icon-gb"></i><span class="selected-language">English</span></a>
                <div aria-labelledby="dropdown-flag" class="dropdown-menu"><a href="#" class="dropdown-item"><i class="flag-icon flag-icon-gb"></i> English</a><a href="#" class="dropdown-item"><i class="flag-icon flag-icon-fr"></i> French</a><a href="#" class="dropdown-item"><i class="flag-icon flag-icon-cn"></i> Chinese</a><a href="#" class="dropdown-item"><i class="flag-icon flag-icon-de"></i> German</a></div>
              </li>
              <li class="dropdown dropdown-notification nav-item"><a href="#" data-toggle="dropdown" class="nav-link nav-link-label"><i class="ficon icon-bell4"></i><span class="tag tag-pill tag-default tag-danger tag-default tag-up">5</span></a>
                <ul class="dropdown-menu dropdown-menu-media dropdown-menu-right">
                  <li class="dropdown-menu-header">
                    <h6 class="dropdown-header m-0"><span class="grey darken-2">Notifications</span><span class="notification-tag tag tag-default tag-danger float-xs-right m-0">5 New</span></h6>
                  </li>
                  <li class="list-group scrollable-container"><a href="javascript:void(0)" class="list-group-item">
                      <div class="media">
                        <div class="media-left valign-middle"><i class="icon-cart3 icon-bg-circle bg-cyan"></i></div>
                        <div class="media-body">
                          <h6 class="media-heading">You have new order!</h6>
                          <p class="notification-text font-small-3 text-muted">Lorem ipsum dolor sit amet, consectetuer elit.</p><small>
                            <time datetime="2015-06-11T18:29:20+08:00" class="media-meta text-muted">30 minutes ago</time></small>
                        </div>
                      </div></a><a href="javascript:void(0)" class="list-group-item">
                      <div class="media">
                        <div class="media-left valign-middle"><i class="icon-monitor3 icon-bg-circle bg-red bg-darken-1"></i></div>
                        <div class="media-body">
                          <h6 class="media-heading red darken-1">99% Server load</h6>
                          <p class="notification-text font-small-3 text-muted">Aliquam tincidunt mauris eu risus.</p><small>
                            <time datetime="2015-06-11T18:29:20+08:00" class="media-meta text-muted">Five hour ago</time></small>
                        </div>
                      </div></a><a href="javascript:void(0)" class="list-group-item">
                      <div class="media">
                        <div class="media-left valign-middle"><i class="icon-server2 icon-bg-circle bg-yellow bg-darken-3"></i></div>
                        <div class="media-body">
                          <h6 class="media-heading yellow darken-3">Warning notifixation</h6>
                          <p class="notification-text font-small-3 text-muted">Vestibulum auctor dapibus neque.</p><small>
                            <time datetime="2015-06-11T18:29:20+08:00" class="media-meta text-muted">Today</time></small>
                        </div>
                      </div></a><a href="javascript:void(0)" class="list-group-item">
                      <div class="media">
                        <div class="media-left valign-middle"><i class="icon-check2 icon-bg-circle bg-green bg-accent-3"></i></div>
                        <div class="media-body">
                          <h6 class="media-heading">Complete the task</h6><small>
                            <time datetime="2015-06-11T18:29:20+08:00" class="media-meta text-muted">Last week</time></small>
                        </div>
                      </div></a><a href="javascript:void(0)" class="list-group-item">
                      <div class="media">
                        <div class="media-left valign-middle"><i class="icon-bar-graph-2 icon-bg-circle bg-teal"></i></div>
                        <div class="media-body">
                          <h6 class="media-heading">Generate monthly report</h6><small>
                            <time datetime="2015-06-11T18:29:20+08:00" class="media-meta text-muted">Last month</time></small>
                        </div>
                      </div></a></li>
                  <li class="dropdown-menu-footer"><a href="javascript:void(0)" class="dropdown-item text-muted text-xs-center">Read all notifications</a></li>
                </ul>
              </li>
              <li class="dropdown dropdown-notification nav-item"><a href="#" data-toggle="dropdown" class="nav-link nav-link-label"><i class="ficon icon-mail6"></i><span class="tag tag-pill tag-default tag-info tag-default tag-up">8</span></a>
                <ul class="dropdown-menu dropdown-menu-media dropdown-menu-right">
                  <li class="dropdown-menu-header">
                    <h6 class="dropdown-header m-0"><span class="grey darken-2">Messages</span><span class="notification-tag tag tag-default tag-info float-xs-right m-0">4 New</span></h6>
                  </li>
                  <li class="list-group scrollable-container"><a href="javascript:void(0)" class="list-group-item">
                      <div class="media">
                        <div class="media-left"><span class="avatar avatar-sm avatar-online rounded-circle"><img src='"""),_display_(/*119.120*/routes/*119.126*/.Assets.at("/app-assets/images/portrait/small/avatar-s-1.png")),format.raw/*119.188*/("""' alt="avatar"><i></i></span></div>
                        <div class="media-body">
                          <h6 class="media-heading">Margaret Govan</h6>
                          <p class="notification-text font-small-3 text-muted">I like your portfolio, let's start the project.</p><small>
                            <time datetime="2015-06-11T18:29:20+08:00" class="media-meta text-muted">Today</time></small>
                        </div>
                      </div></a><a href="javascript:void(0)" class="list-group-item">
                      <div class="media">
                        <div class="media-left"><span class="avatar avatar-sm avatar-busy rounded-circle"><img src='"""),_display_(/*127.118*/routes/*127.124*/.Assets.at("/app-assets/images/portrait/small/avatar-s-2.png")),format.raw/*127.186*/("""' alt="avatar"><i></i></span></div>
                        <div class="media-body">
                          <h6 class="media-heading">Bret Lezama</h6>
                          <p class="notification-text font-small-3 text-muted">I have seen your work, there is</p><small>
                            <time datetime="2015-06-11T18:29:20+08:00" class="media-meta text-muted">Tuesday</time></small>
                        </div>
                      </div></a><a href="javascript:void(0)" class="list-group-item">
                      <div class="media">
                        <div class="media-left"><span class="avatar avatar-sm avatar-online rounded-circle"><img src='"""),_display_(/*135.120*/routes/*135.126*/.Assets.at("/app-assets/images/portrait/small/avatar-s-3.png")),format.raw/*135.188*/("""' alt="avatar"><i></i></span></div>
                        <div class="media-body">
                          <h6 class="media-heading">Carie Berra</h6>
                          <p class="notification-text font-small-3 text-muted">Can we have call in this week ?</p><small>
                            <time datetime="2015-06-11T18:29:20+08:00" class="media-meta text-muted">Friday</time></small>
                        </div>
                      </div></a><a href="javascript:void(0)" class="list-group-item">
                      <div class="media">
                        <div class="media-left"><span class="avatar avatar-sm avatar-away rounded-circle"><img src='"""),_display_(/*143.118*/routes/*143.124*/.Assets.at("/app-assets/images/portrait/small/avatar-s-6.png")),format.raw/*143.186*/("""' alt="avatar"><i></i></span></div>
                        <div class="media-body">
                          <h6 class="media-heading">Eric Alsobrook</h6>
                          <p class="notification-text font-small-3 text-muted">We have project party this saturday night.</p><small>
                            <time datetime="2015-06-11T18:29:20+08:00" class="media-meta text-muted">last month</time></small>
                        </div>
                      </div></a></li>
                  <li class="dropdown-menu-footer"><a href="javascript:void(0)" class="dropdown-item text-muted text-xs-center">Read all messages</a></li>
                </ul>
              </li>
              <li class="dropdown dropdown-user nav-item"><a href="#" data-toggle="dropdown" class="dropdown-toggle nav-link dropdown-user-link"><span class="avatar avatar-online"><img src='"""),_display_(/*153.192*/routes/*153.198*/.Assets.at("/app-assets/images/portrait/small/avatar-s-1.png")),format.raw/*153.260*/("""' alt="avatar"><i></i></span><span class="user-name">John Doe</span></a>
                <div class="dropdown-menu dropdown-menu-right"><a href="#" class="dropdown-item"><i class="icon-head"></i> Edit Profile</a><a href="#" class="dropdown-item"><i class="icon-mail6"></i> My Inbox</a><a href="#" class="dropdown-item"><i class="icon-clipboard2"></i> Task</a><a href="#" class="dropdown-item"><i class="icon-calendar5"></i> Calender</a>
                  <div class="dropdown-divider"></div><a href="#" class="dropdown-item"><i class="icon-power3"></i> Logout</a>
                </div>
              </li>
            </ul>
          </div>
        </div>
      </div>
    </nav>

    <!-- ////////////////////////////////////////////////////////////////////////////-->


    <!-- main menu-->
    <div data-scroll-to-active="true" class="main-menu menu-fixed menu-dark menu-accordion menu-shadow">
      <!-- main menu header-->
      <div class="main-menu-header">
        <input type="text" placeholder="Search" class="menu-search form-control round"/>
      </div>
      <!-- / main menu header-->
      <!-- main menu content-->
      <div class="main-menu-content">
        <ul id="main-menu-navigation" data-menu="menu-navigation" class="navigation navigation-main">
          <li class=" nav-item"><a href="index.html"><i class="icon-home3"></i><span data-i18n="nav.dash.main" class="menu-title">Dashboard</span><span class="tag tag tag-primary tag-pill float-xs-right mr-2">2</span></a>
            <ul class="menu-content">
              <li class="active"><a href="index.html" data-i18n="nav.dash.main" class="menu-item">Dashboard</a>
              </li>
              <li><a href="dashboard-2.html" data-i18n="nav.dash.main" class="menu-item">Dashboard 2</a>
              </li>
            </ul>
          </li>
          <li class=" navigation-header"><span data-i18n="nav.category.support">Support</span><i data-toggle="tooltip" data-placement="right" data-original-title="Support" class="icon-ellipsis icon-ellipsis"></i>
          </li>
          <li class=" nav-item"><a href="https://github.com/pixinvent/robust-free-bootstrap-admin-template/issues"><i class="icon-support"></i><span data-i18n="nav.support_raise_support.main" class="menu-title">Raise Support</span></a>
          </li>
          <li class=" nav-item"><a href="https://pixinvent.com/free-bootstrap-template/robust-lite/documentation"><i class="icon-document-text"></i><span data-i18n="nav.support_documentation.main" class="menu-title">Documentation</span></a>
          </li>
        </ul>
      </div>
      <!-- /main menu content-->
      <!-- main menu footer-->
      <!-- include includes/menu-footer-->
      <!-- main menu footer-->
    </div>
    <!-----------------------------/ main menu-------------------------------------->

    <div class="app-content content container-fluid">
      <div class="content-wrapper">
        <div class="content-header row">
        </div>
        <div class="content-body"><!-- stats -->







  """),_display_(/*212.4*/main/*212.8*/  {_display_(Seq[Any](format.raw/*212.11*/("""
    
    """),format.raw/*214.5*/("""<h1>Server Sent Event clock</h1>
    
    <h1 id="clock"></h1>
    
    <p>
        Clock events are pushed from the Server using a Server Sent Event connection.
    </p>
    
    <script type="text/javascript" charset="utf-8">

       if (!!window.EventSource) """),format.raw/*224.34*/("""{"""),format.raw/*224.35*/("""
         """),format.raw/*225.10*/("""var stringSource = new EventSource(""""),_display_(/*225.47*/routes/*225.53*/.HomeController),format.raw/*225.68*/("""	"""),format.raw/*225.69*/(""".streamClock()");
         stringSource.addEventListener('message', function(e) """),format.raw/*226.63*/("""{"""),format.raw/*226.64*/("""
            """),format.raw/*227.13*/("""$('#clock').html(e.data.replace(/(\d)/g, '<span>$1</span>'))
         """),format.raw/*228.10*/("""}"""),format.raw/*228.11*/(""");
       """),format.raw/*229.8*/("""}"""),format.raw/*229.9*/(""" """),format.raw/*229.10*/("""else """),format.raw/*229.15*/("""{"""),format.raw/*229.16*/("""
         """),format.raw/*230.10*/("""$("#clock").html("Sorry. This browser doesn't seem to support Server sent event. Check <a href='http://html5test.com/compare/feature/communication-eventSource.html'>html5test</a> for browser compatibility."); 
       """),format.raw/*231.8*/("""}"""),format.raw/*231.9*/("""
    """),format.raw/*232.5*/("""</script>    
""")))}),format.raw/*233.2*/("""











        """),format.raw/*245.9*/("""</div>
      </div>
    </div>
    <!-- ////////////////////////////////////////////////////////////////////////////-->


    <footer class="footer footer-static footer-light navbar-border">
      <p class="clearfix text-muted text-sm-center mb-0 px-2"><span class="float-md-left d-xs-block d-md-inline-block">Copyright  &copy; 2017 <a href="https://www.apidevops.com" target="_blank" class="text-bold-800 grey darken-2">Apidevops </a>, All rights reserved. </span><span class="float-md-right d-xs-block d-md-inline-block"><i class="icon-heart5 pink"></i></span></p>
    </footer>

    <!-- BEGIN VENDOR JS-->
    <script src=""""),_display_(/*256.19*/routes/*256.25*/.Assets.at("javascripts/jquery-1.7.1.min.js")),format.raw/*256.70*/("""" type="text/javascript"></script>
    <script src='"""),_display_(/*257.19*/routes/*257.25*/.Assets.at("/app-assets/js/core/libraries/jquery.min.js")),format.raw/*257.82*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*258.19*/routes/*258.25*/.Assets.at("/app-assets/vendors/js/ui/tether.min.js")),format.raw/*258.78*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*259.19*/routes/*259.25*/.Assets.at("/app-assets/js/core/libraries/bootstrap.min.js")),format.raw/*259.85*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*260.19*/routes/*260.25*/.Assets.at("/app-assets/vendors/js/ui/perfect-scrollbar.jquery.min.js")),format.raw/*260.96*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*261.19*/routes/*261.25*/.Assets.at("/app-assets/vendors/js/ui/unison.min.js")),format.raw/*261.78*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*262.19*/routes/*262.25*/.Assets.at("/app-assets/vendors/js/ui/blockUI.min.js")),format.raw/*262.79*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*263.19*/routes/*263.25*/.Assets.at("/app-assets/vendors/js/ui/jquery.matchHeight-min.js")),format.raw/*263.90*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*264.19*/routes/*264.25*/.Assets.at("/app-assets/vendors/js/ui/screenfull.min.js" )),format.raw/*264.83*/("""'type="text/javascript"></script>
    <script src='"""),_display_(/*265.19*/routes/*265.25*/.Assets.at("/app-assets/vendors/js/extensions/pace.min.js")),format.raw/*265.84*/("""' type="text/javascript"></script>
    <!-- BEGIN VENDOR JS-->
    <!-- BEGIN PAGE VENDOR JS-->
    <script src='"""),_display_(/*268.19*/routes/*268.25*/.Assets.at("/app-assets/vendors/js/charts/chart.min.js")),format.raw/*268.81*/("""' type="text/javascript"></script>
    <!-- END PAGE VENDOR JS-->
    <!-- BEGIN ROBUST JS-->
    <script src='"""),_display_(/*271.19*/routes/*271.25*/.Assets.at("/app-assets/js/core/app-menu.js")),format.raw/*271.70*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*272.19*/routes/*272.25*/.Assets.at("/app-assets/js/core/app.js")),format.raw/*272.65*/("""' type="text/javascript"></script>
    <!-- END ROBUST JS-->
    <!-- BEGIN PAGE LEVEL JS-->
    <script src='"""),_display_(/*275.19*/routes/*275.25*/.Assets.at("/app-assets/js/scripts/pages/dashboard-lite.js")),format.raw/*275.85*/("""' type="text/javascript"></script>
    <!-- END PAGE LEVEL JS-->
  </body>
</html>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Oct 07 19:22:35 IST 2017
                  SOURCE: /home/dinesh/Documents/devlopment/apidevops/play-scala-streaming-example-2.6.x/app/views/home.scala.html
                  HASH: fac4c9576306b559504f94f87554c52275c98cb0
                  MATRIX: 810->0|1309->472|1324->478|1400->532|1484->589|1499->595|1575->649|1661->708|1676->714|1753->769|1839->828|1854->834|1931->889|2018->949|2033->955|2103->1003|2187->1060|2202->1066|2275->1117|2354->1169|2369->1175|2424->1209|2508->1266|2523->1272|2576->1304|2875->1576|2890->1582|2955->1625|3058->1701|3073->1707|3138->1750|3218->1803|3233->1809|3322->1876|3402->1929|3417->1935|3496->1992|3632->2101|3647->2107|3721->2159|3801->2212|3816->2218|3874->2255|3954->2308|3969->2314|4030->2354|4170->2467|4185->2473|4275->2541|4355->2594|4370->2600|4468->2676|4548->2729|4563->2735|4647->2797|4787->2910|4802->2916|4858->2951|5588->3653|5604->3659|5677->3710|5721->3726|5737->3732|5810->3783|5889->3834|5905->3840|5981->3894|12619->10503|12636->10509|12721->10571|13443->11264|13460->11270|13545->11332|14252->12010|14269->12016|14354->12078|15058->12753|15075->12759|15160->12821|16063->13695|16080->13701|16165->13763|19224->16795|19237->16799|19279->16802|19317->16812|19608->17074|19638->17075|19677->17085|19742->17122|19758->17128|19795->17143|19825->17144|19934->17224|19964->17225|20006->17238|20105->17308|20135->17309|20173->17319|20202->17320|20232->17321|20266->17326|20296->17327|20335->17337|20580->17554|20609->17555|20642->17560|20688->17575|20736->17595|21392->18223|21408->18229|21475->18274|21556->18327|21572->18333|21651->18390|21732->18443|21748->18449|21823->18502|21904->18555|21920->18561|22002->18621|22083->18674|22099->18680|22192->18751|22273->18804|22289->18810|22364->18863|22445->18916|22461->18922|22537->18976|22618->19029|22634->19035|22721->19100|22802->19153|22818->19159|22898->19217|22978->19269|22994->19275|23075->19334|23217->19448|23233->19454|23311->19510|23451->19622|23467->19628|23534->19673|23615->19726|23631->19732|23693->19772|23832->19883|23848->19889|23930->19949
                  LINES: 26->1|35->10|35->10|35->10|36->11|36->11|36->11|37->12|37->12|37->12|38->13|38->13|38->13|39->14|39->14|39->14|40->15|40->15|40->15|41->16|41->16|41->16|42->17|42->17|42->17|47->22|47->22|47->22|49->24|49->24|49->24|50->25|50->25|50->25|51->26|51->26|51->26|54->29|54->29|54->29|55->30|55->30|55->30|56->31|56->31|56->31|59->34|59->34|59->34|60->35|60->35|60->35|61->36|61->36|61->36|64->39|64->39|64->39|75->50|75->50|75->50|75->50|75->50|75->50|75->50|75->50|75->50|144->119|144->119|144->119|152->127|152->127|152->127|160->135|160->135|160->135|168->143|168->143|168->143|178->153|178->153|178->153|237->212|237->212|237->212|239->214|249->224|249->224|250->225|250->225|250->225|250->225|250->225|251->226|251->226|252->227|253->228|253->228|254->229|254->229|254->229|254->229|254->229|255->230|256->231|256->231|257->232|258->233|270->245|281->256|281->256|281->256|282->257|282->257|282->257|283->258|283->258|283->258|284->259|284->259|284->259|285->260|285->260|285->260|286->261|286->261|286->261|287->262|287->262|287->262|288->263|288->263|288->263|289->264|289->264|289->264|290->265|290->265|290->265|293->268|293->268|293->268|296->271|296->271|296->271|297->272|297->272|297->272|300->275|300->275|300->275
                  -- GENERATED --
              */
          