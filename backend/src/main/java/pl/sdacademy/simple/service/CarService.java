package pl.sdacademy.simple.service;


import pl.sdacademy.simple.model.CarDTO;
import pl.sdacademy.simple.model.CarParameter;

import java.util.List;

public interface CarService {
    List<CarDTO> getCars(CarParameter carParameter);



}
