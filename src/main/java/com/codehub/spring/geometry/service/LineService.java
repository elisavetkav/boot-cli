package com.codehub.spring.geometry.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codehub.spring.geometry.domain.Line;
import com.codehub.spring.geometry.domain.Point;
import com.codehub.spring.geometry.repository.PointRepository;

@Service
public class LineService implements ShapeService{

    @Autowired
    PointRepository pointRepository;

    public double findShortest() {
        List<Line> lineList = getSortedList();
        return lineList.get(0).distance();
    }

    public double findLongest() {
        List<Line> lineList = getSortedList();
        return lineList.get(lineList.size()).distance();
    }

    private List<Line> getSortedList() {
        List<Point> pointList = pointRepository.getPoints();
        List<Line> lineList = getLines(pointList);
        lineList.sort(Comparator.comparing(Line::distance));
        return lineList;
    }

    private List<Line> getLines(List<Point> pointList) {
        List<Line> lineList = new ArrayList<>();
        for (int i = 1; i < pointList.size(); i += 2) {
            lineList.add(new Line(pointList.get(i-1), pointList.get(i)));
        }
        return lineList;
    }
}
