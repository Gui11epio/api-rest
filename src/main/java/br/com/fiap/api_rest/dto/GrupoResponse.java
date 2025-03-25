package br.com.fiap.api_rest.dto;

import br.com.fiap.api_rest.model.Cliente;

import java.util.List;

public record GrupoResponse(Long id, String nome, String descricao) {
}
