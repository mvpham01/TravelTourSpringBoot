package com.example.RestTravelCarApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.RestTravelCarApi.repository.*;
import com.example.RestTravelCarApi.models.*;
import com.example.RestTravelCarApi.models.DTO.RentalDTO;
import com.example.RestTravelCarApi.models.Entity.Car;
import com.example.RestTravelCarApi.models.Entity.Payment;
import com.example.RestTravelCarApi.models.Entity.Rental;
import com.example.RestTravelCarApi.models.Entity.User;

import java.util.List;

@Service
public class RentalCarService {
    @Autowired
    private RentalRepository rentalCarRepository;

    public List<Rental> getAllBookings() {
        return rentalCarRepository.findAll();
    }
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private PaymentRepository paymentRepository;
    // public Rental getBookingById(Long id) {
    //     return rentalCarRepository.findById(id).orElse(null);
    // }

    public Rental saveBooking(Rental bookingCar) {
        return rentalCarRepository.save(bookingCar);
    }
    public Rental saveRental(RentalDTO rentalDTO) {
        User user = userRepository.findById(rentalDTO.getUserId())
            .orElseThrow(() -> new IllegalArgumentException("User not found"));
        Car car = carRepository.findById(rentalDTO.getCarId())
            .orElseThrow(() -> new IllegalArgumentException("Car not found"));
        Payment payment = paymentRepository.findById(rentalDTO.getPaymentId())
            .orElseThrow(() -> new IllegalArgumentException("Payment not found"));

        Rental rental = new Rental();
        rental.setUser(user);
        rental.setCar(car);
        rental.setPayment(payment);
        rental.setRentalDate(rentalDTO.getRentalDate());
        rental.setReturnDate(rentalDTO.getReturnDate());
        rental.setTotalAmount(rentalDTO.getTotalAmount());

        return rentalCarRepository.save(rental);
    }
    // public void deleteBooking(Long id) {
    //     rentalCarRepository.deleteById(id);
    // }
}
