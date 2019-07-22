package com.cumulus.ui.automation.common.test;

import java.util.HashMap;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import java.time.Instant;

public class CallTestRest {
	
	//public static String token="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJyb2xlIjoiYWRtaW4iLCJleHBpcmVzQXQiOjE1NTk1NTQ5MTE2NzUsIm9waWQiOjAsImN1c3RJZCI6MCwidXNlciI6ImFkbWluIn0.L5CebixyzYiXt12Ka6G3YoT5fbc2fvMNYreEz6QcSek";
	public static String host="35.160.167.233:32708";
	public static String endpoint="";
	public static String endpoint2="&duration=24&bucket=1";
	public static String endpoint1="/netq/telemetry/v1/object/bgp?time=";
	public static String token="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJyb2xlIjoiYWRtaW4iLCJleHBpcmVzQXQiOjE1NTk2MzAwMjE0MDAsIm9waWQiOjAsImN1c3RJZCI6MCwidXNlciI6ImFkbWluIn0.BtrtjCrlXG8HIeo5tCcW7nQuhrwpCVHgU4g9_Lt_EWo";
	
	
	public static int test() {
		
		testcalss test=new testcalss();
		//Response res=test.hitPostRequest();
		
		//System.out.println(res.asString());
		String epocTime=String.valueOf(Instant.now().getEpochSecond());
		endpoint=endpoint1+epocTime+endpoint2;
		endpoint.toString();
		
		
		Response res1=test.hitGetRequest(host, endpoint, null, token);
		//System.out.println(res1.prettyPrint());
        //JsonPath path=new JsonPath(res1.prettyPrint());
		HashMap  res2=res1.getBody().jsonPath().and().get("Count");
		System.out.println(res1.getBody().jsonPath().and().get("Count"));
		//System.out.println(res2.get("TotalRunning"));
		int totalNumOfNodeRunning=(Integer)res2.get("TotalRunning");
        
        	
        System.out.println(totalNumOfNodeRunning);
        return totalNumOfNodeRunning;
		
		
		
	}
	public static void main(String[] args) {
		
		
		
		test();
	}

}
