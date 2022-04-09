package com.udemy.springbootmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.udemy.springbootmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
