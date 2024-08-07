package com.example.RestTravelCarApi.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.RestTravelCarApi.models.Payment;
public interface PaymentRepository extends JpaRepository<Payment,Integer>{


}
