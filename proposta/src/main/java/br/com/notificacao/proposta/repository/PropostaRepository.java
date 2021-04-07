package br.com.notificacao.proposta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.notificacao.proposta.entity.Proposta;

@Repository
public interface PropostaRepository extends JpaRepository<Proposta, Long>{
	
	public Proposta findByDocumento(String documento);

}
