package com.circus.repo;

import com.circus.models.Comments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoComments extends JpaRepository<Comments, Long> {
}
