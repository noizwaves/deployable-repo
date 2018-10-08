package io.pivotal.pal.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DemoApplicationTests {

	@Value("${local.server.port}")
	String port;

	@Test
	public void testDemo() throws IOException {
		RestTemplate restTemplate = new RestTemplate();

		String response = restTemplate.getForObject(
				"http://localhost:"+port+"/demo", String.class);

		assertThat(response).isEqualTo("This is a demo");
	}
}
