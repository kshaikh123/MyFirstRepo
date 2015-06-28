package com.tms.bat.cssdk.controller;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/test")
public class Sample {
	 @RequestMapping(value="")
	    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException
	    {
	        System.out.println("=================Inside URLExternalTaskServlet processRequest=======================");
	    }
}
