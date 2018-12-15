package com.itlabel.project.webshop1.controller;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;


@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class FreeMarkerApplicationTests 
{

	@Autowired
	private TestRestTemplate testRestTemplate;

	@Test
	public void testFreeMarkerTemplate() {
		ResponseEntity<String> entity = this.testRestTemplate.getForEntity("/",
				String.class);
		assertThat(entity.getStatusCode()).isEqualTo(HttpStatus.OK);
		assertThat(entity.getBody()).contains("sample index");
	}
	
	@Test
	public void testProducts() {
		ResponseEntity<String> entity = this.testRestTemplate.getForEntity("/products",
				String.class);
		assertThat(entity.getStatusCode()).isEqualTo(HttpStatus.OK);
		assertThat(entity.getBody()).contains("OnePlus 6T");
	}

	@Test
	public void testFreeMarkerErrorTemplate() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.TEXT_HTML));
		HttpEntity<String> requestEntity = new HttpEntity<>(headers);

		ResponseEntity<String> responseEntity = this.testRestTemplate
				.exchange("/does-not-exist", HttpMethod.GET, requestEntity, String.class);

		assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);
		assertThat(responseEntity.getBody())
				.contains("Something went wrong: 404 Not Found");
	}

}
