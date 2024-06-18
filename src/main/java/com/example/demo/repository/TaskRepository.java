package com.example.demo.repository;

import com.example.demo.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public interface TaskRepository extends JpaRepository<Task, Long> {
    Task save(Task task);

    List<Task> findAll();

    Optional<Task> findById(Long id);

    @Modifying
    @Query("UPDATE Task t SET t.done = true where t.id = :id")
    void markAsDone(@Param("id") Long id);
}
