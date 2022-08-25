package kz.vissayev.mmediagroup.covid19.client.api;

import kz.vissayev.mmediagroup.covid19.client.Configuration;
import kz.vissayev.mmediagroup.covid19.client.UrlBasePath;
import kz.vissayev.mmediagroup.covid19.client.interfaces.Client;

public abstract class ApiClient implements Client {

    private String basePath;
    private Configuration configuration;

    ApiClient() throws ApiException {
        this.configuration = Configuration.getInstance();
        this.basePath = new UrlBasePath(configuration.propertyByName("end_point"),
                configuration.propertyByName("api_version")).basePath();
    }

    ApiClient(String basePath) {
        this.basePath = basePath;
    }

    public String basePath() {
        return this.basePath;
    }

    public String resource(String resourceName) {
        return configuration.propertyByName(resourceName);
    }
}
