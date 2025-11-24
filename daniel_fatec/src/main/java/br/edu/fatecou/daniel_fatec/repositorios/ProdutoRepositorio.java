package br.edu.fatecou.daniel_fatec.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fatecou.daniel_fatec.entidades.Produto;

public interface ProdutoRepositorio extends JpaRepository<Produto, String> {

}
