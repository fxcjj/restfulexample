package cn.vic.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import cn.vic.rest.entity.Track;

@Path("/json/cardiovascular")
public class JSONService {
	
	/**
	 * ����ת��Ϊjson
	 * @return
	 */
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Track getTrackInJSON() {
		Track t = new Track();
		t.setTitle("t");
		t.setSinger("s");
		return t;
	}
	
	/**
	 * jsonת��Ϊ����
	 * @return
	 */
	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createTrackInJSON(Track track) {
		String result = "Track saved: " + track;
		return Response.status(200).entity(result).build();
	}

}
