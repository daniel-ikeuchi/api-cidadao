package br.gov.sp.campinas.api.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_cidadao")
public class Cidadao implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "co_seq_cidadao")
	private Long cidadaoUuid;
	
	@Column(name = "nu_cns")
	private String cns;
	
	@Column(name = "nu_cpf")
	private String cpf;
	
	@Column(name = "no_cidadao")
	private String nomeCompleto;
	
	@Column(name = "no_nome_social")
	private String nomeSocial;
	
	@Column(name = "no_nome_mae")
	private String nomeMae;
	
	@Column(name = "dt_nasc")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dataNascimento;
}
