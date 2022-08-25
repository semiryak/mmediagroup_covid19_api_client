package kz.vissayev.mmediagroup.covid19.client.api;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.Response;
import kz.vissayev.mmediagroup.covid19.client.model.History;

import java.lang.reflect.Type;
import java.util.Map;

public class HistoryApi extends ApiClient {

    private String nameCountry;
    private String nameStatus;

    public HistoryApi(String nameCountry, String nameStatus) {
        super();
        this.nameCountry = nameCountry;
        this.nameStatus = nameStatus;
    }

    public ApiResponse execute(){
        Client client = ClientBuilder.newBuilder().build();
        WebTarget target = client
                .target(this.basePath() + this.resource("history_resource"))
                .queryParam("country", this.nameCountry)
                .queryParam("status", this.nameStatus);
        Response response = target.request().get();
        String value = response.readEntity(String.class);
        Type mapType = new TypeToken<Map<String, History>>(){}.getType();
        Map<String, History> history = new Gson().fromJson(value, mapType);
        ApiResponse<Map> apiResponse = new ApiResponse(response.getStatus(), response.getStringHeaders(), history);
        response.close();
        return apiResponse;
    }
}
