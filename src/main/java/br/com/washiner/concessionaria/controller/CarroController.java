package br.com.washiner.concessionaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.washiner.concessionaria.entity.Carro;
import br.com.washiner.concessionaria.service.CarroService;

@RestController
@RequestMapping("/carros")
public class CarroController {
    @Autowired
    private CarroService carroService;

    @GetMapping("/listar")
    public ResponseEntity<List<Carro>> findAll() {
        List<Carro> carros = carroService.findAll();
        return ResponseEntity.ok().body(carros);
    }

    @GetMapping("{idCarro}")
    public ResponseEntity<Carro> findById(@PathVariable Long idCarro){
        Carro carro = carroService.findById(idCarro);
        return ResponseEntity.ok().body(carro);
    }

    @PostMapping
    public ResponseEntity<Carro> salvar(@RequestBody Carro newCarro){
        Carro carroInserido = carroService.save(newCarro);
        return ResponseEntity.ok().body(carroInserido);
    }

    @PutMapping("{idCarro}")
    public ResponseEntity<Carro> update(@PathVariable Long idCarro, @RequestBody Carro carroAtual){
        Carro carro = carroService.update(idCarro, carroAtual);
        return ResponseEntity.ok().body(carro);
    }

    @DeleteMapping("{idCarro}")
    public ResponseEntity<String> delete(@PathVariable Long idCarro){
        String deleted = carroService.delete(idCarro);
        return ResponseEntity.ok().body(deleted);
    }
}
