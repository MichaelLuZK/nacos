package com.casic.ids.dao;


import com.casic.ids.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}