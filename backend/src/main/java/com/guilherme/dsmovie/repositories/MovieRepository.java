package com.guilherme.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilherme.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
