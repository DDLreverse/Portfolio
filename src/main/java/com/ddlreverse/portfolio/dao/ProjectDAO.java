package com.ddlreverse.portfolio.dao;

import com.ddlreverse.portfolio.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectDAO extends JpaRepository<Project, Integer> {
    List<Project> findByCategory(String category);
}
