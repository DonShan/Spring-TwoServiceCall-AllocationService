package com.madushan.AllocationServiceApplication.Service;

import com.madushan.AllocationServiceApplication.Model.Allocation;
import com.madushan.AllocationServiceApplication.Repository.AllocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    AllocationRepository employeeRepository;

    @Override
    public List<Allocation> findAllall() {
        return  employeeRepository.findAll();
    }

    @Override
    public Allocation save(Allocation allocation) {
        Allocation allocation1 = employeeRepository.save(allocation);
        return allocation1;
    }


    public List<Allocation> findallocationbyEmpid(Integer Eid) {

        Allocation emptyAllocationWithEid= new Allocation();

        emptyAllocationWithEid.setEmpid(Eid);

        Example<Allocation> example= Example.of(emptyAllocationWithEid);

        List<Allocation> all = employeeRepository.findAll(example);

        return  all;
    }


}
