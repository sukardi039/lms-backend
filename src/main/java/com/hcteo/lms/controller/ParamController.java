package com.hcteo.lms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcteo.lms.model.Param;
import com.hcteo.lms.service.ParamService;

@RestController
@RequestMapping("/api/params")
@CrossOrigin(origins = "*")
public class ParamController {

    @Autowired
    private ParamService paramService;

    @GetMapping
    public List<Param> getAllParam() {
        return paramService.getAllParams();
    }

}
