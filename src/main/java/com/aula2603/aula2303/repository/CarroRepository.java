package com.aula2603.aula2303.repository;

import java.util.HashMap;

import com.aula2603.aula2303.model.Carro;

import org.springframework.stereotype.Repository;

@Repository
public class CarroRepository {
    public HashMap<String, Carro> hm = new HashMap<String, Carro>();

    public CarroRepository(){
        hm.put("palio", new Carro(1, "palio", "fiat"));
        hm.put("gol", new Carro(2, "gol", "vw"));
        hm.put("uno", new Carro(3, "uno", "fiat"));
        hm.put("fusca", new Carro(4, "fusca", "vw"));
        hm.put("fiesta", new Carro(5, "fiesta", "ford"));
    }

    public Carro getCarro(String nome){
        return hm.get(nome);
    }

}