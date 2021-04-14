package com.digitalinovationone.heroesapi.repository;

import com.digitalinovationone.heroesapi.model.Hero;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeroRepository extends MongoRepository<Hero, String> {
}
