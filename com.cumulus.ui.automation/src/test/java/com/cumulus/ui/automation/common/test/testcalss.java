package com.cumulus.ui.automation.common.test;

import com.google.gson.JsonObject;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.HashMap;
import java.util.Map;
public class testcalss {
    RequestSpecification request;
    HashMap<String, String> query_params=new HashMap<String, String>();
    
    public  Response hitPostRequest() {
        JsonObject requestParams = new JsonObject();
        requestParams.addProperty("username", "admin");
        requestParams.addProperty("password", "admin");
        RestAssured.baseURI="https://35.160.167.233:32708";
        String endpoint="/netq/auth/v1/login";
        request= RestAssured.given();
        request.header("Content-Type", "application/json");
        request.body(requestParams.toString());
        request.relaxedHTTPSValidation();
        return request.post(endpoint);
    }
    public Response hitGetRequest(String host, String endpoint, Map query_params, String access_token){
    	RestAssured.baseURI="https://35.160.167.233:32708";
        //request= RestAssured.given();
        request= RestAssured.given();
        request.header("Content-Type", "application/json");
        request.relaxedHTTPSValidation();
        request.urlEncodingEnabled(false);
        request.header("Authorization", access_token);
        //request.queryParams(query_params);
        //System.out.println("request:"+""+request.toString());
        return request.get(endpoint);
    }
   public HashMap test()
   {
	   
	   query_params.put("time","1559278204");
	   query_params.put("duration","24");
	   query_params.put("bucket", "1");
	   
	   return query_params;
   }
   
   
    //query_params.put("duration","24");
}
//In the method hitGetRequest, you need to pass a Map of query params as follows: 
