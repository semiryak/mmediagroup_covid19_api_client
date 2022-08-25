package kz.vissayev.mmediagroup.covid19.client.interfaces;

import kz.vissayev.mmediagroup.covid19.client.api.ApiException;
import kz.vissayev.mmediagroup.covid19.client.api.ApiResponse;

public interface Client {
    ApiResponse execute() throws ApiException;
}
