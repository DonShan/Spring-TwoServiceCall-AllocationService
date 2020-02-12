package com.madushan.AllocationServiceApplication.Service;

import com.madushan.AllocationServiceApplication.Model.Allocation;

import java.util.List;

public interface EmployeeService {
    public List<Allocation> findAllall();

    public Allocation save(Allocation allocation);

    public List<Allocation> findallocationbyEmpid(Integer id);
}
