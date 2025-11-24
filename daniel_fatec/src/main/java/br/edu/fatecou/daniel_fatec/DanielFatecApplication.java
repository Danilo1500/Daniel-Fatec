package br.edu.fatecou.daniel_fatec;

import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.fatecou.daniel_fatec.entidades.Produto;
import br.edu.fatecou.daniel_fatec.repositorios.ProdutoRepositorio;
import lombok.RequiredArgsConstructor;



@SpringBootApplication
@RequiredArgsConstructor
public class DanielFatecApplication implements CommandLineRunner{
	private final ProdutoRepositorio repositorio;

	public static void main(String[] args) {
		SpringApplication.run(DanielFatecApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var produto = new Produto();

		produto.setUuid(UUID.randomUUID().toString());
		produto.setNome("Coca cola 2 litros");
		produto.setPreco(12.50);
		produto.setQuantidade(15);

		repositorio.save(produto);
	}
}
