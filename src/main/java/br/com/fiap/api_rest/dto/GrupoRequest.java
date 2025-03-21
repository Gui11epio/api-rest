package br.com.fiap.api_rest.dto;

import jakarta.validation.constraints.NotBlank;

public record GrupoRequest(
        @NotBlank(message = "Nome é obrigatório") String nome,
        @NotBlank(message = "Descrição é obrigatório") String descricao){
}
