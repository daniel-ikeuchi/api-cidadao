package br.gov.sp.campinas.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.campinas.api.domain.Cidadao;
import br.gov.sp.campinas.api.service.CidadaoService;

@RestController
@RequestMapping(value = "/cidadao")
public class CidadaoController {

	@Autowired
	private CidadaoService service;
	
	@GetMapping("/id/{id}")
	public ResponseEntity<Cidadao> findByCns(@PathVariable("id") Long id) {
		Cidadao obj = service.findById(id);
		
		return ResponseEntity.ok().body(obj);

		
	}
}
