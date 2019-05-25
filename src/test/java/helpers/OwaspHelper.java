package helpers;

import factoryRequest.CustomReponse;
import factoryRequest.FactoryRequest;
import org.json.JSONException;
import org.json.JSONObject;

import static helpers.ConstantOwasp.*;
import static helpers.ConstantOwasp.URL_HOST;

public class OwaspHelper {

    public static String idScanner="";
    public static void initOwasp(){
         // docker-compose up -d
    }
    public static void initAttackVulnerability() throws JSONException {
        CustomReponse response;
        response = FactoryRequest.make("GET").send(OWASP_START_ATTACK.replace(URL_HOST, "http://todo.ly"), "");
        idScanner = new JSONObject(response.getJsonBody()).get("id").toString();
        String isCompleted = "";

        // check status
        while (!isCompleted.equals("100")) {
            try {
                Thread.sleep(60000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            response = FactoryRequest.make("GET").send(OWASP_GET_STATUS_ATTACK.replace(ID_ATTACK, idScanner), "");
            isCompleted = new JSONObject(response.getJsonBody()).get("status").toString();;
            System.out.println("Status OWASP : "+isCompleted+ " of 100");
        }
    }

    public static String getSummaryReport(){
        CustomReponse reponse=FactoryRequest.make(FactoryRequest.GET).send(OWASP_SUMMARY_ATTACK.replace(ID_ATTACK, idScanner), "");
        return reponse.getJsonBody();
    }

    public static String getReportHtml(){
        // Get and Put Reports
        CustomReponse  response = FactoryRequest.make(FactoryRequest.GET).send(OWASP_GET_REPORT, "");
        return response.getJsonBody();
    }
}
