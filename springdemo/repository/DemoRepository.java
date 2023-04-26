package com.hostel.springdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hostel.springdemo.entity.DemoEntity;
@Repository
public interface DemoRepository extends JpaRepository<DemoEntity,Integer> {

}
