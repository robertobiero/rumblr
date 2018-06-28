
package com.example.rumblr.backend;

import com.example.rumblr.domain.Rumble;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RumblrServiceImpl implements RumblrService {


    @Autowired
    RumblrDAO rumblrDAO;


    @Override
    public List<Rumble> findAll() {
        List<Rumble> rumble = rumblrDAO.findAll();
        return rumble;
    }

    @Override
    public Rumble findById(long id) {
        Rumble rumble = rumblrDAO.findById(id);
        return rumble;
    }
}