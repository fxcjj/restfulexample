package cn.vic.rest;

import java.io.File;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/pdf")
public class PdfService {
	
	private static final String FILE_PATH = "D:\\a.pdf";
	
	@GET
	@Path("/get")
	@Produces("application/pdf")
	public Response getFile() {
		File file = new File(FILE_PATH);
		ResponseBuilder response = Response.ok(file);
		response.header("Content-Disposition", "attachment; filename=shi.pdf");
		return response.build();
				
	}
}
