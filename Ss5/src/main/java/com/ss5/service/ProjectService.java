package com.ss5.service;

import com.ss5.model.Project;

import java.util.List;

public interface ProjectService {
    List<Project> getAllProjects();

    Project getProjectById(String id);
}
