package br.com.washiner.concessionaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.washiner.concessionaria.entity.Carro;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long>{
    
}
