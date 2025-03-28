package br.com.fiap.api_rest.dto;

import br.com.fiap.api_rest.model.Categoria;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;

@Data
@AllArgsConstructor
public class ClienteRequest {
    @NotBlank(message = "O nome é obrigatório")
    @Size(min = 3, max = 150, message = " o nome deve ter entre 3 e 150 caracteres")
    private String nome;
    @Min(value = 18, message = "O cliente deve ter no mínimo 18 anos")
    private int idade;
    @Email(message = "Email fora do formato")
    private String email;
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@!,#])[A-Za-z\\d@!,#]{8,}$",
            message = "A senha deve conter no mínimo 8 caracteres, letras minusculas e maiusculas")
    private String senha;
    @CPF(message = "O CPF está fora do formato")
    private String cpf;
    @NotNull(message = "A categoria é obrigatória")
    private Categoria categoria;



}
