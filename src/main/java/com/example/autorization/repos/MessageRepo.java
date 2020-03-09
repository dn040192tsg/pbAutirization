package com.example.autorization.repos;

import com.example.autorization.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message, Long> {

    List<Message> findByUsername (String username);

}
