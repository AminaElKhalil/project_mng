package org.demo.projectMng.controller;

import java.util.List;

import org.demo.projectMng.model.Project;
import org.demo.projectMng.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(path = "project")
public class ProjectController {

	@Autowired
	private ProjectService projectService;
	
	@GetMapping
	public List<Project> findAll() {
		return projectService.findAll();
	}
}
