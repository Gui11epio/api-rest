package br.com.fiap.api_rest.dto;

import br.com.fiap.api_rest.model.Cliente;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public record GrupoRequest(
        @NotBlank(message = "Nome é obrigatório")String nome,
        @NotBlank(message = "Descrição é obrigatório")String descricao){
}
