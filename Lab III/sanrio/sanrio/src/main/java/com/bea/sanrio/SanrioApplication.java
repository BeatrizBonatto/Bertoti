package com.bea.sanrio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@SpringBootApplication
public class SanrioApplication {

	public static void main(String[] args) {
		SpringApplication.run(SanrioApplication.class, args);
	}

}

@RestController
@RequestMapping("/personagens")
class RestController {
	private List<Personagem> personagens = new ArrayList<>();

	public RestApiDemoController() {
		personagens.addAll(List.of(
				new Personagem("Hello Kitty"),
				new Personagem("My Melody"), 
				new Personagem("Cinnamon Roll")
		));

	@GetMapping
	List<Personagem> getPersonagem() {
		return personagens;
	}

	@GetMapping("/{id}")
	Optional<Personagem> getPersonagemById(@PathVariable String id) {
		for (Personagem p: personagens) {
			if (p.getId().equals(id)) {
				return Optional.of(p);
			}
		}

		return Optional.empty();
	}

	@PostMapping
	Personagem postPersonagem(@RequestBody Personagem personagem) {
		personagens.add(personagem);
		return personagem;
	}

	@PostMapping
	ResponseEntity<Personagem> putPersonagem(@PathVariable String id,
											 @RequestBody Personagem personagem) {
		int personagemIndex = -1;

		for(Personagem p : personagens) {
			if (p.getId().equals(id)) {
				personagemIndex = personagens.indexOf(p);
				personagens.set(personagemIndex, personagem);
			}
		}

		return (personagemIndex == 1) ?
				new ResponseEntity<>(postPersonagem(personagem), HttpStatus.CREATED) :
				new ResponseEntity<>(personagem, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	void deletePersonagem(@PathVariable String id) {
		personagens.removeIf(p -> p.getId().equals(id));
	}
}
	
class Personagem {
	private final String id;
	private String nome;
	
	public Personagem(String id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public  Personagem(String nome) {
		this(UUID.randomUUID().toString(), nome);
	}

	public String getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}	
}