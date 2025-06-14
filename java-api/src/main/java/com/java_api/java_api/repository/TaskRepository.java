package com.java_api.java_api.repository;
import com.java_api.java_api.model.Task;


import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaskRepository extends MongoRepository<Task, String> {
}