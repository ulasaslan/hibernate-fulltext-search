package ulas.hibernatefulltextsearch.repository;

import org.springframework.stereotype.Repository;
import ulas.hibernatefulltextsearch.entity.Plant;

@Repository
public interface PlantRepository extends SearchRepository<Plant, Long> {
}
