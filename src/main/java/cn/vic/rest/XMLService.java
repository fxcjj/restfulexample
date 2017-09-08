package cn.vic.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import cn.vic.rest.entity.Customer;

@Path("/xml/customer")
public class XMLService {
	
	@GET
	@Path("/{pin}")
	@Produces(MediaType.APPLICATION_XML)
	public Customer getCustomerInXML(@PathParam("pin") int pin) {
		Customer c = new Customer();
		c.setName("martin");
		c.setPin(pin);
		return c;
	}
	
}
