package com.krithika;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository
        extends JpaRepository<Blog, Integer> {

}
