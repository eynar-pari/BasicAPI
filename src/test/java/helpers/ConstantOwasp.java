package helpers;

public class ConstantOwasp {


        // Configuration Files
        public static String OWASP_GET_REPORT="http://127.0.0.1:8888/OTHER/core/other/htmlreport/?formMethod=GET";

        public static String OWASP_GET_ALERT="http://127.0.0.1:8888/JSON/core/view/alerts/?zapapiformat=JSON&baseurl=&start=&count=&riskId=";

        // replace URL_HOST
        public static String OWASP_START_ATTACK="http://127.0.0.1:8888/JSON/ascan/action/scan/?zapapiformat=JSON&formMethod=GET&url=URL_HOST&recurse=&inScopeOnly=&scanPolicyName=&method=&postData=&contextId=";

        //replace ID_ATTACK
        public static String OWASP_SUMMARY_ATTACK="http://127.0.0.1:8888/JSON/ascan/view/scanProgress/?zapapiformat=JSON&scanId=ID_ATTACK";

        //replace ID_ATTACK ---> status 100 complete attack
        public static String OWASP_GET_STATUS_ATTACK="http://127.0.0.1:8888/JSON/ascan/view/status/?zapapiformat=JSON&scanId=ID_ATTACK";

        public static String URL_HOST="URL_HOST";

        public static String ID_ATTACK="ID_ATTACK";
        }
