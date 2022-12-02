package br.gov.sp.campinas.api.service;

import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.campinas.api.domain.Cidadao;
import br.gov.sp.campinas.api.repository.CidadaoRepository;

@Service
public class CidadaoService {

	@Autowired
	private CidadaoRepository repository;
	
	public Cidadao findById(Long id) {
		Optional<Cidadao> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Cidadão não encontrado! Id: " + id + " - Tipo: " + Cidadao.class.getName(), null));
	}
}
