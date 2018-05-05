package com.codehub.spring.geometry.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.codehub.spring.geometry.domain.Point;
import com.codehub.spring.geometry.utility.PointReader;

@Repository
public class PointsFromFileRepository implements PointRepository {

    @Autowired
    private PointReader pointReader;

    @Value("${points.file.name}")
    private String fileName;

    @Override
    public List<Point> getPoints() {
        return pointReader.readFile(fileName);
    }
}
