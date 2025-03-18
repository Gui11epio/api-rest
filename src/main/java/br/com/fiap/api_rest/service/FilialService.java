package br.com.fiap.api_rest.service;

import br.com.fiap.api_rest.dto.FilialRequest;
import br.com.fiap.api_rest.model.Cliente;
import br.com.fiap.api_rest.model.Filial;
import br.com.fiap.api_rest.repository.FilialRepository;

public class FilialService {
    private final FilialRepository filialRepository;


    public FilialService(FilialRepository filialRepository) {
        this.filialRepository = filialRepository;
    }

    public Filial requestToFilial(FilialRequest filialRequest){
        return new Filial(null,filialRequest.getNome(), filialRequest.getEndereco(), filialRequest.getClientes());

    }
}
