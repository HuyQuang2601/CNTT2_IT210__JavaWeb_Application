package com.ss5.controller;

import com.ss5.service.ProjectService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/projects")
public class ProjectController {
    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping({"", "/"})
    public String showProjectList(Model model) {
        model.addAttribute("projects", projectService.getAllProjects());
        return "project-list";
    }

    @GetMapping("/{id}")
    public String showProjectDetail(@PathVariable String id, Model model) {
        model.addAttribute("project", projectService.getProjectById(id));
        return "project-detail";
    }
}
