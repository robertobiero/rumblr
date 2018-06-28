package com.example.rumblr.backend;

import com.example.rumblr.domain.Rumble;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RumblrDAO extends CrudRepository<Rumble, Long> {


   // List<Rumble> findRumbles(long max, int count);
    List<Rumble> findAll();

    Rumble findById(long id);
}
