package com.fall.mydelivery.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fall.mydelivery.entity.Employee;
import com.fall.mydelivery.mapper.EmployeeMapper;
import com.fall.mydelivery.service.EmployeeService;
import org.springframework.stereotype.Service;

/**
 * @author : fall
 * @date : 2022-08-04 16:47
 * @className : EmployeeServiceImpl
 * @description: description
 */

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper,Employee> implements EmployeeService {
}
