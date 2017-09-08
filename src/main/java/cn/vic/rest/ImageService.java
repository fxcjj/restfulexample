package cn.vic.rest;

import java.io.File;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/image")
public class ImageService {
	
	private static final String FILE_PATH = "D:\\a.png";
	
	@GET
	@Path("/get")
	@Produces("image/png")
	public Response getFile() {
		File file = new File(FILE_PATH);
		ResponseBuilder response = Response.ok(file);
		response.header("Content-Disposition", "attachment; filename=image_from_server.png");
		return response.build();
				
	}
}