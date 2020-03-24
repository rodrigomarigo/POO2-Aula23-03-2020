package com.aula2603.aula2303.controller;

import java.util.ArrayList;

import com.aula2603.aula2303.model.Carro;
import com.aula2603.aula2303.service.CarroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/app")
public class CarroController {

    @Autowired
    private CarroService cs;

    @GetMapping("/carro/{nome}")
    public ModelAndView getCarro(
        @PathVariable("nome") String nome) {
        ModelAndView mv = new ModelAndView("carroView");
        
        Carro carro = cs.getCarro(nome);
        
        mv.addObject("carro", carro);

        return mv;
    }

    @GetMapping("/todoscarros")
    public ModelAndView getTodosCarro()
        {
        ModelAndView mv = new ModelAndView("todosCarrosView");
        
        ArrayList<Carro> carros = cs.getAllCarros();
        
        mv.addObject("carros", carros);

        return mv;
    }


}