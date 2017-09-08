package cn.vic.test;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;


/**
 * http://www.mkyong.com/tutorials/jax-rs-tutorials/
 * @author Victor
 */
public class JerseyClientGet {
	
	public static void main(String[] args) {
		
		Client client = Client.create();
		WebResource webResource = client.resource("http://localhost:8080/restfulexample/rest/json/cardiovascular/get");
		ClientResponse clientResponse = webResource.accept("application/json").get(ClientResponse.class);
		if(clientResponse.getStatus() != 200) {
			throw new RuntimeException("Failed : HTTP error code : " + clientResponse.getStatus());
		}
		
		String output = clientResponse.getEntity(String.class);
		
		System.out.println("Output from Server ... \n");
		System.out.println(output);
		
	}
	
}
