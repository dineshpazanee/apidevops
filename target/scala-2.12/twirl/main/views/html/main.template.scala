
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
            <li class="nav-item"><a href="index.html" class="navbar-brand nav-link"><img alt="branding logo" src="../../app-assets/images/logo/robust-logo-light.png" data-expand="../../app-assets/images/logo/robust-logo-light.png" data-collapse="../../app-assets/images/logo/robust-logo-small.png" class="brand-logo"></a></li>
            <li class="nav-item hidden-md-up float-xs-right"><a data-toggle="collapse" data-target="#navbar-mobile" class="nav-link open-navbar-container"><i class="icon-ellipsis pe-2x icon-icon-rotate-right-right"></i></a></li>
          </ul>
        </div>
        <div class="navbar-container content container-fluid">
          <div id="navbar-mobile" class="collapse navbar-toggleable-sm">
            <ul class="nav navbar-nav">
              <li class="nav-item hidden-sm-down"><a class="nav-link nav-menu-main menu-toggle hidden-xs"><i class="icon-menu5">         </i></a></li>
              <li class="nav-item hidden-sm-down"><a href="#" class="nav-link nav-link-expand"><i class="ficon icon-expand2"></i></a></li>
              <li class="nav-item hidden-sm-down"><a href=""""),_display_(/*60.61*/routes/*60.67*/.HomeController.login()),format.raw/*60.90*/("""" target="" class="btn btn-success upgrade-to-pro">Login</a></li>
            </ul>
            <ul class="nav navbar-nav float-xs-right">
              <li class="dropdown dropdown-language nav-item"><a id="dropdown-flag" href="#" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" class="dropdown-toggle nav-link"><i class="flag-icon flag-icon-gb"></i><span class="selected-language">English</span></a>
                <div aria-labelledby="dropdown-flag" class="dropdown-menu"><a href="#" class="dropdown-item"><i class="flag-icon flag-icon-gb"></i> English</a><a href="#" class="dropdown-item"><i class="flag-icon flag-icon-fr"></i> French</a><a href="#" class="dropdown-item"><i class="flag-icon flag-icon-cn"></i> Chinese</a><a href="#" class="dropdown-item"><i class="flag-icon flag-icon-de"></i> German</a></div>
              </li>
              <!--
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
                        <div class="media-left"><span class="avatar avatar-sm avatar-online rounded-circle"><img src="../../app-assets/images/portrait/small/avatar-s-1.png" alt="avatar"><i></i></span></div>
                        <div class="media-body">
                          <h6 class="media-heading">Margaret Govan</h6>
                          <p class="notification-text font-small-3 text-muted">I like your portfolio, let's start the project.</p><small>
                            <time datetime="2015-06-11T18:29:20+08:00" class="media-meta text-muted">Today</time></small>
                        </div>
                      </div></a><a href="javascript:void(0)" class="list-group-item">
                      <div class="media">
                        <div class="media-left"><span class="avatar avatar-sm avatar-busy rounded-circle"><img src="../../app-assets/images/portrait/small/avatar-s-2.png" alt="avatar"><i></i></span></div>
                        <div class="media-body">
                          <h6 class="media-heading">Bret Lezama</h6>
                          <p class="notification-text font-small-3 text-muted">I have seen your work, there is</p><small>
                            <time datetime="2015-06-11T18:29:20+08:00" class="media-meta text-muted">Tuesday</time></small>
                        </div>
                      </div></a><a href="javascript:void(0)" class="list-group-item">
                      <div class="media">
                        <div class="media-left"><span class="avatar avatar-sm avatar-online rounded-circle"><img src="../../app-assets/images/portrait/small/avatar-s-3.png" alt="avatar"><i></i></span></div>
                        <div class="media-body">
                          <h6 class="media-heading">Carie Berra</h6>
                          <p class="notification-text font-small-3 text-muted">Can we have call in this week ?</p><small>
                            <time datetime="2015-06-11T18:29:20+08:00" class="media-meta text-muted">Friday</time></small>
                        </div>
                      </div></a><a href="javascript:void(0)" class="list-group-item">
                      <div class="media">
                        <div class="media-left"><span class="avatar avatar-sm avatar-away rounded-circle"><img src="../../app-assets/images/portrait/small/avatar-s-6.png" alt="avatar"><i></i></span></div>
                        <div class="media-body">
                          <h6 class="media-heading">Eric Alsobrook</h6>
                          <p class="notification-text font-small-3 text-muted">We have project party this saturday night.</p><small>
                            <time datetime="2015-06-11T18:29:20+08:00" class="media-meta text-muted">last month</time></small>
                        </div>
                      </div></a></li>
                  <li class="dropdown-menu-footer"><a href="javascript:void(0)" class="dropdown-item text-muted text-xs-center">Read all messages</a></li>
                </ul>
              </li>            
              <li class="dropdown dropdown-user nav-item"><a href="#" data-toggle="dropdown" class="dropdown-toggle nav-link dropdown-user-link"><span class="avatar avatar-online"><img src="../../app-assets/images/portrait/small/avatar-s-1.png" alt="avatar"><i></i></span><span class="user-name">John Doe</span></a>
                <div class="dropdown-menu dropdown-menu-right"><a href="#" class="dropdown-item"><i class="icon-head"></i> Edit Profile</a><a href="#" class="dropdown-item"><i class="icon-mail6"></i> My Inbox</a><a href="#" class="dropdown-item"><i class="icon-clipboard2"></i> Task</a><a href="#" class="dropdown-item"><i class="icon-calendar5"></i> Calender</a>
                  <div class="dropdown-divider"></div><a href="#" class="dropdown-item"><i class="icon-power3"></i> Logout</a>
                </div>
              </li>
              -->
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
          <li class=" nav-item"><a href="#"><i class="icon-stack-2"></i><span data-i18n="nav.page_layouts.main" class="menu-title">Page layouts</span></a>
            <ul class="menu-content">
              <li><a href="layout-1-column.html" data-i18n="nav.page_layouts.1_column" class="menu-item">1 column</a>
              </li>
              <li><a href="layout-2-columns.html" data-i18n="nav.page_layouts.2_columns" class="menu-item">2 columns</a>
              </li>
              <li><a href="layout-boxed.html" data-i18n="nav.page_layouts.boxed_layout" class="menu-item">Boxed layout</a>
              </li>
              <li><a href="layout-static.html" data-i18n="nav.page_layouts.static_layout" class="menu-item">Static layout</a>
              </li>
              <li class="navigation-divider"></li>
              <li><a href="layout-light.html" data-i18n="nav.page_layouts.light_layout" class="menu-item">Light layout</a>
              </li>
              <li><a href="layout-dark.html" data-i18n="nav.page_layouts.dark_layout" class="menu-item">Dark layout</a>
              </li>
              <li><a href="layout-semi-dark.html" data-i18n="nav.page_layouts.semi_dark_layout" class="menu-item">Semi dark layout</a>
              </li>
            </ul>
          </li>
          <li class=" nav-item"><a href="#"><i class="icon-briefcase4"></i><span data-i18n="nav.project.main" class="menu-title">Pages</span></a>
            <ul class="menu-content">
              <li><a href="invoice-template.html" data-i18n="nav.invoice.invoice_template" class="menu-item">Invoice Template</a>
              </li>
              <li><a href="gallery-grid.html" data-i18n="nav.gallery_pages.gallery_grid" class="menu-item">Gallery Grid</a>
              </li>
              <li><a href="search-page.html" data-i18n="nav.search_pages.search_page" class="menu-item">Search Page</a>
              </li>
              <li><a href="search-website.html" data-i18n="nav.search_pages.search_website" class="menu-item">Search Website</a>
              </li>
              <li><a href="login-simple.html" data-i18n="nav.login_register_pages.login_simple" class="menu-item">Login Simple</a>
              </li>
              <li><a href="register-simple.html" data-i18n="nav.login_register_pages.register_simple" class="menu-item">Register Simple</a>
              </li>
              <li><a href="unlock-user.html" data-i18n="nav.login_register_pages.unlock_user" class="menu-item">Unlock User</a>
              </li>
              <li><a href="recover-password.html" data-i18n="nav.login_register_pages.recover_password" class="menu-item">Recover Password</a>
              </li>
              <li><a href="#" data-i18n="nav.error_pages.main" class="menu-item">Error</a>
                <ul class="menu-content">
                  <li><a href="error-400.html" data-i18n="nav.error_pages.error_400" class="menu-item">Error 400</a>
                  </li>
                  <li><a href="error-401.html" data-i18n="nav.error_pages.error_401" class="menu-item">Error 401</a>
                  </li>
                  <li><a href="error-403.html" data-i18n="nav.error_pages.error_403" class="menu-item">Error 403</a>
                  </li>
                  <li><a href="error-404.html" data-i18n="nav.error_pages.error_404" class="menu-item">Error 404</a>
                  </li>
                  <li><a href="error-500.html" data-i18n="nav.error_pages.error_500" class="menu-item">Error 500</a>
                  </li>
                </ul>
              </li>
              <li><a href="coming-soon-flat.html" data-i18n="nav.other_pages.coming_soon.coming_soon_flat" class="menu-item">Coming Soon</a>
              </li>
              <li><a href="under-maintenance.html" data-i18n="nav.other_pages.under_maintenance" class="menu-item">Maintenance</a>
              </li>
            </ul>
          </li>
          <li class=" nav-item"><a href="#"><i class="icon-ios-albums-outline"></i><span data-i18n="nav.cards.main" class="menu-title">Cards</span></a>
            <ul class="menu-content">
              <li><a href="card-bootstrap.html" data-i18n="nav.cards.card_bootstrap" class="menu-item">Bootstrap Cards</a>
              </li>
              <li><a href="card-actions.html" data-i18n="nav.cards.card_actions" class="menu-item">Card Action</a>
              </li>
            </ul>
          </li>
          <li class=" nav-item"><a href="#"><i class="icon-whatshot"></i><span data-i18n="nav.advance_cards.main" class="menu-title">Advance Cards</span></a>
            <ul class="menu-content">
              <li><a href="card-statistics.html" data-i18n="nav.cards.card_statistics" class="menu-item">Statistics</a>
              </li>
              <li><a href="card-charts.html" data-i18n="nav.cards.card_charts" class="menu-item">Charts</a>
              </li>
            </ul>
          </li>
          <li class=" nav-item"><a href="#"><i class="icon-compass3"></i><span data-i18n="nav.content.main" class="menu-title">Content</span></a>
            <ul class="menu-content">
              <li><a href="content-grid.html" data-i18n="nav.content.content_grid" class="menu-item">Grid</a>
              </li>
              <li><a href="content-typography.html" data-i18n="nav.content.content_typography" class="menu-item">Typography</a>
              </li>
              <li><a href="content-text-utilities.html" data-i18n="nav.content.content_text_utilities" class="menu-item">Text utilities</a>
              </li>
              <li><a href="content-helper-classes.html" data-i18n="nav.content.content_helper_classes" class="menu-item">Helper classes</a>
              </li>
            </ul>
          </li>
          <li class=" nav-item"><a href="#"><i class="icon-grid2"></i><span data-i18n="nav.components.main" class="menu-title">Components</span></a>
            <ul class="menu-content">
              <li><a href="component-alerts.html" data-i18n="nav.components.component_alerts" class="menu-item">Alerts</a>
              </li>
              <li><a href="component-buttons-basic.html" data-i18n="nav.components.components_buttons.component_buttons_basic" class="menu-item">Basic Buttons</a>
              </li>
              <li><a href="component-carousel.html" data-i18n="nav.components.component_carousel" class="menu-item">Carousel</a>
              </li>
              <li><a href="component-collapse.html" data-i18n="nav.components.component_collapse" class="menu-item">Collapse</a>
              </li>
              <li><a href="component-dropdowns.html" data-i18n="nav.components.component_dropdowns" class="menu-item">Dropdowns</a>
              </li>
              <li><a href="component-list-group.html" data-i18n="nav.components.component_list_group" class="menu-item">List Group</a>
              </li>
              <li><a href="component-modals.html" data-i18n="nav.components.component_modals" class="menu-item">Modals</a>
              </li>
              <li><a href="component-pagination.html" data-i18n="nav.components.component_pagination" class="menu-item">Pagination</a>
              </li>
              <li><a href="component-navs-component.html" data-i18n="nav.components.component_navs_component" class="menu-item">Navs Component</a>
              </li>
              <li><a href="component-tabs-component.html" data-i18n="nav.components.component_tabs_component" class="menu-item">Tabs Component</a>
              </li>
              <li><a href="component-pills-component.html" data-i18n="nav.components.component_pills_component" class="menu-item">Pills Component</a>
              </li>
              <li><a href="component-tooltips.html" data-i18n="nav.components.component_tooltips" class="menu-item">Tooltips</a>
              </li>
              <li><a href="component-popovers.html" data-i18n="nav.components.component_popovers" class="menu-item">Popovers</a>
              </li>
              <li><a href="component-tags.html" data-i18n="nav.components.component_tags" class="menu-item">Tags</a>
              </li>
              <li><a href="component-pill-tags.html" class="menu-item">Pill Tags</a>
              </li>
              <li><a href="component-progress.html" data-i18n="nav.components.component_progress" class="menu-item">Progress</a>
              </li>
              <li><a href="component-media-objects.html" data-i18n="nav.components.component_media_objects" class="menu-item">Media Objects</a>
              </li>
            </ul>
          </li>
          <li class=" nav-item"><a href="#"><i class="icon-eye6"></i><span data-i18n="nav.icons.main" class="menu-title">Icons</span></a>
            <ul class="menu-content">
              <li><a href="icons-feather.html" data-i18n="nav.icons.icons_feather" class="menu-item">Feather</a>
              </li>
              <li><a href="icons-ionicons.html" data-i18n="nav.icons.icons_ionicons" class="menu-item">Ionicons</a>
              </li>
              <li><a href="icons-fps-line.html" data-i18n="nav.icons.icons_fps_line" class="menu-item">FPS Line Icons</a>
              </li>
              <li><a href="icons-ico-moon.html" data-i18n="nav.icons.icons_ico_moon" class="menu-item">Ico Moon<"""),
format.raw("""/a>
              </li>
              <li><a href="icons-font-awesome.html" data-i18n="nav.icons.icons_font_awesome" class="menu-item">Font Awesome</a>
              </li>
              <li><a href="icons-meteocons.html" data-i18n="nav.icons.icons_meteocons" class="menu-item">Meteocons</a>
              </li>
              <li><a href="icons-evil.html" data-i18n="nav.icons.icons_evil" class="menu-item">Evil Icons</a>
              </li>
              <li><a href="icons-linecons.html" data-i18n="nav.icons.icons_linecons" class="menu-item">Linecons</a>
              </li>
            </ul>
          </li>
          <li class=" nav-item"><a href="form-layout-basic.html"><i class="icon-paper"></i><span data-i18n="nav.form_layouts.form_layout_basic" class="menu-title">Basic Forms</span></a>
          </li>
          <li class=" nav-item"><a href="table-basic.html"><i class="icon-table2"></i><span data-i18n="nav.bootstrap_tables.table_basic" class="menu-title">Basic Tables</span></a>
          </li>
          <li class=" nav-item"><a href="#"><i class="icon-bar-graph-2"></i><span data-i18n="nav.google_charts.main" class="menu-title">google Charts</span></a>
            <ul class="menu-content">
              <li><a href="google-bar-charts.html" data-i18n="nav.google_charts.google_bar_charts" class="menu-item">Bar charts</a>
              </li>
              <li><a href="google-line-charts.html" data-i18n="nav.google_charts.google_line_charts" class="menu-item">Line charts</a>
              </li>
              <li><a href="google-pie-charts.html" data-i18n="nav.google_charts.google_pie_charts" class="menu-item">Pie charts</a>
              </li>
            </ul>
          </li>
          <li class=" nav-item"><a href="#"><i class="icon-stats-dots"></i><span data-i18n="nav.chartjs.main" class="menu-title">Chartjs</span></a>
            <ul class="menu-content">
              <li><a href="chartjs-line-charts.html" data-i18n="nav.chartjs.chartjs_line_charts" class="menu-item">Line charts</a>
              </li>
              <li><a href="chartjs-bar-charts.html" data-i18n="nav.chartjs.chartjs_bar_charts" class="menu-item">Bar charts</a>
              </li>
              <li><a href="chartjs-pie-doughnut-charts.html" data-i18n="nav.chartjs.chartjs_pie_doughnut_charts" class="menu-item">Pie &amp; Doughnut charts</a>
              </li>
            </ul>
          </li>
          <li class=" nav-item"><a href="#"><i class="icon-pie-graph2"></i><span data-i18n="nav.flot_charts.main" class="menu-title">Flot Charts</span></a>
            <ul class="menu-content">
              <li><a href="flot-line-charts.html" data-i18n="nav.flot_charts.flot_line_charts" class="menu-item">Line charts</a>
              </li>
              <li><a href="flot-bar-charts.html" data-i18n="nav.flot_charts.flot_bar_charts" class="menu-item">Bar charts</a>
              </li>
              <li><a href="flot-pie-charts.html" data-i18n="nav.flot_charts.flot_pie_charts" class="menu-item">Pie charts</a>
              </li>
            </ul>
          </li>
          <li class=" nav-item"><a href="#"><i class="icon-map22"></i><span data-i18n="nav.maps.main" class="menu-title">Maps</span></a>
            <ul class="menu-content">
              <li><a href="gmaps-basic-maps.html" data-i18n="nav.maps.google_maps.gmaps_basic_maps" class="menu-item">Maps</a>
              </li>
              <li><a href="vector-maps-jvq.html" data-i18n="nav.maps.vector_maps.vector_maps_jvq" class="menu-item">Vector Maps</a>
              </li>
            </ul>
          </li>
          <li class=" nav-item"><a href="#"><i class="icon-paint-format"></i><span data-i18n="nav.color_palette.main" class="menu-title">Color Palette</span></a>
            <ul class="menu-content">
              <li><a href="color-palette-primary.html" data-i18n="nav.color_palette.color_palette_primary" class="menu-item">Primary palette</a>
              </li>
              <li><a href="color-palette-danger.html" data-i18n="nav.color_palette.color_palette_danger" class="menu-item">Danger palette</a>
              </li>
              <li><a href="color-palette-success.html" data-i18n="nav.color_palette.color_palette_success" class="menu-item">Success palette</a>
              </li>
              <li><a href="color-palette-warning.html" data-i18n="nav.color_palette.color_palette_warning" class="menu-item">Warning palette</a>
              </li>
              <li><a href="color-palette-info.html" data-i18n="nav.color_palette.color_palette_info" class="menu-item">Info palette</a>
              </li>
              <li class="navigation-divider"></li>
              <li><a href="color-palette-red.html" data-i18n="nav.color_palette.color_palette_red" class="menu-item">Red palette</a>
              </li>
              <li><a href="color-palette-pink.html" data-i18n="nav.color_palette.color_palette_pink" class="menu-item">Pink palette</a>
              </li>
              <li><a href="color-palette-purple.html" data-i18n="nav.color_palette.color_palette_purple" class="menu-item">Purple palette</a>
              </li>
              <li><a href="color-palette-deep-purple.html" data-i18n="nav.color_palette.color_palette_deep_purple" class="menu-item">Deep Purple palette</a>
              </li>
              <li><a href="color-palette-indigo.html" data-i18n="nav.color_palette.color_palette_indigo" class="menu-item">Indigo palette</a>
              </li>
              <li><a href="color-palette-blue.html" data-i18n="nav.color_palette.color_palette_blue" class="menu-item">Blue palette</a>
              </li>
              <li><a href="color-palette-light-blue.html" data-i18n="nav.color_palette.color_palette_light_blue" class="menu-item">Light Blue palette</a>
              </li>
              <li><a href="color-palette-cyan.html" data-i18n="nav.color_palette.color_palette_cyan" class="menu-item">Cyan palette</a>
              </li>
              <li><a href="color-palette-teal.html" data-i18n="nav.color_palette.color_palette_teal" class="menu-item">Teal palette</a>
              </li>
              <li><a href="color-palette-green.html" data-i18n="nav.color_palette.color_palette_green" class="menu-item">Green palette</a>
              </li>
              <li><a href="color-palette-light-green.html" data-i18n="nav.color_palette.color_palette_light_green" class="menu-item">Light Green palette</a>
              </li>
              <li><a href="color-palette-lime.html" data-i18n="nav.color_palette.color_palette_lime" class="menu-item">Lime palette</a>
              </li>
              <li><a href="color-palette-yellow.html" data-i18n="nav.color_palette.color_palette_yellow" class="menu-item">Yellow palette</a>
              </li>
              <li><a href="color-palette-amber.html" data-i18n="nav.color_palette.color_palette_amber" class="menu-item">Amber palette</a>
              </li>
              <li><a href="color-palette-orange.html" data-i18n="nav.color_palette.color_palette_orange" class="menu-item">Orange palette</a>
              </li>
              <li><a href="color-palette-deep-orange.html" data-i18n="nav.color_palette.color_palette_deep_orange" class="menu-item">Deep Orange palette</a>
              </li>
              <li><a href="color-palette-brown.html" data-i18n="nav.color_palette.color_palette_brown" class="menu-item">Brown palette</a>
              </li>
              <li><a href="color-palette-blue-grey.html" data-i18n="nav.color_palette.color_palette_blue_grey" class="menu-item">Blue Grey palette</a>
              </li>
              <li><a href="color-palette-grey.html" data-i18n="nav.color_palette.color_palette_grey" class="menu-item">Grey palette</a>
              </li>
            </ul>
          </li>
          <li class=" nav-item"><a href="changelog.html"><i class="icon-copy"></i><span data-i18n="nav.changelog.main" class="menu-title">Changelog</span><span class="tag tag tag-pill tag-danger float-xs-right">1.0</span></a>
          </li>
          <li class="disabled nav-item"><a href="#"><i class="icon-eye-disabled"></i><span data-i18n="nav.disabled_menu.main" class="menu-title">Disabled Menu</span></a>
          </li>
          <li class=" nav-item"><a href="#"><i class="icon-android-funnel"></i><span data-i18n="nav.menu_levels.main" class="menu-title">Menu levels</span></a>
            <ul class="menu-content">
              <li><a href="#" data-i18n="nav.menu_levels.second_level" class="menu-item">Second level</a>
              </li>
              <li><a href="#" data-i18n="nav.menu_levels.second_level_child.main" class="menu-item">Second level child</a>
                <ul class="menu-content">
                  <li><a href="#" data-i18n="nav.menu_levels.second_level_child.third_level" class="menu-item">Third level</a>
                  </li>
                  <li><a href="#" data-i18n="nav.menu_levels.second_level_child.third_level_child.main" class="menu-item">Third level child</a>
                    <ul class="menu-content">
                      <li><a href="#" data-i18n="nav.menu_levels.second_level_child.third_level_child.fourth_level1" class="menu-item">Fourth level</a>
                      </li>
                      <li><a href="#" data-i18n="nav.menu_levels.second_level_child.third_level_child.fourth_level2" class="menu-item">Fourth level</a>
                      </li>
                    </ul>
                  </li>
                </ul>
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
    <!-- / main menu-->

    <!-----------------------------/ main menu-------------------------------------->
      <div class="app-content content container-fluid">
      <div class="content-wrapper">
        <div class="content-header row">
        </div>
        <div class="content-body"><!-- stats -->
        
        
        <div id="result"></div>

        """),_display_(/*475.10*/content),format.raw/*475.17*/("""
        
     

        """),format.raw/*479.9*/("""</div>
      </div>
    </div>
    <!-- ////////////////////////////////////////////////////////////////////////////-->


    <footer class="footer footer-static footer-light navbar-border">
      <p class="clearfix text-muted text-sm-center mb-0 px-2"><span class="float-md-left d-xs-block d-md-inline-block">Copyright  &copy; 2017 <a href="https://www.apidevops.com" target="_blank" class="text-bold-800 grey darken-2">Apidevops </a>, All rights reserved. </span><span class="float-md-right d-xs-block d-md-inline-block"><i class="icon-heart5 pink"></i></span></p>
    </footer>

    <!-- BEGIN VENDOR JS-->
    <script src='"""),_display_(/*490.19*/routes/*490.25*/.Assets.at("javascripts/jquery-1.7.1.min.js")),format.raw/*490.70*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*491.19*/routes/*491.25*/.Assets.at("/app-assets/js/core/libraries/jquery.min.js")),format.raw/*491.82*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*492.19*/routes/*492.25*/.Assets.at("/app-assets/vendors/js/ui/tether.min.js")),format.raw/*492.78*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*493.19*/routes/*493.25*/.Assets.at("/app-assets/js/core/libraries/bootstrap.min.js")),format.raw/*493.85*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*494.19*/routes/*494.25*/.Assets.at("/app-assets/vendors/js/ui/perfect-scrollbar.jquery.min.js")),format.raw/*494.96*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*495.19*/routes/*495.25*/.Assets.at("/app-assets/vendors/js/ui/unison.min.js")),format.raw/*495.78*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*496.19*/routes/*496.25*/.Assets.at("/app-assets/vendors/js/ui/blockUI.min.js")),format.raw/*496.79*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*497.19*/routes/*497.25*/.Assets.at("/app-assets/vendors/js/ui/jquery.matchHeight-min.js")),format.raw/*497.90*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*498.19*/routes/*498.25*/.Assets.at("/app-assets/vendors/js/ui/screenfull.min.js" )),format.raw/*498.83*/("""'type="text/javascript"></script>
    <script src='"""),_display_(/*499.19*/routes/*499.25*/.Assets.at("/app-assets/vendors/js/extensions/pace.min.js")),format.raw/*499.84*/("""' type="text/javascript"></script>
    <!-- BEGIN VENDOR JS-->
    <!-- BEGIN PAGE VENDOR JS-->
    <script src='"""),_display_(/*502.19*/routes/*502.25*/.Assets.at("/app-assets/vendors/js/charts/chart.min.js")),format.raw/*502.81*/("""' type="text/javascript"></script>
    <!-- END PAGE VENDOR JS-->
    <!-- BEGIN ROBUST JS-->
    <script src='"""),_display_(/*505.19*/routes/*505.25*/.Assets.at("/app-assets/js/core/app-menu.js")),format.raw/*505.70*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*506.19*/routes/*506.25*/.Assets.at("/app-assets/js/core/app.js")),format.raw/*506.65*/("""' type="text/javascript"></script>
    <!-- END ROBUST JS-->
    <!-- BEGIN PAGE LEVEL JS-->
    <script src='"""),_display_(/*509.19*/routes/*509.25*/.Assets.at("/app-assets/js/scripts/pages/dashboard-lite.js")),format.raw/*509.85*/("""' type="text/javascript"></script>
    <!-- END PAGE LEVEL JS-->
    <script src='"""),_display_(/*511.19*/routes/*511.25*/.Assets.at("javascripts/apidevops.js")),format.raw/*511.63*/("""' type="text/javascript"></script>
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
                  DATE: Sun Oct 15 21:54:48 IST 2017
                  SOURCE: /home/dinesh/Documents/devlopment/apidevops/apidevops-git/apidevops/app/views/main.scala.html
                  HASH: 170d5aa0f9417edb189c6ac258a30610916d94dc
                  MATRIX: 726->1|836->16|864->18|1360->487|1375->493|1451->547|1535->604|1550->610|1626->664|1712->723|1727->729|1804->784|1890->843|1905->849|1982->904|2069->964|2084->970|2154->1018|2238->1075|2253->1081|2326->1132|2405->1184|2420->1190|2475->1224|2559->1281|2574->1287|2627->1319|2926->1591|2941->1597|3006->1640|3109->1716|3124->1722|3189->1765|3269->1818|3284->1824|3373->1891|3453->1944|3468->1950|3547->2007|3683->2116|3698->2122|3772->2174|3852->2227|3867->2233|3925->2270|4005->2323|4020->2329|4081->2369|4221->2482|4236->2488|4326->2556|4406->2609|4421->2615|4519->2691|4599->2744|4614->2750|4698->2812|4838->2925|4853->2931|4909->2966|6647->4677|6662->4683|6706->4706|37546->35498|37575->35505|37628->35530|38284->36158|38300->36164|38367->36209|38448->36262|38464->36268|38543->36325|38624->36378|38640->36384|38715->36437|38796->36490|38812->36496|38894->36556|38975->36609|38991->36615|39084->36686|39165->36739|39181->36745|39256->36798|39337->36851|39353->36857|39429->36911|39510->36964|39526->36970|39613->37035|39694->37088|39710->37094|39790->37152|39870->37204|39886->37210|39967->37269|40109->37383|40125->37389|40203->37445|40343->37557|40359->37563|40426->37608|40507->37661|40523->37667|40585->37707|40724->37818|40740->37824|40822->37884|40933->37967|40949->37973|41009->38011
                  LINES: 21->1|26->1|28->3|36->11|36->11|36->11|37->12|37->12|37->12|38->13|38->13|38->13|39->14|39->14|39->14|40->15|40->15|40->15|41->16|41->16|41->16|42->17|42->17|42->17|43->18|43->18|43->18|48->23|48->23|48->23|50->25|50->25|50->25|51->26|51->26|51->26|52->27|52->27|52->27|55->30|55->30|55->30|56->31|56->31|56->31|57->32|57->32|57->32|60->35|60->35|60->35|61->36|61->36|61->36|62->37|62->37|62->37|65->40|65->40|65->40|85->60|85->60|85->60|501->475|501->475|505->479|516->490|516->490|516->490|517->491|517->491|517->491|518->492|518->492|518->492|519->493|519->493|519->493|520->494|520->494|520->494|521->495|521->495|521->495|522->496|522->496|522->496|523->497|523->497|523->497|524->498|524->498|524->498|525->499|525->499|525->499|528->502|528->502|528->502|531->505|531->505|531->505|532->506|532->506|532->506|535->509|535->509|535->509|537->511|537->511|537->511
                  -- GENERATED --
              */
          