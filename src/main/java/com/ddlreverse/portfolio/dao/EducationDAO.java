package com.ddlreverse.portfolio.dao;

import com.ddlreverse.portfolio.model.Education;
import com.ddlreverse.portfolio.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EducationDAO extends JpaRepository<Education, Integer> {
    List<Education> findByUniversity(String university);
    List<Education> findByDegree(String degree);
}
