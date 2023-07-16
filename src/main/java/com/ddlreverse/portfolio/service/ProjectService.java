package com.ddlreverse.portfolio.service;

import com.ddlreverse.portfolio.dao.ProjectDAO;
import com.ddlreverse.portfolio.model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectService {
    @Autowired
    ProjectDAO projectDAO;
    public ResponseEntity<List<Project>> getAllProjects() {
        try {
            return new ResponseEntity<>(projectDAO.findAll(), HttpStatus.OK);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<String> addProject(Project project) {
        try {
            projectDAO.save(project);
            return new ResponseEntity<>("success", HttpStatus.OK);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>("fail", HttpStatus.BAD_REQUEST);
    }
}
