package cn.vic.test;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class JerseyClientPost {

	public static void main(String[] args) {
		Client client = Client.create();
		
		WebResource webResource = client.resource("http://localhost:8080/restfulexample/rest/json/cardiovascular/post");
		
		String input = "{title:t1,singer:s1}";
		
		ClientResponse response = webResource.type("application/json").post(ClientResponse.class, input);
		
		if(response.getStatus() != 200) {
			throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
		}
		
		System.out.println("Output from Server ... \n");
		String output = response.getEntity(String.class);
		System.out.println(output);
		
		
		
	}
	
}
