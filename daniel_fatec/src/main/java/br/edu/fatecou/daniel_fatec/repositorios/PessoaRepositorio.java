package br.edu.fatecou.daniel_fatec.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import br.edu.fatecou.daniel_fatec.entidades.Pessoa;

public interface PessoaRepositorio extends JpaRepository<Pessoa, String> {

}
