
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

object user extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main/*3.6*/ {_display_(Seq[Any](format.raw/*3.8*/("""
	
	
	"""),format.raw/*6.2*/("""<div class="col-md-6">
			<div class="card">
				<div class="card-header">
					<h4 class="card-title" id="basic-layout-colored-form-control">User Profile</h4>
					<a class="heading-elements-toggle"><i class="icon-ellipsis font-medium-3"></i></a>
					<div class="heading-elements">
						<ul class="list-inline mb-0">
							<li><a data-action="collapse"><i class="icon-minus4"></i></a></li>
							<li><a data-action="reload"><i class="icon-reload"></i></a></li>
							<li><a data-action="expand"><i class="icon-expand2"></i></a></li>
							<li><a data-action="close"><i class="icon-cross2"></i></a></li>
						</ul>
					</div>
				</div>
				<div class="card-body collapse in">
					<div class="card-block">

						<div class="card-text">
							<p>You can always change the border color of the form controls using <code>border-*</code> class. In this example we have user <code>border-primary</code> class for form controls. Form action buttons are on the bottom right position.</p>
						</div>

						<form class="form">
							<div class="form-body">
								<h4 class="form-section"><i class="icon-eye6"></i> About User</h4>
								<div class="row">
									<div class="col-md-6">
										<div class="form-group">
											<label for="userinput1">Fist Name</label>
											<input type="text" id="userinput1" class="form-control border-primary" placeholder="Name" name="name">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<label for="userinput2">Last Name</label>
											<input type="text" id="userinput2" class="form-control border-primary" placeholder="Company" name="company">
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-md-6">
										<div class="form-group">
											<label for="userinput3">Username</label>
											<input type="text" id="userinput3" class="form-control border-primary" placeholder="Username" name="username">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<label for="userinput4">Nick Name</label>
											<input type="text" id="userinput4" class="form-control border-primary" placeholder="Nick Name" name="nickname">
										</div>
									</div>
								</div>

								<h4 class="form-section"><i class="icon-mail6"></i> Contact Info & Bio</h4>

								<div class="form-group">
									<label for="userinput5">Email</label>
									<input class="form-control border-primary" type="email" placeholder="email" id="userinput5">
								</div>

								<div class="form-group">
									<label for="userinput6">Website</label>
									<input class="form-control border-primary" type="url" placeholder="http://" id="userinput6">
								</div>

								<div class="form-group">
									<label>Contact Number</label>
									<input class="form-control border-primary" id="userinput7" type="tel" placeholder="Contact Number">
								</div>

								<div class="form-group">
									<label for="userinput8">Bio</label>
									<textarea id="userinput8" rows="5" class="form-control border-primary" name="bio" placeholder="Bio"></textarea>
								</div>

							</div>

							<div class="form-actions right">
								<button type="button" class="btn btn-warning mr-1">
									<i class="icon-cross2"></i> Cancel
								</button>
								<button type="submit" class="btn btn-primary">
									<i class="icon-check2"></i> Save
								</button>
							</div>
						</form>

					</div>
				</div>
			</div>
		</div>
	</div>
	
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Oct 15 18:37:43 IST 2017
                  SOURCE: /home/dinesh/Documents/devlopment/apidevops/apidevops-git/apidevops/app/views/user.scala.html
                  HASH: dae1d54822d89ec55e87008ab56a9053c2860a79
                  MATRIX: 721->1|817->3|845->6|856->10|894->12|926->18
                  LINES: 21->1|26->1|28->3|28->3|28->3|31->6
                  -- GENERATED --
              */
          