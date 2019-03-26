package com.test.flybot.util;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author: Rafiqul Alam Chisty
 * @email: rafiqul.chisty@konasl.com
 * @date: 12/21/2017
 * @time: 10:56 AM
 * ****************************************************************
 */


public class HeaderBuilder {
    public static final String X_AUTH_TOKEN = "X-KM-AUTH-TOKEN";
    public static final String REQUEST_TYPE = "requestType";
    public static final String POST = "POST";
    public static final String PUT = "PUT";
    public static final String DELETE = "DELETE";
    public static final String GET = "GET";

    String par = null;
    String serviceId = null;
    String userId = null;
    String mpaId = null;
    String cardId = null;
    String aspId = null;
    String requestType = null;
    String xAuthToken = null;


    public HeaderBuilder() {

    }





    public HeaderBuilder addRequestType(String requestType) {
        this.requestType = requestType;
        return this;
    }

    public HeaderBuilder addXAuthToken() {
        this.xAuthToken = Constants.TOKEN;
        return this;
    }

    public HeaderBuilder addinvalidXAuthToken() {
        this.xAuthToken = Constants.TOKEN+"1";
        return this;
    }

    public Map<String, String> build() {
        Map<String, String> result = new HashMap<String, String>();

        if (xAuthToken != null) {
            result.put("X-Auth-Key", this.xAuthToken);
        }

        return result;
    }
}
