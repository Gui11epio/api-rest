package br.com.fiap.api_rest.service;

import br.com.fiap.api_rest.dto.GrupoResponse;
import br.com.fiap.api_rest.model.Grupo;
import br.com.fiap.api_rest.repository.GrupoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GrupoService {
    @Autowired
    GrupoRepository grupoRepository;

    private GrupoResponse grupoToResponse(Grupo grupo){
        return new GrupoResponse(grupo.getId(), grupo.getNome(),grupo.getDescricao());
    }

}
