package br.com.fiap.api_rest.dto;

import br.com.fiap.api_rest.model.Cliente;
import br.com.fiap.api_rest.model.Endereco;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class FilialRequest {
    @NotBlank(message = "O nome é obrigatório")
    @Size(min = 3, max = 150, message = " o nome deve ter entre 3 e 150 caracteres")
    private String nome;
    @NotNull(message = "O endereço é obrigatório")
    private Endereco endereco;
    private List<Cliente> clientes;
}
