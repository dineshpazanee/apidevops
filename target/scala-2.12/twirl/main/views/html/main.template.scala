
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
              <li class="nav-item hidden-sm-down"><a href="https://pixinvent.com/bootstrap-admin-template/robust/" target="_blank" class="btn btn-success upgrade-to-pro">Upgrade to PRO $24</a></li>
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
              <li><a h"""),
format.raw("""ref="component-pills-component.html" data-i18n="nav.components.component_pills_component" class="menu-item">Pills Component</a>
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
              <li><a href="icons-ico-moon.html" data-i18n="nav.icons.icons_ico_moon" class="menu-item">Ico Moon</a>
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

    <div class="app-content content container-fluid">
      <div class="content-wrapper">
        <div class="content-header row">
        </div>
        <div class="content-body"><!-- stats -->
<div class="row">
    <div class="col-xl-3 col-lg-6 col-xs-12">
        <div class="card">
            <div class="card-body">
                <div class="card-block">
                    <div class="media">
                        <div class="media-body text-xs-left">
                            <h3 class="pink">278</h3>
                            <span>New Projects</span>
                        </div>
                        <div class="media-right media-middle">
                            <i class="icon-bag2 pink font-large-2 float-xs-right"></i>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="col-xl-3 col-lg-6 col-xs-12">
        <div class="card">
            <div class="card-body">
                <div class="card-block">
                    <div class="media">
                        <div class="media-body text-xs-left">
                            <h3 class="teal">156</h3>
                            <span>New Clients</span>
                        </div>
                        <div class="media-right media-middle">
                            <i class="icon-user1 teal font-large-2 float-xs-right"></i>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="col-xl-3 col-lg-6 col-xs-12">
        <div class="card">
            <div class="card-body">
                <div class="card-block">
                    <div class="media">
                        <div class="media-body text-xs-left">
                            <h3 class="deep-orange">64.89 %</h3>
                            <span>Conversion Rate</span>
                        </div>
                        <div class="media-right media-middle">
                            <i class="icon-diagram deep-orange font-large-2 float-xs-right"></i>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="col-xl-3 col-lg-6 col-xs-12">
        <div class="card">
            <div class="card-body">
                <div class="card-block">
                    <div class="media">
                        <div class="media-body text-xs-left">
                            <h3 class="cyan">423</h3>
                            <span>Support Tickets</span>
                        </div>
                        <div class="media-right media-middle">
                            <i class="icon-ios-help-outline cyan font-large-2 float-xs-right"></i>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!--/ stats -->
<!--/ project charts -->
<div class="row">
    <div class="col-xl-8 col-lg-12">
        <div class="card">
            <div class="card-body">
                <ul class="list-inline text-xs-center pt-2 m-0">
                    <li class="mr-1">
                        <h6><i class="icon-circle warning"></i> <span class="grey darken-1">Remaining</span></h6>
                    </li>
                    <li class="mr-1">
                        <h6><i class="icon-circle success"></i> <span class="grey darken-1">Completed</span></h6>
                    </li>
                </ul>
                <div class="chartjs height-250">
                    <canvas id="line-stacked-area" height="250"></canvas>
                </div>
            </div>
            <div class="card-footer">
                <div class="row">
                    <div class="col-xs-3 text-xs-center">
                        <span class="text-muted">Total Projects</span>
                        <h2 class="block font-weight-normal">18</h2>
                        <progress class="progress progress-xs mt-2 progress-success" value="70" max="100"></progress>
                    </div>
                    <div class="col-xs-3 text-xs-center">
                        <span class="text-muted">Total Task</span>
                        <h2 class="block font-weight-normal">125</h2>
                        <progress class="progress progress-xs mt-2 progress-success" value="40" max="100"></progress>
                    </div>
                    <div class="col-xs-3 text-xs-center">
                        <span class="text-muted">Completed Task</span>
                        <h2 class="block font-weight-normal">242</h2>
                        <progress class="progress progress-xs mt-2 progress-success" value="60" max="100"></progress>
                    </div>
                    <div class="col-xs-3 text-xs-center">
                        <span class="text-muted">Total Revenue</span>
                        <h2 class="block font-weight-normal">$11,582</h2>
                        <progress class="progress progress-xs mt-2 progress-success" value="90" max="100"></progress>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="col-xl-4 col-lg-12">
        <div class="card card-inverse bg-info">
            <div class="card-body">
                <div class="position-relative">
                    <div class="chart-title position-absolute mt-2 ml-2 white">
                        <h1 class="display-4">84%</h1>
                        <span>Employees Satisfied</span>
                    </div>
                    <canvas id="emp-satisfaction" class="height-400 block"></canvas>
                    <div class="chart-stats position-absolute position-bottom-0 position-right-0 mb-2 mr-3 white">
                        <a href="#" class="btn bg-info bg-darken-3 mr-1 white">Statistics <i class="icon-stats-bars"></i></a> for the last year.
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!--/ project charts -->
<!-- Recent invoice with Statistics -->
<div class="row match-height">
    <div class="col-xl-4 col-lg-12">
        <div class="card">
            <div class="card-body">
                <div class="media">
                    <div class="p-2 text-xs-center bg-deep-orange media-left media-middle">
                        <i class="icon-user1 font-large-2 white"></i>
                    </div>
                    <div class="p-2 media-body">
                        <h5 class="deep-orange">New Users</h5>
                        <h5 class="text-bold-400">1,22,356</h5>
                        <progress class="progress progress-sm progress-deep-orange mt-1 mb-0" value="45" max="100"></progress>
                    </div>
                </div>
            </div>
        </div>
        <div class="card">
            <div class="card-body">
                <div class="media">
                    <div class="p-2 text-xs-center bg-cyan media-left media-middle">
                        <i class="icon-camera7 font-large-2 white"></i>
                    </div>
                    <div class="p-2 media-body">
                        <h5>New Products</h5>
                        <h5 class="text-bold-400">28</h5>
                    </div>
                </div>
            </div>
        </div>
        <div class="card">
            <div class="card-body">
                <div class="media">
                    <div class="p-2 media-body text-xs-left">
                        <h5>New Users</h5>
                        <h5 class="text-bold-400">1,22,356</h5>
                    </div>
                    <div class="p-2 text-xs-center bg-teal media-right media-middle">
                        <i class="icon-user1 font-large-2 white">"""),
format.raw("""</i>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="col-xl-8 col-lg-12">
        <div class="card">
            <div class="card-header">
                <h4 class="card-title">Recent Invoices</h4>
                <a class="heading-elements-toggle"><i class="icon-ellipsis font-medium-3"></i></a>
                <div class="heading-elements">
                    <ul class="list-inline mb-0">
                        <li><a data-action="reload"><i class="icon-reload"></i></a></li>
                        <li><a data-action="expand"><i class="icon-expand2"></i></a></li>
                    </ul>
                </div>
            </div>
            <div class="card-body">
                <div class="card-block">
                    <p>Total paid invoices 240, unpaid 150. <span class="float-xs-right"><a href="#">Invoice Summary <i class="icon-arrow-right2"></i></a></span></p>
                </div>
                <div class="table-responsive">
                    <table class="table table-hover mb-0">
                        <thead>
                            <tr>
                                <th>Invoice#</th>
                                <th>Customer Name</th>
                                <th>Status</th>
                                <th>Due</th>
                                <th>Amount</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td class="text-truncate"><a href="#">INV-001001</a></td>
                                <td class="text-truncate">Elizabeth W.</td>
                                <td class="text-truncate"><span class="tag tag-default tag-success">Paid</span></td>
                                <td class="text-truncate">10/05/2016</td>
                                <td class="text-truncate">$ 1200.00</td>
                            </tr>
                            <tr>
                                <td class="text-truncate"><a href="#">INV-001012</a></td>
                                <td class="text-truncate">Andrew D.</td>
                                <td class="text-truncate"><span class="tag tag-default tag-success">Paid</span></td>
                                <td class="text-truncate">20/07/2016</td>
                                <td class="text-truncate">$ 152.00</td>
                            </tr>
                            <tr>
                                <td class="text-truncate"><a href="#">INV-001401</a></td>
                                <td class="text-truncate">Megan S.</td>
                                <td class="text-truncate"><span class="tag tag-default tag-success">Paid</span></td>
                                <td class="text-truncate">16/11/2016</td>
                                <td class="text-truncate">$ 1450.00</td>
                            </tr>
                            <tr>
                                <td class="text-truncate"><a href="#">INV-01112</a></td>
                                <td class="text-truncate">Doris R.</td>
                                <td class="text-truncate"><span class="tag tag-default tag-warning">Overdue</span></td>
                                <td class="text-truncate">11/12/2016</td>
                                <td class="text-truncate">$ 5685.00</td>
                            </tr>
                            <tr>
                                <td class="text-truncate"><a href="#">INV-008101</a></td>
                                <td class="text-truncate">Walter R.</td>
                                <td class="text-truncate"><span class="tag tag-default tag-warning">Overdue</span></td>
                                <td class="text-truncate">18/05/2016</td>
                                <td class="text-truncate">$ 685.00</td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Recent invoice with Statistics -->
<div class="row match-height">
    <div class="col-xl-4 col-md-6 col-sm-12">
        <div class="card" style="height: 440px;">
            <div class="card-body">
                <img class="card-img-top img-fluid" src="../../app-assets/images/carousel/05.jpg" alt="Card image cap">
                <div class="card-block">
                    <h4 class="card-title">Basic</h4>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                    <a href="#" class="btn btn-outline-pink">Go somewhere</a>
                </div>
            </div>
        </div>
    </div>
    <div class="col-xl-4 col-md-6 col-sm-12">
        <div class="card" style="height: 440px;">
            <div class="card-body">
                <div class="card-block">
                    <h4 class="card-title">List Group</h4>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                </div>
                <ul class="list-group list-group-flush">
                    <li class="list-group-item">
                        <span class="tag tag-default tag-pill bg-primary float-xs-right">4</span> Cras justo odio
                    </li>
                    <li class="list-group-item">
                        <span class="tag tag-default tag-pill bg-info float-xs-right">2</span> Dapibus ac facilisis in
                    </li>
                    <li class="list-group-item">
                        <span class="tag tag-default tag-pill bg-warning float-xs-right">1</span> Morbi leo risus
                    </li>
                    <li class="list-group-item">
                        <span class="tag tag-default tag-pill bg-success float-xs-right">3</span> Porta ac consectetur ac
                    </li>
                    <li class="list-group-item">
                        <span class="tag tag-default tag-pill bg-danger float-xs-right">8</span> Vestibulum at eros
                    </li>
                </ul>
                <div class="card-block">
                    <a href="#" class="card-link">Card link</a>
                    <a href="#" class="card-link">Another link</a>
                </div>
            </div>
        </div>
    </div>
    <div class="col-xl-4 col-md-12 col-sm-12">
        <div class="card" style="height: 440px;">
            <div class="card-body">
                <div class="card-block">
                    <h4 class="card-title">Carousel</h4>
                    <h6 class="card-subtitle text-muted">Support card subtitle</h6>
                </div>
                <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
                    <ol class="carousel-indicators">
                        <li data-target="#carousel-example-generic" data-slide-to="0" class=""></li>
                        <li data-target="#carousel-example-generic" data-slide-to="1" class="active"></li>
                        <li data-target="#carousel-example-generic" data-slide-to="2" class=""></li>
                    </ol>
                    <div class="carousel-inner" role="listbox">
                        <div class="carousel-item">
                            <img src="../../app-assets/images/carousel/02.jpg" alt="First slide">
                        </div>
                        <div class="carousel-item active">
                            <img src="../../app-assets/images/carousel/03.jpg" alt="Second slide">
                        </div>
                        <div class="carousel-item">
                            <img src="../../app-assets/images/carousel/01.jpg" alt="Third slide">
                        </div>
                    </div>
                    <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
                        <span class="icon-prev" aria-hidden="true"></span>
                        <span class="sr-only">Previous</span>
                    </a>
                    <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
                        <span class="icon-next" aria-hidden="true"></span>
                        <span class="sr-only">Next</span>
                    </a>
                </div>
                <div class="card-block">
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                </div>
            </div>
        </div>
    </div>
</div>

        </div>
      </div>
    </div>
    <!-- ////////////////////////////////////////////////////////////////////////////-->


    <!-- main menu-->
    
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
        
        
        <div id="result"></div>

        """),_display_(/*823.10*/content),format.raw/*823.17*/("""
        
     

        """),format.raw/*827.9*/("""</div>
      </div>
    </div>
    <!-- ////////////////////////////////////////////////////////////////////////////-->


    <footer class="footer footer-static footer-light navbar-border">
      <p class="clearfix text-muted text-sm-center mb-0 px-2"><span class="float-md-left d-xs-block d-md-inline-block">Copyright  &copy; 2017 <a href="https://www.apidevops.com" target="_blank" class="text-bold-800 grey darken-2">Apidevops </a>, All rights reserved. </span><span class="float-md-right d-xs-block d-md-inline-block"><i class="icon-heart5 pink"></i></span></p>
    </footer>

    <!-- BEGIN VENDOR JS-->
    <script src=""""),_display_(/*838.19*/routes/*838.25*/.Assets.at("javascripts/jquery-1.7.1.min.js")),format.raw/*838.70*/("""" type="text/javascript"></script>
    <script src='"""),_display_(/*839.19*/routes/*839.25*/.Assets.at("/app-assets/js/core/libraries/jquery.min.js")),format.raw/*839.82*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*840.19*/routes/*840.25*/.Assets.at("/app-assets/vendors/js/ui/tether.min.js")),format.raw/*840.78*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*841.19*/routes/*841.25*/.Assets.at("/app-assets/js/core/libraries/bootstrap.min.js")),format.raw/*841.85*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*842.19*/routes/*842.25*/.Assets.at("/app-assets/vendors/js/ui/perfect-scrollbar.jquery.min.js")),format.raw/*842.96*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*843.19*/routes/*843.25*/.Assets.at("/app-assets/vendors/js/ui/unison.min.js")),format.raw/*843.78*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*844.19*/routes/*844.25*/.Assets.at("/app-assets/vendors/js/ui/blockUI.min.js")),format.raw/*844.79*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*845.19*/routes/*845.25*/.Assets.at("/app-assets/vendors/js/ui/jquery.matchHeight-min.js")),format.raw/*845.90*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*846.19*/routes/*846.25*/.Assets.at("/app-assets/vendors/js/ui/screenfull.min.js" )),format.raw/*846.83*/("""'type="text/javascript"></script>
    <script src='"""),_display_(/*847.19*/routes/*847.25*/.Assets.at("/app-assets/vendors/js/extensions/pace.min.js")),format.raw/*847.84*/("""' type="text/javascript"></script>
    <!-- BEGIN VENDOR JS-->
    <!-- BEGIN PAGE VENDOR JS-->
    <script src='"""),_display_(/*850.19*/routes/*850.25*/.Assets.at("/app-assets/vendors/js/charts/chart.min.js")),format.raw/*850.81*/("""' type="text/javascript"></script>
    <!-- END PAGE VENDOR JS-->
    <!-- BEGIN ROBUST JS-->
    <script src='"""),_display_(/*853.19*/routes/*853.25*/.Assets.at("/app-assets/js/core/app-menu.js")),format.raw/*853.70*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*854.19*/routes/*854.25*/.Assets.at("/app-assets/js/core/app.js")),format.raw/*854.65*/("""' type="text/javascript"></script>
    <!-- END ROBUST JS-->
    <!-- BEGIN PAGE LEVEL JS-->
    <script src='"""),_display_(/*857.19*/routes/*857.25*/.Assets.at("/app-assets/js/scripts/pages/dashboard-lite.js")),format.raw/*857.85*/("""' type="text/javascript"></script>
    <!-- END PAGE LEVEL JS-->
    <script src=""""),_display_(/*859.19*/routes/*859.25*/.Assets.at("javascripts/apidevops.js")),format.raw/*859.63*/("""" type="text/javascript"></script>
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
                  DATE: Sun Oct 15 18:41:30 IST 2017
                  SOURCE: /home/dinesh/Documents/devlopment/apidevops/apidevops-git/apidevops/app/views/main.scala.html
                  HASH: 95dab06e4e413675b552ea1dd0013ae13f54c9aa
                  MATRIX: 726->1|836->16|864->18|1360->487|1375->493|1451->547|1535->604|1550->610|1626->664|1712->723|1727->729|1804->784|1890->843|1905->849|1982->904|2069->964|2084->970|2154->1018|2238->1075|2253->1081|2326->1132|2405->1184|2420->1190|2475->1224|2559->1281|2574->1287|2627->1319|2926->1591|2941->1597|3006->1640|3109->1716|3124->1722|3189->1765|3269->1818|3284->1824|3373->1891|3453->1944|3468->1950|3547->2007|3683->2116|3698->2122|3772->2174|3852->2227|3867->2233|3925->2270|4005->2323|4020->2329|4081->2369|4221->2482|4236->2488|4326->2556|4406->2609|4421->2615|4519->2691|4599->2744|4614->2750|4698->2812|4838->2925|4853->2931|4909->2966|54405->52394|54434->52401|54487->52426|55143->53054|55159->53060|55226->53105|55307->53158|55323->53164|55402->53221|55483->53274|55499->53280|55574->53333|55655->53386|55671->53392|55753->53452|55834->53505|55850->53511|55943->53582|56024->53635|56040->53641|56115->53694|56196->53747|56212->53753|56288->53807|56369->53860|56385->53866|56472->53931|56553->53984|56569->53990|56649->54048|56729->54100|56745->54106|56826->54165|56968->54279|56984->54285|57062->54341|57202->54453|57218->54459|57285->54504|57366->54557|57382->54563|57444->54603|57583->54714|57599->54720|57681->54780|57792->54863|57808->54869|57868->54907
                  LINES: 21->1|26->1|28->3|36->11|36->11|36->11|37->12|37->12|37->12|38->13|38->13|38->13|39->14|39->14|39->14|40->15|40->15|40->15|41->16|41->16|41->16|42->17|42->17|42->17|43->18|43->18|43->18|48->23|48->23|48->23|50->25|50->25|50->25|51->26|51->26|51->26|52->27|52->27|52->27|55->30|55->30|55->30|56->31|56->31|56->31|57->32|57->32|57->32|60->35|60->35|60->35|61->36|61->36|61->36|62->37|62->37|62->37|65->40|65->40|65->40|850->823|850->823|854->827|865->838|865->838|865->838|866->839|866->839|866->839|867->840|867->840|867->840|868->841|868->841|868->841|869->842|869->842|869->842|870->843|870->843|870->843|871->844|871->844|871->844|872->845|872->845|872->845|873->846|873->846|873->846|874->847|874->847|874->847|877->850|877->850|877->850|880->853|880->853|880->853|881->854|881->854|881->854|884->857|884->857|884->857|886->859|886->859|886->859
                  -- GENERATED --
              */
          