package com.example.portal;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.SVCCatalog;

@RestController
public class PortalController {
	@Autowired
	SVCCatalog svc;
	
	@GetMapping("/portal")
	public String home() {
		StringBuilder out = new StringBuilder();
		out.append("<html><body>");
		for (String name : svc.serviceMap.keySet()) {
			out.append("<a href=\"");
			out.append(svc.serviceMap.get(name));
			out.append("\">");
			out.append(name);
			out.append("</a><br>");
		}
		out.append("</body></html>");
		return out.toString();
	}
	
	@GetMapping(value = "/schedulej", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Map<String, Object>> schedulej(@RequestParam String start,
			@RequestParam String end) {
		return new ArrayList<Map<String, Object>>();
	}
	
	@GetMapping(value = "/schedule")
	public String schedule(@RequestParam String start,
			@RequestParam String end) {
		System.out.println("Start " + start + " End " + end);
		return "[{\"allDay\":true,\"backgroundColor\":\"#6db33f\",\"start\":\"2019-01-26\",\"title\":\"Reactor Netty 0.8.2.RELEASE\",\"url\":\"https://github.com/reactor/reactor-netty/milestone/33\"},{\"allDay\":true,\"backgroundColor\":\"#6db33f\",\"start\":\"2019-01-22\",\"title\":\"Reactor Netty 0.7.12.RELEASE\",\"url\":\"https://github.com/reactor/reactor-netty/milestone/34\"}]";
	}
}
