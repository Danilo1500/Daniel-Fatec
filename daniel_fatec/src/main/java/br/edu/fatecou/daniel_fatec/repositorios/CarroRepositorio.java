package br.edu.fatecou.daniel_fatec.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import br.edu.fatecou.daniel_fatec.entidades.Carro;

public interface CarroRepositorio extends JpaRepository<Carro, String> {

}
