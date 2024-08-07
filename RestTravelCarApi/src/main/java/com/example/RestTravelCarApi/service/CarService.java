package com.example.RestTravelCarApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.RestTravelCarApi.repository.*;
import com.example.RestTravelCarApi.models.*;
import java.util.List;

@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;

    @Autowired
    private ModelRepository modelRepository;

    @Autowired
    private MakeRepository makeRepository;

    @Autowired
    private TypeRepository typeRepository;

    public Car saveCar(CarDTO carDTO) {
        Model model = modelRepository.findByModelName(carDTO.getModelName())
            .orElseThrow(() -> new IllegalArgumentException("Model not found"));
        Make make = makeRepository.findByMakeName(carDTO.getMakeName())
            .orElseThrow(() -> new IllegalArgumentException("Make not found"));
        Type type = typeRepository.findByTypeName(carDTO.getTypeName())
            .orElseThrow(() -> new IllegalArgumentException("Type not found"));

        Car car = new Car();
        car.setCarName(carDTO.getCarName());
        car.setModel(model);
        car.setMake(make);
        car.setType(type);
        car.setYear(carDTO.getYear());
        car.setSeatCapacity(carDTO.getSeatCapacity());
        car.setAirConditioned(carDTO.isAirConditioned());
        car.setPricePerDay(carDTO.getPricePerDay());
        car.setStatus(carDTO.getStatus());

        return carRepository.save(car);
    }
    @Autowired
    
    public List<Model> getAllModel() {
        return modelRepository.findAll();
    }
    public List<Make> getAllMake() {
        return makeRepository.findAll();
    }
    public List<Type> getAllType() {
        return typeRepository.findAll();
    }
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    public Car getCarById(int id) {
        return carRepository.findById(id).orElse(null);
    }

    public Car saveCar(Car car) {
        return carRepository.save(car);
    }
    public Model saveModel(Model model){
        return modelRepository.save(model);
    }
    public Make saveMake(Make make){
        return makeRepository.save(make);
    }
    public Type saveType(Type type){
        return typeRepository.save(type);
    }
    // public void deleteCar(Long id) {
    //     carRepository.deleteById(id);
    // }
}