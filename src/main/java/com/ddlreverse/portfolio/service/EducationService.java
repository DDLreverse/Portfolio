package com.ddlreverse.portfolio.service;

import com.ddlreverse.portfolio.dao.EducationDAO;
import com.ddlreverse.portfolio.dao.ProjectDAO;
import com.ddlreverse.portfolio.model.Education;
import com.ddlreverse.portfolio.model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EducationService {
    @Autowired
    EducationDAO educationDAO;
    public ResponseEntity<List<Education>> getAllEducations() {
        try {
            return new ResponseEntity<>(educationDAO.findAll(), HttpStatus.OK);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<String> addEducation(Education education) {
        try {
            educationDAO.save(education);
            return new ResponseEntity<>("success", HttpStatus.OK);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>("fail", HttpStatus.BAD_REQUEST);
    }
}
