package com.example.portal;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestClient {
	private final RestTemplate restTemplate;

	RestClient(RestTemplateBuilder restTemplateBuilder) {
		this.restTemplate = restTemplateBuilder.build();
	}

	public List<JiraProject> getProjects() {
		ResponseEntity<JiraProject[]> entity = this.restTemplate.getForEntity(
				"https://jira.spring.io/rest/api/2/project", JiraProject[].class);

		List<JiraProject> l = Arrays.asList(entity.getBody());
		l.forEach(j -> System.out.println("Jira Project " + j.getName() + " " + j.getKey() + " " + j.getUri().toString()));

		return l;
	}
}
