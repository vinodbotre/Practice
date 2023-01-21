package com.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.demo.model.Country;

@RestController
public class EmployeeController {

	
	  @GetMapping("/countries") 
	  private String gethelloClient() {
		  String uri = "https://cloudfinch-public.s3.ap-south-1.amazonaws.com/countries.json";	  
		  RestTemplate restTemplate= new RestTemplate();
		  String result=restTemplate.getForObject(uri, String.class);
		  return result;
		  
	  }
	  
	  @GetMapping("/name") 
	  public List<Country>getAllByName(){
		  String uri = "https://cloudfinch-public.s3.ap-south-1.amazonaws.com/countries.json";
		  RestTemplate restTemplate= new RestTemplate();
		  Country[] name= restTemplate.getForObject(uri,Country [].class);
		  List<Country> list=Arrays.asList(name);
		  return list;
		 
	  }
	  
	  
}

