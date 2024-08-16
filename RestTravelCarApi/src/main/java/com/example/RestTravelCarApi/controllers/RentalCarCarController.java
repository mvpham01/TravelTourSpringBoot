package com.example.RestTravelCarApi.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.RestTravelCarApi.models.DTO.RentalDTO;
import com.example.RestTravelCarApi.models.Entity.Rental;
import com.example.RestTravelCarApi.service.*;
import java.util.List;
import org.springframework.security.core.context.SecurityContextHolder;
@RestController
@RequestMapping("/api/rental")
public class RentalCarCarController {
    @Autowired
    private RentalCarService rentalCarService;

    @GetMapping
    public List<Rental> getAllBookings() {
        return rentalCarService.getAllBookings();
    }
    @PostMapping
    public Rental saveRental(@RequestBody RentalDTO rentalDTO) {
        // if(rentalDTO.getUserId()==0){
        //     rentalDTO.setUserId(SecurityContextHolder.getContext().getAuthentication(). );
        // }
        return rentalCarService.saveRental(rentalDTO);
    }
    // @GetMapping("/{id}")
    // public BookingCar getBookingById(@PathVariable Long id) {
    //     return bookingCarService.getBookingById(id);
    // }


    // @PostMapping
    // public BookingCar saveBooking(@RequestBody BookingCar bookingCar) {
    //     return bookingCarService.saveBooking(bookingCar);
    // }

    // @DeleteMapping("/{id}")
    // public void deleteBooking(@PathVariable Long id) {
    //     bookingCarService.deleteBooking(id);
    // }
}
