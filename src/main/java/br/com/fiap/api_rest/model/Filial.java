package br.com.fiap.api_rest.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.List;

@Entity
public class Filial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @OneToOne
    @JoinColumn(name = "id_endereço")
    private Endereco endereco;
    @OneToMany(mappedBy = "filial")
    private List<Cliente> clientes;

    public Filial(@NotBlank(message = "Nome é obrigatório") String nome, Endereco endereco) {
    }

    public Filial(Long id, String nome, Endereco endereco, List<Cliente> clientes) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.clientes = clientes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
}
