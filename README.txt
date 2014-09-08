This simple application shows basics in developing web services in REST style with JAX-RS.
Such features are covered in this project:
	- path mapping (@Path)
	- data type resolving (@Produces & @Consumes)
	- objects marshalling and unmarshalling(JAXB & Jackson-lib)
	- exceptions mapping (javax.ws.rs.ext.ExceptionMapper)
	- manual response building (import javax.ws.rs.core.Response.ResponseBuilder)

======================================================================================

Running
In order to run this application you have to have Maven correctly installed. 
Type "mvn jetty:run" in cmd and wait while the application will be deployed.
After deployment you can access web interface to interact with service by this link:
http://localhost:8080/RESTeasily/index.html