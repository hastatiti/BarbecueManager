package com.security;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BarbecueRepository extends JpaRepository<Barbecue, Long> {

}
