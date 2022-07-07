package com.hetucakra.repository;

import com.hetucakra.domain.Anumana;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnumanaRepository extends JpaRepository<Anumana, Long> {
}
