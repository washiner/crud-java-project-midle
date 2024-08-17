package br.com.washiner.concessionaria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.washiner.concessionaria.entity.Carro;
import br.com.washiner.concessionaria.repository.CarroRepository;

@Service
public class CarroService {

    @Autowired
    private CarroRepository carroRepository;

    public List<Carro> findAll() {
        return carroRepository.findAll();
    }

    public Carro findById(Long idCarro) {
        return carroRepository.findById(idCarro).orElse(null);
    }

    public Carro save(Carro carro) {
        return carroRepository.save(carro);
    }

    public Carro update(Long idCarro, Carro novosDadosCarro) {
        Carro carroExistente = findById(idCarro);
        carroExistente.setMarca(novosDadosCarro.getMarca());
        carroExistente.setModelo(novosDadosCarro.getModelo());
        carroExistente.setAno(novosDadosCarro.getAno());
        carroExistente.setDataCadastro(novosDadosCarro.getDataCadastro());
        return carroRepository.save(carroExistente);
    }

    public String delete(Long idCarro){
        Carro carro = findById(idCarro);
        if (carro == null) {

            return "Carro não encontrado";
            
        }else{
            carroRepository.deleteById(idCarro);
            return "Deletado com Sucesso!!!";
        }
    }

}
