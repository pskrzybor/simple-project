package pl.sdacademy.simple.repository;

import pl.sdacademy.simple.model.CarDTO;
import pl.sdacademy.simple.model.CarParameter;

import java.util.List;

public interface CarRepository {
    List<CarDTO> getCars(CarParameter carParameter);
}
