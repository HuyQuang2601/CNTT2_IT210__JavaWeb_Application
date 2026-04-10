package com.ss5.repository;

import com.ss5.model.Project;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public class ProjectRepositoryImpl implements ProjectRepository {
    private final List<Project> projects = List.of(
            new Project(
                    "PRJ-001",
                    "Website Thuong Mai Dien Tu",
                    "Xay dung he thong ban hang truc tuyen cho doanh nghiep ban le.",
                    "Nguyen Van An",
                    LocalDate.of(2026, 1, 10),
                    LocalDate.of(2026, 7, 30),
                    12
            ),
            new Project(
                    "PRJ-002",
                    "Ung Dung Quan Ly Nhan Su",
                    "So hoa quy trinh cham cong, tinh luong va quan ly ho so nhan vien.",
                    "Tran Thi Bich",
                    LocalDate.of(2026, 2, 5),
                    LocalDate.of(2026, 9, 15),
                    9
            ),
            new Project(
                    "PRJ-003",
                    "Nen Tang Dat Lich Kham",
                    "Cho phep benh nhan dat lich, theo doi ho so va nhan thong bao tu co so y te.",
                    "Le Quoc Huy",
                    LocalDate.of(2026, 3, 1),
                    LocalDate.of(2026, 11, 20),
                    15
            )
    );

    @Override
    public List<Project> findAll() {
        return projects;
    }

    @Override
    public Optional<Project> findById(String id) {
        return projects.stream()
                .filter(project -> project.getId().equalsIgnoreCase(id))
                .findFirst();
    }
}
