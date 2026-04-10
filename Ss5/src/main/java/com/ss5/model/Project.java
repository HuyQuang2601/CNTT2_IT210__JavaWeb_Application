package com.ss5.model;

import java.time.LocalDate;

public class Project {
    private final String id;
    private final String name;
    private final String description;
    private final String projectDirector;
    private final LocalDate startDate;
    private final LocalDate endDate;
    private final int totalMembers;

    public Project(
            String id,
            String name,
            String description,
            String projectDirector,
            LocalDate startDate,
            LocalDate endDate,
            int totalMembers
    ) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.projectDirector = projectDirector;
        this.startDate = startDate;
        this.endDate = endDate;
        this.totalMembers = totalMembers;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getProjectDirector() {
        return projectDirector;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public int getTotalMembers() {
        return totalMembers;
    }
}
