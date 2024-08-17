package br.com.washiner.concessionaria.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "tb_carro")
@NoArgsConstructor
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCarro;
    private String marca;
    private String modelo;
    private int ano;
    @CreationTimestamp // colocar essa anotacao ou 
    private LocalDateTime dataCadastro; //= LocalDateTime.now();
    
}
