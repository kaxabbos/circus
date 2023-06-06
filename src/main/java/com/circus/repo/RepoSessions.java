package com.circus.repo;

import com.circus.models.Sessions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoSessions extends JpaRepository<Sessions, Long> {
}
