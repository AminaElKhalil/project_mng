package org.demo.projectMng.service;

import java.util.List;

import org.demo.projectMng.model.Project;
import org.demo.projectMng.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

	@Autowired
	private ProjectRepository projectRepository;

	public List<Project> findAll() {
		return projectRepository.findAll();
	}
}
