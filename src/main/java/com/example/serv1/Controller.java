package com.example.serv1;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.support.ServletContextResource;

@RestController
public class Controller {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(HttpServletRequest  req) {
		System.out.println("Context Path = " + req.getServletContext().getContextPath());
		ServletContextResource scr = new ServletContextResource(req.getServletContext(), "abc");

		System.out.println(scr.getPath());
		byte[] buf = new byte[1024];
		try {
			System.out.println(scr.getFile().getAbsoluteFile().getPath());

			InputStream is = scr.getInputStream();
			is.read(buf);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			buf = "Resource not found".getBytes();
			e.printStackTrace();
		}
		return new String(buf);
	}
}
