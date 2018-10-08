package factoryRequest;
import helpers.Logger;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import static helpers.MyValues.Authentication;
import static helpers.MyValues.Authentication_value;
import static helpers.MyValues.SERVER_MAIN_URL;


public class Post implements IRequest{

    public CustomReponse send(String path, String body) {
        Response response_actual;
        WebTarget target = client.target(SERVER_MAIN_URL + path);
        Logger.getInstance().write("Request : ","INFO");
        Logger.getInstance().write("POST : "+SERVER_MAIN_URL + path,"INFO");
        Logger.getInstance().write("Body : "+body,"INFO");

        Entity entity = Entity.json(body);
        response_actual = target.request(MediaType.APPLICATION_JSON_TYPE).header(Authentication, Authentication_value).post(entity);
        CustomReponse response = new CustomReponse(response_actual.readEntity(String.class).toString(),
                response_actual.getStatus(),
                response_actual.getStatusInfo().toString());
        response_actual.close();
        Logger.getInstance().write("Response : ","INFO");
        Logger.getInstance().write("Body : "+response.getJsonBody(),"INFO");
        Logger.getInstance().write("Code Status :"+response.getCodeStatus(),"INFO");

        return response;
    }
}
