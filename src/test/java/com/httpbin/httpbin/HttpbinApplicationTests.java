package com.httpbin.httpbin;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.web.servlet.mvc.method.annotation.HttpEntityMethodProcessor;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HttpbinApplicationTests {
	@Autowired
	private TestRestTemplate restTemplate;

	/****************** Methods *******************/
	@Test
	void shouldGetStatusOKForGetMethod() {
		ResponseEntity<Void> response = this.restTemplate.getForEntity("/methods/get",Void.class);
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
	}

	@Test
	void shouldGetStatusOKForPostMethod(){
		ResponseEntity<Void> response = this.restTemplate.exchange("/methods/post", HttpMethod.POST,new HttpEntity<>(""),Void.class);
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
	}

	@Test
	void shouldGetStatusOKForDeleteMethod(){
		ResponseEntity<Void> response = this.restTemplate.exchange("/methods/delete",HttpMethod.DELETE,new HttpEntity<>(""),Void.class);
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
	}

	@Test
	void shouldGetStatusOKForPutMethod(){
		ResponseEntity<Void> response = this.restTemplate.exchange("/methods/put",HttpMethod.PUT,new HttpEntity<>(""),Void.class);
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
	}

    /***************** Status Codes *******************/
	/*** 200 OK ***/
	@Test
	void getMethodShouldReturnOkStatusCode(){
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<Void> entity = new HttpEntity<Void>(headers);
		ResponseEntity<Void> response = this.restTemplate.exchange("/status/200",HttpMethod.GET,entity,Void.class);
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
	}

	@Test
	void postMethodShouldReturnOkStatusCode(){
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<Void> entity = new HttpEntity<Void>(headers);
		ResponseEntity<Void> response = this.restTemplate.exchange("/status/200",HttpMethod.POST,entity,Void.class);
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
	}

	@Test
	void deleteMethodShouldReturnOkFoundStatusCode(){
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<Void> entity = new HttpEntity<Void>(headers);
		ResponseEntity<Void> response = this.restTemplate.exchange("/status/200",HttpMethod.DELETE,entity,Void.class);
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
	}

	@Test
	void putMethodShouldReturnOkStatusCode(){
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<Void> entity = new HttpEntity<Void>(headers);
		ResponseEntity<Void> response = this.restTemplate.exchange("/status/200",HttpMethod.PUT,entity,Void.class);
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
	}

	/*** 404 NOT_FOUND ***/
	@Test
	void getMethodShouldReturnNotFoundStatusCode(){
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<Void> entity = new HttpEntity<Void>(headers);
		ResponseEntity<Void> response = this.restTemplate.exchange("/status/404",HttpMethod.GET,entity,Void.class);
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);
	}

	@Test
	void postMethodShouldReturnNotFoundStatusCode(){
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<Void> entity = new HttpEntity<Void>(headers);
		ResponseEntity<Void> response = this.restTemplate.exchange("/status/404",HttpMethod.POST,entity,Void.class);
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);
	}

	@Test
	void deleteMethodShouldReturnNotFoundStatusCode(){
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<Void> entity = new HttpEntity<Void>(headers);
		ResponseEntity<Void> response = this.restTemplate.exchange("/status/404",HttpMethod.DELETE,entity,Void.class);
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);
	}

	@Test
	void putMethodShouldReturnNotFoundStatusCode(){
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<Void> entity = new HttpEntity<Void>(headers);
		ResponseEntity<Void> response = this.restTemplate.exchange("/status/404",HttpMethod.PUT,entity,Void.class);
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);
	}


	/*** 500 INTERNAL_SERVER_ERROR ***/
	@Test
	void getMethodShouldReturnInternalServerErrorStatusCode(){
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<Void> entity = new HttpEntity<Void>(headers);
		ResponseEntity<Void> response = this.restTemplate.exchange("/status/500",HttpMethod.GET,entity,Void.class);
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@Test
	void postMethodShouldReturnInternalServerErrorStatusCode(){
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<Void> entity = new HttpEntity<Void>(headers);
		ResponseEntity<Void> response = this.restTemplate.exchange("/status/500",HttpMethod.POST,entity,Void.class);
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@Test
	void deleteMethodShouldReturnInternalServerErrorStatusCode(){
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<Void> entity = new HttpEntity<Void>(headers);
		ResponseEntity<Void> response = this.restTemplate.exchange("/status/500",HttpMethod.DELETE,entity,Void.class);
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@Test
	void putMethodShouldReturnInternalServerErrorStatusCode(){
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<Void> entity = new HttpEntity<Void>(headers);
		ResponseEntity<Void> response = this.restTemplate.exchange("/status/500",HttpMethod.PUT,entity,Void.class);
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
