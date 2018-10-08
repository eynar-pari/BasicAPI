package unitTest;

import helpers.JsonUtil;
import org.json.JSONException;
import org.junit.Assert;
import org.junit.Test;

public class JsonUtilTest {

    @Test
    public void getValue(){
        String expectedValue = "5";
        String jsonActual ="{\n" +
                "      \"Id\": \"5\",\n" +
                "      \"Content\": \"Eynar9999\",\n" +
                "      \"ItemsCount\": 0,\n" +
                "      \"Icon\": 4,\n" +
                "      \"ItemType\": 2,\n" +
                "      \"ParentId\": null,\n" +
                "      \"Collapsed\": false,\n" +
                "      \"ItemOrder\": \"IGNORE\",\n" +
                "      \"Children\": [],\n" +
                "      \"IsProjectShared\": false,\n" +
                "      \"ProjectShareOwnerName\": null,\n" +
                "      \"ProjectShareOwnerEmail\": null,\n" +
                "      \"IsShareApproved\": false,\n" +
                "      \"IsOwnProject\": true,\n" +
                "      \"LastSyncedDateTime\": \"IGNORE\",\n" +
                "      \"LastUpdatedDate\": \"IGNORE\",\n" +
                "      \"Deleted\": false,\n" +
                "      \"SyncClientCreationId\": null\n" +
                "    }";

        String actualResult=JsonUtil.getJsonValue(jsonActual,"Id");
        Assert.assertEquals("ERROR ",expectedValue,actualResult);
    }

    @Test
    public void compareJson() throws JSONException {
        String json1="{\"Id\": \"IGNORE\", \"Content\": \"Eynar9\", \"ItemsCount\": 0, \"Icon\": 4, \"ItemType\": 2, \"ParentId\": null, \"Collapsed\": false, \"ItemOrder\": \"IGNORE\", \"Children\": [], \"IsProjectShared\": false, \"ProjectShareOwnerName\": null, \"ProjectShareOwnerEmail\": null, \"IsShareApproved\": false, \"IsOwnProject\": true, \"LastSyncedDateTime\": \"IGNORE\", \"LastUpdatedDate\": \"IGNORE\", \"Deleted\": false, \"SyncClientCreationId\": null }";
        String json2="{\"Id\":3744220,\"Content\":\"Eynar9\",\"ItemsCount\":0,\"Icon\":4,\"ItemType\":2,\"ParentId\":null,\"Collapsed\":false,\"ItemOrder\":371,\"Children\":[],\"IsProjectShared\":false,\"ProjectShareOwnerName\":null,\"ProjectShareOwnerEmail\":null,\"IsShareApproved\":false,\"IsOwnProject\":true,\"LastSyncedDateTime\":\"\\/Date(1538707202446)\\/\",\"LastUpdatedDate\":\"\\/Date(1538707202447)\\/\",\"Deleted\":false,\"SyncClientCreationId\":null}";

        Assert.assertTrue("ERROR",JsonUtil.areEqualsJsonObject(json1,json2));

    }
}
