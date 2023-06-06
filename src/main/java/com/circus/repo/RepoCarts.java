package com.circus.repo;

import com.circus.models.Carts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoCarts extends JpaRepository<Carts, Long> {
}
