package br.gov.sp.campinas.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.gov.sp.campinas.api.domain.Cidadao;

@Repository
public interface CidadaoRepository extends JpaRepository<Cidadao, Long> {

}
