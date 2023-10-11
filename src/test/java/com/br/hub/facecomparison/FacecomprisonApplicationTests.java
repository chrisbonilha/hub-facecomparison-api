package com.br.hub.facecomparison;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.br.hub.facecomparison.config.FacecomprisonApplication;

@SpringBootTest(classes = FacecomprisonApplication.class)
@ActiveProfiles(value = "test")
class FacecomprisonApplicationTests {

	@Test
	void contextLoads() {
	}

}
