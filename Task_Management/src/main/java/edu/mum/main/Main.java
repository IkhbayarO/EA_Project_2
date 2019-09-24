package edu.mum.main;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.security.authentication.AuthenticationManager;

import edu.mum.domain.Credentials;
import edu.mum.service.CredentialsService;




/*
 * N+1 issue when Many side is declare EAGER
 * One Fetch of LIST of Members
 * N Fetches of each Members List of Addresses
 */
public class Main {
	@Autowired
	public static CredentialsService credentialsService;
  public static void main(String[] args) {
	
    ApplicationContext ctx = new ClassPathXmlApplicationContext("context/applicationContext.xml");
 

    AuthenticationManager authenticationManager = (AuthenticationManager) ctx.getBean("authenticationManager");
    System.out.println("Application is started");
    
//    for(Credentials s: credentialsService.findAll()) {
//    	System.out.println(s.getUsername());
//    }
    
  } 
  }