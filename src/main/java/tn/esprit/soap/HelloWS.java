package tn.esprit.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(
		targetNamespace = "http://greeting.tn", 
		name = "greetingPortType", 
		portName = "greetingPort", 
		serviceName = "greetingService")

public class HelloWS {

	@WebMethod(operationName = "greetingOperation")
	@WebResult(name = "greeting")
	public String sayHello() {
		return ("Hello from JAXWS");
	}

	@WebMethod(operationName = "greetingToOperation")
	@WebResult(name = "greetingTo")
	public String sayHelloTo(
			@WebParam(name="nom") String name,
			@WebParam(name="prenom") String prenom) {
		return ("Hello from JAXWS " + name + prenom);
	}

}
