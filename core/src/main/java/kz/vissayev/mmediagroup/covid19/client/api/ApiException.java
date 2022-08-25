package kz.vissayev.mmediagroup.covid19.client.api;

import java.util.List;
import java.util.Map;

public class ApiException extends Exception {

    private int statusCode;
    private Map<String, List<String>> responseHeaders;
    private String responseBody;

    public ApiException() {}

    public ApiException(Throwable throwable) { super(throwable); }

    public ApiException(String message) { super(message); }

    public ApiException (String message,
                         Throwable throwable,
                         int statusCode,
                         Map<String, List<String>> responseHeader,
                         String responseBody
    ) {
        super(message, throwable);
        this.statusCode = statusCode;
        this.responseHeaders = responseHeader;
        this.responseBody = responseBody;
    }

    public ApiException(String message, int statusCode, Map<String, List<String>> responseHeaders, String responseBody) {
        this(message, (Throwable) null, statusCode, responseHeaders, responseBody);
    }

    public ApiException(String message, Throwable throwable, int statusCode, Map<String, List<String>> responseHeaders) {
        this(message, throwable, statusCode, responseHeaders, null);
    }

    public ApiException(int statusCode, Map<String, List<String>> responseHeaders, String responseBody) {
        this((String) null, (Throwable) null, statusCode, responseHeaders, responseBody);
    }

    public ApiException(int statusCode, String message) {
        super(message);
        this.statusCode = statusCode;
    }

    public ApiException(int statusCode, String message, Map<String, List<String>> responseHeaders, String responseBody) {
        this(statusCode, message);
        this.responseHeaders = responseHeaders;
        this.responseBody = responseBody;
    }

    /**
     * Get the HTTP status code.
     *
     * @return HTTP status code
     */
    public int statusCode() {
        return statusCode;
    }

    /**
     * Get the HTTP response headers.
     *
     * @return A map of list of string
     */
    public Map<String, List<String>> responseHeaders() {
        return responseHeaders;
    }

    /**
     * Get the HTTP response body.
     *
     * @return Response body in the form of string
     */
    public String responseBody() {
        return responseBody;
    }
}

