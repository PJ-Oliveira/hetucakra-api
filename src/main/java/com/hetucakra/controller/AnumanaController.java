package com.hetucakra.controller;

import com.hetucakra.domain.Anumana;
import com.hetucakra.domain.posicoes.Posicao;
import com.hetucakra.repository.AnumanaRepository;
import com.hetucakra.service.AnumanaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/hetucakra")
public class AnumanaController {

    @Autowired
    private AnumanaService anumanaService;

    @PostMapping
    public Object postAnumana(@RequestBody Anumana anumana){
        return anumanaService.retornaPosicao(anumana);
    }

    @GetMapping(value = "/anumanas")
    public List<Anumana> getAll(){
        var list = anumanaService.listAll();
        if(list.size() == 0){
            throw new RuntimeException("Não há argumentos salvos ainda.");
        }
        return anumanaService.listAll();
    }

}
