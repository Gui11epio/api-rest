package br.com.fiap.api_rest.service;

import br.com.fiap.api_rest.dto.ClienteRequest;
import br.com.fiap.api_rest.dto.ClienteResponse;
import br.com.fiap.api_rest.model.Cliente;
import br.com.fiap.api_rest.repository.ClienteRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClienteService {
    private final ClienteRepository clienteRepository;

    public  ClienteService(ClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }

    public Cliente requestToCliente(ClienteRequest clienteRequest){
        return new Cliente(null,clienteRequest.getNome(), clienteRequest.getIdade(),
                clienteRequest.getEmail(), clienteRequest.getSenha(),
                clienteRequest.getCpf(), clienteRequest.getCategoria());

    }

    public ClienteResponse clienteToResponse(Cliente cliente){
        return new ClienteResponse(cliente.getId(), cliente.getNome());
    }

    public List<ClienteResponse> clienteToResponses(List<Cliente> clientes){
        List<ClienteResponse> clienteResponse = new ArrayList<>();
        for(Cliente cliente : clientes){
            clienteResponse.add(clienteToResponse(cliente));
        }
        return clienteResponse;
        //return clientes.stream().map(cliente -> clienteToResponse(cliente)).collect(Collectors.toList());
    }

    public Page<ClienteResponse> findAll(Pageable pageable){
        return clienteRepository.findAll(pageable).map(this::clienteToResponse);
    }

}
