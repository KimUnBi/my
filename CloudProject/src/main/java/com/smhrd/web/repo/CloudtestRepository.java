package com.smhrd.web.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smhrd.web.domain.Cloudtest;

@Repository
public interface CloudtestRepository extends JpaRepository<Cloudtest, Long> {

}
