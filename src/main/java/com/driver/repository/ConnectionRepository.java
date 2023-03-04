package com.driver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.driver.model.*;
import org.springframework.stereotype.Repository;

@Repository
public interface ConnectionRepository extends JpaRepository<Connection, Integer> {
}
