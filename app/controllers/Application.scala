package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Time Attack!"))
  }
  def aboutMe = Action {
    Ok(views.html.aboutme("About me"))
  }

  def architecture = Action {
    Ok(views.html.architecture("Architecture"))
  }
  
  def heroku = Action {
    Ok(views.html.heroku("Heroku setup"))
  }
  
  def demoSetup = Action {
    Ok(views.html.demoSetup("Demo setup"))
  }
  
  def summary = Action {
    Ok(views.html.summary("Summary"))
  }
}