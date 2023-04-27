package org.example;

import java.io.BufferedReader;
import java.io.IOException;

public class HttpRequest {
    private final RequestLine requestLine; // GET /calculate?operand1=1&operator=*&operand2=2 HTTP/1.1
    // private final RequestHeader requestHeader;
    // private final RequestBody requestBody;

    public HttpRequest(BufferedReader br) throws IOException {
        this.requestLine = new RequestLine(br.readLine());
    }

    public boolean isGetRequest() {
        return requestLine.isGetRequest();
    }

    public boolean matchPath(String urlPath) {
        return requestLine.matchPath(urlPath);
    }

    public QueryStrings getQueryStrings() {
        return requestLine.getQueryStrings();
    }
}
