
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.17*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en" data-textdirection="ltr" class="loading">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimal-ui">
    <meta name="author" content="dinesh pazani">
    <title>Apidevops Cloud platform tool</title>
    <link rel="apple-touch-icon" sizes="60x60" href='"""),_display_(/*11.55*/routes/*11.61*/.Assets.at("/app-assets/images/ico/apple-icon-60.png")),format.raw/*11.115*/("""'>
    <link rel="apple-touch-icon" sizes="76x76" href='"""),_display_(/*12.55*/routes/*12.61*/.Assets.at("/app-assets/images/ico/apple-icon-76.png")),format.raw/*12.115*/("""'>
    <link rel="apple-touch-icon" sizes="120x120" href='"""),_display_(/*13.57*/routes/*13.63*/.Assets.at("/app-assets/images/ico/apple-icon-120.png")),format.raw/*13.118*/("""'>
    <link rel="apple-touch-icon" sizes="152x152" href='"""),_display_(/*14.57*/routes/*14.63*/.Assets.at("/app-assets/images/ico/apple-icon-152.png")),format.raw/*14.118*/("""'>
    <link rel="shortcut icon" type="image/x-icon" href='"""),_display_(/*15.58*/routes/*15.64*/.Assets.at("/app-assets/images/ico/favicon.ico")),format.raw/*15.112*/("""'>
    <link rel="shortcut icon" type="image/png" href='"""),_display_(/*16.55*/routes/*16.61*/.Assets.at("/app-assets/images/ico/favicon-32.png")),format.raw/*16.112*/("""'>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*17.50*/routes/*17.56*/.Assets.at("stylesheets/main.css")),format.raw/*17.90*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*18.55*/routes/*18.61*/.Assets.at("images/favicon.png")),format.raw/*18.93*/("""">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-touch-fullscreen" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="default">
    <!-- BEGIN VENDOR CSS-->
    <link rel="stylesheet" type="text/css" href='"""),_display_(/*23.51*/routes/*23.57*/.Assets.at("/app-assets/css/bootstrap.css")),format.raw/*23.100*/("""'>
    <!-- font icons-->
    <link rel="stylesheet" type="text/css" href='"""),_display_(/*25.51*/routes/*25.57*/.Assets.at("/app-assets/fonts/icomoon.css")),format.raw/*25.100*/("""'>
    <link rel="stylesheet" type="text/css" href='"""),_display_(/*26.51*/routes/*26.57*/.Assets.at("/app-assets/fonts/flag-icon-css/css/flag-icon.min.css")),format.raw/*26.124*/("""'>
    <link rel="stylesheet" type="text/css" href='"""),_display_(/*27.51*/routes/*27.57*/.Assets.at("/app-assets/vendors/css/extensions/pace.css")),format.raw/*27.114*/("""'>
    <!-- END VENDOR CSS-->
    <!-- BEGIN ROBUST CSS-->
    <link rel="stylesheet" type="text/css" href='"""),_display_(/*30.51*/routes/*30.57*/.Assets.at("/app-assets/css/bootstrap-extended.css")),format.raw/*30.109*/("""'>
    <link rel="stylesheet" type="text/css" href='"""),_display_(/*31.51*/routes/*31.57*/.Assets.at("/app-assets/css/app.css")),format.raw/*31.94*/("""'>
    <link rel="stylesheet" type="text/css" href='"""),_display_(/*32.51*/routes/*32.57*/.Assets.at("/app-assets/css/colors.css")),format.raw/*32.97*/("""'>
    <!-- END ROBUST CSS-->
    <!-- BEGIN Page Level CSS-->
    <link rel="stylesheet" type="text/css" href='"""),_display_(/*35.51*/routes/*35.57*/.Assets.at("/app-assets/css/core/menu/menu-types/vertical-menu.css")),format.raw/*35.125*/("""'>
    <link rel="stylesheet" type="text/css" href='"""),_display_(/*36.51*/routes/*36.57*/.Assets.at("/app-assets/css/core/menu/menu-types/vertical-overlay-menu.css")),format.raw/*36.133*/("""'>
    <link rel="stylesheet" type="text/css" href='"""),_display_(/*37.51*/routes/*37.57*/.Assets.at("/app-assets/css/core/colors/palette-gradient.css")),format.raw/*37.119*/("""'>
    <!-- END Page Level CSS-->
    <!-- BEGIN Custom CSS-->
    <link rel="stylesheet" type="text/css" href='"""),_display_(/*40.51*/routes/*40.57*/.Assets.at("/assets/css/style.css")),format.raw/*40.92*/("""'>
    <!-- END Custom CSS-->
  </head>
  <body data-open="click" data-menu="vertical-menu" data-col="2-columns" class="vertical-layout vertical-menu 2-columns  fixed-navbar">

    <!-- navbar-fixed-top-->
    <nav class="header-navbar navbar navbar-with-menu navbar-fixed-top navbar-semi-dark navbar-shadow">
      <div class="navbar-wrapper">
        <div class="navbar-header">
          <ul class="nav navbar-nav">
            <li class="nav-item mobile-menu hidden-md-up float-xs-left"><a class="nav-link nav-menu-main menu-toggle hidden-xs"><i class="icon-menu5 font-large-1"></i></a></li>
            <li class="nav-item"><a href="#" class="navbar-brand nav-link"><img alt="branding logo" src='"""),_display_(/*51.107*/routes/*51.113*/.Assets.at("/app-assets/images/apidevops-log1.png")),format.raw/*51.164*/("""' data-expand='"""),_display_(/*51.180*/routes/*51.186*/.Assets.at("/app-assets/images/apidevops-log1.png")),format.raw/*51.237*/("""' style="width:150px;height:60px;" data-collapse='"""),_display_(/*51.288*/routes/*51.294*/.Assets.at("/app-assets/images/apidevops-avathor.png")),format.raw/*51.348*/("""' style="width:150px;height:60px;" class="brand-logo")'></a></li>
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
                        <div class="media-left"><span class="avatar avatar-sm avatar-online rounded-circle"><img src='"""),_display_(/*120.120*/routes/*120.126*/.Assets.at("/app-assets/images/portrait/small/avatar-s-1.png")),format.raw/*120.188*/("""' alt="avatar"><i></i></span></div>
                        <div class="media-body">
                          <h6 class="media-heading">Margaret Govan</h6>
                          <p class="notification-text font-small-3 text-muted">I like your portfolio, let's start the project.</p><small>
                            <time datetime="2015-06-11T18:29:20+08:00" class="media-meta text-muted">Today</time></small>
                        </div>
                      </div></a><a href="javascript:void(0)" class="list-group-item">
                      <div class="media">
                        <div class="media-left"><span class="avatar avatar-sm avatar-busy rounded-circle"><img src='"""),_display_(/*128.118*/routes/*128.124*/.Assets.at("/app-assets/images/portrait/small/avatar-s-2.png")),format.raw/*128.186*/("""' alt="avatar"><i></i></span></div>
                        <div class="media-body">
                          <h6 class="media-heading">Bret Lezama</h6>
                          <p class="notification-text font-small-3 text-muted">I have seen your work, there is</p><small>
                            <time datetime="2015-06-11T18:29:20+08:00" class="media-meta text-muted">Tuesday</time></small>
                        </div>
                      </div></a><a href="javascript:void(0)" class="list-group-item">
                      <div class="media">
                        <div class="media-left"><span class="avatar avatar-sm avatar-online rounded-circle"><img src='"""),_display_(/*136.120*/routes/*136.126*/.Assets.at("/app-assets/images/portrait/small/avatar-s-3.png")),format.raw/*136.188*/("""' alt="avatar"><i></i></span></div>
                        <div class="media-body">
                          <h6 class="media-heading">Carie Berra</h6>
                          <p class="notification-text font-small-3 text-muted">Can we have call in this week ?</p><small>
                            <time datetime="2015-06-11T18:29:20+08:00" class="media-meta text-muted">Friday</time></small>
                        </div>
                      </div></a><a href="javascript:void(0)" class="list-group-item">
                      <div class="media">
                        <div class="media-left"><span class="avatar avatar-sm avatar-away rounded-circle"><img src='"""),_display_(/*144.118*/routes/*144.124*/.Assets.at("/app-assets/images/portrait/small/avatar-s-6.png")),format.raw/*144.186*/("""' alt="avatar"><i></i></span></div>
                        <div class="media-body">
                          <h6 class="media-heading">Eric Alsobrook</h6>
                          <p class="notification-text font-small-3 text-muted">We have project party this saturday night.</p><small>
                            <time datetime="2015-06-11T18:29:20+08:00" class="media-meta text-muted">last month</time></small>
                        </div>
                      </div></a></li>
                  <li class="dropdown-menu-footer"><a href="javascript:void(0)" class="dropdown-item text-muted text-xs-center">Read all messages</a></li>
                </ul>
              </li>
              <li class="dropdown dropdown-user nav-item"><a href="#" data-toggle="dropdown" class="dropdown-toggle nav-link dropdown-user-link"><span class="avatar avatar-online"><img src='"""),_display_(/*154.192*/routes/*154.198*/.Assets.at("/app-assets/images/portrait/small/avatar-s-1.png")),format.raw/*154.260*/("""' alt="avatar"><i></i></span><span class="user-name">John Doe</span></a>
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

        """),_display_(/*206.10*/content),format.raw/*206.17*/("""
        
     

        """),format.raw/*210.9*/("""</div>
      </div>
    </div>
    <!-- ////////////////////////////////////////////////////////////////////////////-->


    <footer class="footer footer-static footer-light navbar-border">
      <p class="clearfix text-muted text-sm-center mb-0 px-2"><span class="float-md-left d-xs-block d-md-inline-block">Copyright  &copy; 2017 <a href="https://www.apidevops.com" target="_blank" class="text-bold-800 grey darken-2">Apidevops </a>, All rights reserved. </span><span class="float-md-right d-xs-block d-md-inline-block"><i class="icon-heart5 pink"></i></span></p>
    </footer>

    <!-- BEGIN VENDOR JS-->
    <script src=""""),_display_(/*221.19*/routes/*221.25*/.Assets.at("javascripts/jquery-1.7.1.min.js")),format.raw/*221.70*/("""" type="text/javascript"></script>
    <script src='"""),_display_(/*222.19*/routes/*222.25*/.Assets.at("/app-assets/js/core/libraries/jquery.min.js")),format.raw/*222.82*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*223.19*/routes/*223.25*/.Assets.at("/app-assets/vendors/js/ui/tether.min.js")),format.raw/*223.78*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*224.19*/routes/*224.25*/.Assets.at("/app-assets/js/core/libraries/bootstrap.min.js")),format.raw/*224.85*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*225.19*/routes/*225.25*/.Assets.at("/app-assets/vendors/js/ui/perfect-scrollbar.jquery.min.js")),format.raw/*225.96*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*226.19*/routes/*226.25*/.Assets.at("/app-assets/vendors/js/ui/unison.min.js")),format.raw/*226.78*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*227.19*/routes/*227.25*/.Assets.at("/app-assets/vendors/js/ui/blockUI.min.js")),format.raw/*227.79*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*228.19*/routes/*228.25*/.Assets.at("/app-assets/vendors/js/ui/jquery.matchHeight-min.js")),format.raw/*228.90*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*229.19*/routes/*229.25*/.Assets.at("/app-assets/vendors/js/ui/screenfull.min.js" )),format.raw/*229.83*/("""'type="text/javascript"></script>
    <script src='"""),_display_(/*230.19*/routes/*230.25*/.Assets.at("/app-assets/vendors/js/extensions/pace.min.js")),format.raw/*230.84*/("""' type="text/javascript"></script>
    <!-- BEGIN VENDOR JS-->
    <!-- BEGIN PAGE VENDOR JS-->
    <script src='"""),_display_(/*233.19*/routes/*233.25*/.Assets.at("/app-assets/vendors/js/charts/chart.min.js")),format.raw/*233.81*/("""' type="text/javascript"></script>
    <!-- END PAGE VENDOR JS-->
    <!-- BEGIN ROBUST JS-->
    <script src='"""),_display_(/*236.19*/routes/*236.25*/.Assets.at("/app-assets/js/core/app-menu.js")),format.raw/*236.70*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*237.19*/routes/*237.25*/.Assets.at("/app-assets/js/core/app.js")),format.raw/*237.65*/("""' type="text/javascript"></script>
    <!-- END ROBUST JS-->
    <!-- BEGIN PAGE LEVEL JS-->
    <script src='"""),_display_(/*240.19*/routes/*240.25*/.Assets.at("/app-assets/js/scripts/pages/dashboard-lite.js")),format.raw/*240.85*/("""' type="text/javascript"></script>
    <!-- END PAGE LEVEL JS-->
  </body>
</html>
"""))
      }
    }
  }

  def render(content:Html): play.twirl.api.HtmlFormat.Appendable = apply(content)

  def f:((Html) => play.twirl.api.HtmlFormat.Appendable) = (content) => apply(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Oct 07 19:22:35 IST 2017
                  SOURCE: /home/dinesh/Documents/devlopment/apidevops/play-scala-streaming-example-2.6.x/app/views/main.scala.html
                  HASH: 247c4a40c561b1595f10cc3f0952893ea4533a8e
                  MATRIX: 726->1|836->16|864->18|1360->487|1375->493|1451->547|1535->604|1550->610|1626->664|1712->723|1727->729|1804->784|1890->843|1905->849|1982->904|2069->964|2084->970|2154->1018|2238->1075|2253->1081|2326->1132|2405->1184|2420->1190|2475->1224|2559->1281|2574->1287|2627->1319|2926->1591|2941->1597|3006->1640|3109->1716|3124->1722|3189->1765|3269->1818|3284->1824|3373->1891|3453->1944|3468->1950|3547->2007|3683->2116|3698->2122|3772->2174|3852->2227|3867->2233|3925->2270|4005->2323|4020->2329|4081->2369|4221->2482|4236->2488|4326->2556|4406->2609|4421->2615|4519->2691|4599->2744|4614->2750|4698->2812|4838->2925|4853->2931|4909->2966|5639->3668|5655->3674|5728->3725|5772->3741|5788->3747|5861->3798|5940->3849|5956->3855|6032->3909|12670->10518|12687->10524|12772->10586|13494->11279|13511->11285|13596->11347|14303->12025|14320->12031|14405->12093|15109->12768|15126->12774|15211->12836|16114->13710|16131->13716|16216->13778|19277->16811|19306->16818|19359->16843|20015->17471|20031->17477|20098->17522|20179->17575|20195->17581|20274->17638|20355->17691|20371->17697|20446->17750|20527->17803|20543->17809|20625->17869|20706->17922|20722->17928|20815->17999|20896->18052|20912->18058|20987->18111|21068->18164|21084->18170|21160->18224|21241->18277|21257->18283|21344->18348|21425->18401|21441->18407|21521->18465|21601->18517|21617->18523|21698->18582|21840->18696|21856->18702|21934->18758|22074->18870|22090->18876|22157->18921|22238->18974|22254->18980|22316->19020|22455->19131|22471->19137|22553->19197
                  LINES: 21->1|26->1|28->3|36->11|36->11|36->11|37->12|37->12|37->12|38->13|38->13|38->13|39->14|39->14|39->14|40->15|40->15|40->15|41->16|41->16|41->16|42->17|42->17|42->17|43->18|43->18|43->18|48->23|48->23|48->23|50->25|50->25|50->25|51->26|51->26|51->26|52->27|52->27|52->27|55->30|55->30|55->30|56->31|56->31|56->31|57->32|57->32|57->32|60->35|60->35|60->35|61->36|61->36|61->36|62->37|62->37|62->37|65->40|65->40|65->40|76->51|76->51|76->51|76->51|76->51|76->51|76->51|76->51|76->51|145->120|145->120|145->120|153->128|153->128|153->128|161->136|161->136|161->136|169->144|169->144|169->144|179->154|179->154|179->154|231->206|231->206|235->210|246->221|246->221|246->221|247->222|247->222|247->222|248->223|248->223|248->223|249->224|249->224|249->224|250->225|250->225|250->225|251->226|251->226|251->226|252->227|252->227|252->227|253->228|253->228|253->228|254->229|254->229|254->229|255->230|255->230|255->230|258->233|258->233|258->233|261->236|261->236|261->236|262->237|262->237|262->237|265->240|265->240|265->240
                  -- GENERATED --
              */
          