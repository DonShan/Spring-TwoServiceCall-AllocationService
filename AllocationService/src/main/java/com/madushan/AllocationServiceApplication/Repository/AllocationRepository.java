package com.madushan.AllocationServiceApplication.Repository;

import com.madushan.AllocationServiceApplication.Model.Allocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AllocationRepository extends JpaRepository<Allocation,Integer> {

}

