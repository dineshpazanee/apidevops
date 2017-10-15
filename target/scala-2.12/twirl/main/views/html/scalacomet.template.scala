
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

object scalacomet extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main/*1.6*/ {_display_(Seq[Any](format.raw/*1.8*/("""

    """),format.raw/*3.5*/("""<h1>Comet clock</h1>

    <h1 id="clock"></h1>

    <p>
        Clock events are pushed from the Server using a Comet connection.
    </p>

    <script type="text/javascript" charset="utf-8">
            // Called for each Comet message
            var clockChanged = function(time) """),format.raw/*13.47*/("""{"""),format.raw/*13.48*/("""
                """),format.raw/*14.17*/("""$('#clock').html(time.replace(/(\d)/g, '<span>$1</span>'))
            """),format.raw/*15.13*/("""}"""),format.raw/*15.14*/("""
    """),format.raw/*16.5*/("""</script>

    <iframe id="comet" src=""""),_display_(/*18.30*/routes/*18.36*/.ScalaCometController.streamClock.unique),format.raw/*18.76*/(""""></iframe>

""")))}),format.raw/*20.2*/("""
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
                  DATE: Sun Oct 15 20:01:27 IST 2017
                  SOURCE: /home/dinesh/Documents/devlopment/apidevops/apidevops-git/apidevops/app/views/scalacomet.scala.html
                  HASH: b72c8d98f7481e9c5d3d2fb3fc0666f79b326a0f
                  MATRIX: 816->1|827->5|865->7|897->13|1208->296|1237->297|1282->314|1381->385|1410->386|1442->391|1509->431|1524->437|1585->477|1629->491
                  LINES: 26->1|26->1|26->1|28->3|38->13|38->13|39->14|40->15|40->15|41->16|43->18|43->18|43->18|45->20
                  -- GENERATED --
              */
          