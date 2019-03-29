package br.com.testBackJava;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gastos")
public class service {

	@PostMapping
	public ResponseEntity<?> isSimian(@RequestBody GastosService gastosService) {
		return ResponseEntity.status(HttpStatus.OK).build();
        //return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
	}

}
