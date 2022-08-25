package kz.vissayev.mmediagroup.covid19.client.api;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.Response;
import kz.vissayev.mmediagroup.covid19.client.model.Case;

import java.lang.reflect.Type;
import java.util.Map;


public class CasesApi extends ApiClient {

    private String nameCountry;

    public CasesApi(String nameCountry) throws ApiException {
        super();
        this.nameCountry = nameCountry;
    }

    public ApiResponse execute() {
        Client client = ClientBuilder.newBuilder().build();
        WebTarget target = client
                .target(this.basePath() + this.resource("case_resource"))
                .queryParam("country", this.nameCountry);
        Response response = target.request().get();
        String value = response.readEntity(String.class);
        Type mapType = new TypeToken<Map<String, Case>>(){}.getType();
        Map<String, Case> cases = new Gson().fromJson(value, mapType);
        ApiResponse<Map> apiResponse = new ApiResponse(response.getStatus(), response.getStringHeaders(), cases);
        response.close();
        return apiResponse;
    }
}
