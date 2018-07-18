package factoryRequest;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import static helpers.MyValues.Authentication;
import static helpers.MyValues.Authentication_value;
import static helpers.MyValues.SERVER_MAIN_URL;

public class Put implements IRequest {
    @Override
    public CustomReponse send(String path, String body) {
        WebTarget target = client.target(SERVER_MAIN_URL + path);
        Entity entity = Entity.json(body);
        Response response_actual = target.request(MediaType.APPLICATION_JSON_TYPE).header(Authentication, Authentication_value).put(entity);

        CustomReponse response = new CustomReponse(response_actual.readEntity(String.class).toString(),
                response_actual.getStatus(),
                response_actual.getStatusInfo().toString());

        response_actual.close();
        return response;
    }
}
