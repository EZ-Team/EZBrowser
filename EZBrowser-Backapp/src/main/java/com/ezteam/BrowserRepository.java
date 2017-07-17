package com.ezteam;

import com.ezteam.entities.Browser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrowserRepository extends JpaRepository<Browser, Long> {
}
