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
@CrossOrigin(origins = "*") // Adicionando suporte a CORS
class RestApiDemoController {
    private final List<Personagem> personagens = new ArrayList<>();

    public RestApiDemoController() {
        personagens.addAll(List.of(
                new Personagem("Hello Kitty"),
                new Personagem("My Melody"),
                new Personagem("Cinnamon Roll"),
                new Personagem("Kuromi"),
                new Personagem("Pompompurin")
        ));
    }

    @GetMapping
    public Iterable<Personagem> getPersonagens() {
        return personagens;
    }

    @GetMapping("/{id}")
    public Optional<Personagem> getPersonagemById(@PathVariable String id) {
        return personagens.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();
    }

    @PostMapping
    public Personagem postPersonagem(@RequestBody Personagem personagem) {
        personagens.add(personagem);
        return personagem;
    }

    @PutMapping("/{id}")
    public ResponseEntity<Personagem> putPersonagem(@PathVariable String id, @RequestBody Personagem personagem) {
        int personagemIndex = -1;

        for (Personagem p : personagens) {
            if (p.getId().equals(id)) {
                personagemIndex = personagens.indexOf(p);
                personagens.set(personagemIndex, personagem);
            }
        }

        return (personagemIndex == -1) ?
                new ResponseEntity<>(postPersonagem(personagem), HttpStatus.CREATED) :
                new ResponseEntity<>(personagem, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void deletePersonagem(@PathVariable String id) {
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

    public Personagem(String nome) {
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
