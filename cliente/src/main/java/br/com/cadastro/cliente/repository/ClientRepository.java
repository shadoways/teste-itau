package br.com.cadastro.cliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cadastro.cliente.entity.Cliente;

@Repository
public interface ClientRepository extends JpaRepository<Cliente, Long>{

}
