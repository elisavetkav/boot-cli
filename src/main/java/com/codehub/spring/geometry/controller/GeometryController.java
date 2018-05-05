package com.codehub.spring.geometry.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.codehub.spring.geometry.service.ShapeService;

@Controller
public class GeometryController {

    @Autowired
    private ShapeService shapeService;

    void printShortest() {
        System.out.println(shapeService.findShortest());
    }

    void printLongest() {
        System.out.println(shapeService.findLongest());
    }
}
