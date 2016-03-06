package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {
  
  def index = Action {
//    Ok(views.html.index("Your new application is ready."))
    Ok("Sammy is Here")
  }

  def hello(name: String) = Action {
    Ok(views.html.hello(name))
  }
  
}