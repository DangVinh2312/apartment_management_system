package com.management.apartment.services;

import com.management.apartment.dto.apartment.ApartmentRequestDTO;
import com.management.apartment.entities.Apartment;
import com.management.apartment.repositoties.ApartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApartmentService {
    @Autowired
    private ApartmentRepository apartmentRepository;

    public List<Apartment> getAllApartments() {
        return apartmentRepository.findAll();
    }

    public void saveApartment(ApartmentRequestDTO apartmentRequestDTO) {
        Apartment apartment = new Apartment(apartmentRequestDTO);
        apartmentRepository.save(apartment);
    }

    public ApartmentRequestDTO editApartment(Long id) {
        Apartment apartment = apartmentRepository.getById(id);
        ApartmentRequestDTO apartmentRequestDTO = new ApartmentRequestDTO(apartment);
        return apartmentRequestDTO;
    }
}
