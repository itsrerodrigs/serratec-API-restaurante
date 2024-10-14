package org.serratec.restaurante;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restaurante")

public class RestauranteController {
	
 	List<Restaurante> prato = new ArrayList<>();

	@GetMapping
	public List<Restaurante> obterTodos(){
		return prato;
	}
	
	@PostMapping
	public Restaurante pratoCadastar(@RequestBody Restaurante pratoCadastrar) {
		prato.add(pratoCadastrar);
		return pratoCadastrar;
	}
	
	
	
	
	
}
