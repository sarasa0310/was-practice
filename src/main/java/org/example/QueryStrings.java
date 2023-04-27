package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// QueryStringSample - operand1=1&operator=*&operand2=2
public class QueryStrings {
    private List<QueryString> queryStrings = new ArrayList<>();

    public QueryStrings(String queryStringLine) {
        String[] queryStringTokens = queryStringLine.split("&");

        Arrays.stream(queryStringTokens)
                .forEach(queryString -> {
                    String[] keyValue = queryString.split("=");

                    if (keyValue.length != 2) {
                        throw new IllegalArgumentException("잘못된 queryString 입니다.");
                    }

                    String key = keyValue[0];
                    String value = keyValue[1];

                    queryStrings.add(new QueryString(key, value));
                });
    }

    public String getValue(String key) {
        return this.queryStrings.stream()
                .filter(queryString -> queryString.exists(key))
                .map(QueryString::getValue)
                .findFirst()
                .orElse(null);
    }
}
