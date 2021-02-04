package aplicaciones.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import aplicaciones.spring.models.entity.Ubigeo;
import aplicaciones.spring.models.services.UbigeoService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class UbigeoRestController {

	@Autowired
	UbigeoService ubigeoService;
	
	@PostMapping("/ubigeos")
	@ResponseStatus(HttpStatus.CREATED)
	public Ubigeo create(@RequestBody Ubigeo ubigeo) {
		return ubigeoService.save(ubigeo);
	}
}
