package br.com.fiap.api_rest.controller;

import br.com.fiap.api_rest.dto.GrupoRequest;
import br.com.fiap.api_rest.dto.GrupoResponse;
import br.com.fiap.api_rest.service.GrupoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("grupo")
public class GrupoController {
    GrupoService grupoService;

    public GrupoController(GrupoService grupoService) {
        this.grupoService = grupoService;
    }

    @PostMapping
    public ResponseEntity<GrupoResponse> create(@RequestBody @Valid GrupoRequest grupoRequest) {
        return new ResponseEntity<>(grupoService.create())

    }

    @GetMapping("/{id}")
    public ResponseEntity<GrupoResponse> findAll(@PathVariable Long id) {

    }

    @GetMapping
    public ResponseEntity<List<GrupoResponse>> listarTodos() {

    }

    @PutMapping("/{id}")
    public ResponseEntity<GrupoResponse> atualizarGrupo(){

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarGrupo(@PathVariable Long id) {

    }

}