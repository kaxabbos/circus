package com.circus.repo;

import com.circus.models.Income;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoIncomes extends JpaRepository<Income, Long> {
}
