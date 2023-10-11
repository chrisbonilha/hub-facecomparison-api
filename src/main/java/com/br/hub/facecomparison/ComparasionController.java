package com.br.hub.facecomparison;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(path = "/facecomparison", produces = MediaType.APPLICATION_JSON_VALUE)
public class ComparasionController {

	@Autowired
	private ComparasionService service;
	
	@GetMapping("/status")
	public Status getStatus() {
		return new Status("Ok and running!");
	}
	
	@PostMapping(path = "compare", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Output compare(@RequestBody Input input) throws Exception{
		try {
			float result = service.compareTwoPhtos(input.photo1(), input.photo2());
			return new Output(result);
		} catch (Exception e) {
			e.printStackTrace();
			return new Output(-1);
		}
	}
	
	record Status(String status) {}
	record Input(String photo1, String photo2) {}
	record Output(float similarity) {}
}
