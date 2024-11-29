package com.briankimathi.Todo_App.repository;

import com.briankimathi.Todo_App.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {



}
