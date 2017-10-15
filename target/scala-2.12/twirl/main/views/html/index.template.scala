
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main/*3.6*/ {_display_(Seq[Any](format.raw/*3.8*/("""

    """),format.raw/*5.5*/("""<h2>Comet Clock</h2>
    <div>
        <div><a href=""""),_display_(/*7.24*/routes/*7.30*/.ScalaCometController.index()),format.raw/*7.59*/("""">Scala Comet</a></div>
    </div>


    <h2>Server Sent Event Clock</h2>
    <div>
        <div><a href=""""),_display_(/*13.24*/routes/*13.30*/.ScalaEventSourceController.index()),format.raw/*13.65*/("""">Scala EventSource</a></div>
    </div>
""")))}),format.raw/*15.2*/("""
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
                  DATE: Sun Oct 15 18:37:44 IST 2017
                  SOURCE: /home/dinesh/Documents/devlopment/apidevops/apidevops-git/apidevops/app/views/index.scala.html
                  HASH: bf393b33052d6a274dd86de7d49cf9914734bea8
                  MATRIX: 722->1|818->3|846->6|857->10|895->12|927->18|1007->72|1021->78|1070->107|1204->214|1219->220|1275->255|1347->297
                  LINES: 21->1|26->1|28->3|28->3|28->3|30->5|32->7|32->7|32->7|38->13|38->13|38->13|40->15
                  -- GENERATED --
              */
          