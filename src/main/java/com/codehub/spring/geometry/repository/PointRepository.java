package com.codehub.spring.geometry.repository;

import java.util.List;

import com.codehub.spring.geometry.domain.Point;

public interface PointRepository {

    List<Point> getPoints();
}
