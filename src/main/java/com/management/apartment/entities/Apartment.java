package com.management.apartment.entities;

import com.management.apartment.dto.apartment.ApartmentRequestDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Apartment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String address;

    public Apartment(ApartmentRequestDTO apartmentRequestDTO){
        this.name = apartmentRequestDTO.getName();
        this.address = apartmentRequestDTO.getAddress();
    }
}
