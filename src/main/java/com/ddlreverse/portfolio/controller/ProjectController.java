package com.ddlreverse.portfolio.controller;


import com.ddlreverse.portfolio.model.Project;
import com.ddlreverse.portfolio.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("project")
public class ProjectController {
    @Autowired
    ProjectService projectService;
    @GetMapping("all-projects")
    public ResponseEntity<List<Project>> getAllProjects() {
        return projectService.getAllProjects();
    }
    @PostMapping("add-project")
    public ResponseEntity<String> addProject(@RequestBody Project project) {
        return projectService.addProject(project);
    }
}
