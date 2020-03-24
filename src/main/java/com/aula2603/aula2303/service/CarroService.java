package com.aula2603.aula2303.service;

import java.util.ArrayList;

import com.aula2603.aula2303.model.Carro;
import com.aula2603.aula2303.repository.CarroRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CarroService {
    @Autowired
    private CarroRepository cr;

    public Carro getCarro(String nome){
        Carro carro = cr.getCarro(nome);

        return carro;
    }

    public ArrayList<Carro> getAllCarros(){
        ArrayList<Carro> carros = new ArrayList<Carro>();
        for(String i : cr.hm.keySet()){
            carros.add(cr.hm.get(i));
        }

        return carros;
    }



}