package br.com.autenticacao.oauth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.autenticacao.oauth.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}