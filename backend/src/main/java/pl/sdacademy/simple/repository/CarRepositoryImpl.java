package pl.sdacademy.simple.repository;

import pl.sdacademy.simple.model.CarDTO;
import pl.sdacademy.simple.model.CarParameter;

import java.util.ArrayList;
import java.util.List;

public class CarRepositoryImpl implements CarRepository{
    @Override
    public List<CarDTO> getCars(CarParameter carParameter) {
        return new ArrayList<>();
    }
}
