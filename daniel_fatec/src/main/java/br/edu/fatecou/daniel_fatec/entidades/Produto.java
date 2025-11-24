package br.edu.fatecou.daniel_fatec.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Produto {
    @Id
    private String uuid;

    private String nome;
    private Integer quantidade;
    private Double preco;
}
