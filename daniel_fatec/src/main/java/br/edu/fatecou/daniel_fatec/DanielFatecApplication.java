package br.edu.fatecou.daniel_fatec;

import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.fatecou.daniel_fatec.entidades.Pessoa;
import br.edu.fatecou.daniel_fatec.entidades.Carro;
import br.edu.fatecou.daniel_fatec.repositorios.PessoaRepositorio;
import br.edu.fatecou.daniel_fatec.repositorios.CarroRepositorio;
import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class DanielFatecApplication implements CommandLineRunner {

    private final PessoaRepositorio pessoaRepositorio;
    private final CarroRepositorio carroRepositorio;

    public static void main(String[] args) {
        SpringApplication.run(DanielFatecApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        // ---------- TESTE PESSOA ----------
        var pessoa = new Pessoa();
        pessoa.setCodigo(UUID.randomUUID().toString());
        pessoa.setNome("João Silva");
        pessoa.setCpf("12345678900");
        pessoa.setAltura(1.75);
        pessoa.setPeso(80.0);

        pessoaRepositorio.save(pessoa);


        // ---------- TESTE CARRO ----------
        var carro = new Carro();
        carro.setCodigo(UUID.randomUUID().toString());
        carro.setMarca("Toyota");
        carro.setModelo("Corolla");
        carro.setAnoFabricacao(2020);
        carro.setAnoModelo(2021);
        carro.setValor(115000.0);

        carroRepositorio.save(carro);

        System.out.println("Inserções realizadas com sucesso!");
    }
}
