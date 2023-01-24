package com.cars.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cars.api.model.Car;

public interface CarsRepository extends JpaRepository<Car, Long> {
    
}
