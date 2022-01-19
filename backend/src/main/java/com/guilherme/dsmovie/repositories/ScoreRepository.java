package com.guilherme.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guilherme.dsmovie.entities.Score;
import com.guilherme.dsmovie.entities.ScorePK;
@Repository
public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
