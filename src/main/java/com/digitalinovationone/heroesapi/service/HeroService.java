package com.digitalinovationone.heroesapi.service;

import com.digitalinovationone.heroesapi.model.Hero;
import com.digitalinovationone.heroesapi.repository.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HeroService {

    @Autowired
    public HeroRepository heroRepository;

    public List<Hero> findAll(){
        return this.heroRepository.findAll();
    }

    //duvida
    public Hero findById(String id){
        Optional<Hero> HeroByid = this.heroRepository.findById(id);
        return HeroByid.get();
    }

    public Hero save(Hero hero){
        return this.heroRepository.save(hero);
    }

    public void deleteById(String id){
        heroRepository.deleteById(id);
    }

}
