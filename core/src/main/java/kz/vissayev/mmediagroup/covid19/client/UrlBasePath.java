package kz.vissayev.mmediagroup.covid19.client;

import kz.vissayev.mmediagroup.covid19.client.interfaces.BasePath;

public class UrlBasePath implements BasePath {

    private String endPoint;
    private String apiVersion;

    public UrlBasePath(String endPoint, String apiVersion) {
        this.endPoint = endPoint;
        this.apiVersion = apiVersion;
    }

    public String basePath(){
        return this.endPoint + "/" + this.apiVersion;
    }
}
