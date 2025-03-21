package br.com.fiap.api_rest.dto;

import br.com.fiap.api_rest.model.Cliente;
import br.com.fiap.api_rest.model.Endereco;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;


public record FilialRequest(
        @NotBlank(message = "Nome é obrigatório") String nome,
        @NotNull(message = "Enderço é obrigatório") Endereco endereco) {
}
