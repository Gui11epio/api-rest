package br.com.fiap.api_rest.service;

import br.com.fiap.api_rest.dto.FilialRequest;
import br.com.fiap.api_rest.dto.FilialResponse;
import br.com.fiap.api_rest.dto.GrupoResponse;
import br.com.fiap.api_rest.model.Endereco;
import br.com.fiap.api_rest.model.Filial;
import br.com.fiap.api_rest.model.Grupo;
import br.com.fiap.api_rest.repository.GrupoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class GrupoService {
    @Autowired
    GrupoRepository grupoRepository;

    private GrupoResponse grupoToResponse(Grupo grupo){
        return new GrupoResponse(grupo.getId(), grupo.getNome(),grupo.getDescricao(),grupo.getClientes());
    }

    public GrupoResponse create(GrupoResponse grupoResponse){


    }

    public GrupoResponse findById(long id){

    }

    public List<GrupoResponse> findAll(){

    }

    public GrupoResponse update(Long id, GrupoResponse grupoResponse) {

    }

    public boolean delete(Long id) {

    }

}
