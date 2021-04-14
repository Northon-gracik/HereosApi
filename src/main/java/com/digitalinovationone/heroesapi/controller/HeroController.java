package com.digitalinovationone.heroesapi.controller;


import com.digitalinovationone.heroesapi.model.Hero;
import com.digitalinovationone.heroesapi.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/heroes")
public class HeroController {

    @Autowired
    private HeroService heroService;

    @GetMapping
    public List<Hero> findAll(){
        return this.heroService.findAll();
    }

    @GetMapping("/{id}")
    public Hero findAll(@PathVariable String id){
        return this.heroService.findById(id);
    }

    @PostMapping
    public Hero save(@RequestBody Hero hero){
        return this.heroService.save(hero);
    }
    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable String id){
        heroService.deleteById(id);
        return "Deleted";
    }
}
