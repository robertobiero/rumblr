package com.example.rumblr.backend;

import com.example.rumblr.domain.Rumble;
import com.example.rumblr.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RumblrService  {

    List<Rumble> findAll();

      Rumble findById(long id);


}
