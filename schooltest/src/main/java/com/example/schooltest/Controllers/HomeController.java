package com.example.schooltest.Controllers;

import com.example.schooltest.Repositories.DepartmentRepository;
import com.example.schooltest.Repositories.LecturerRepository;
import com.example.schooltest.Repositories.ScheduleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    DepartmentRepository departmentRepo;
    @Autowired
    LecturerRepository lecturerRepo;
    @Autowired
    ScheduleRepository scheduleRepo;
    
    @RequestMapping("")
    public String home(Model model) {
        model.addAttribute("lists", scheduleRepo.findAllDistinctData());
        return "home";
    }
}
