package hello

import org.springframework.boot.SpringApplication
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.{RequestMapping, RestController}
/**
 * This object bootstraps Spring Boot web application.
 * Via Gradle: gradle bootRun
 *
 * @author saung
 * @since 1.0
 */
object HelloWebApplication {

	def main(args: Array[String]) {
	   SpringApplication.run(classOf[HelloConfig]);
	}
}

@RestController
class HelloWorld
{
  @RequestMapping(value=Array{"/"},method = Array(RequestMethod.GET))
  def sayHello(): String =
  {
    "Hello World!!!"
  }
}