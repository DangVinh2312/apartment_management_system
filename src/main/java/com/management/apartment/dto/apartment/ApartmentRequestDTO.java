package com.management.apartment.dto.apartment;

import com.management.apartment.entities.Apartment;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
public class ApartmentRequestDTO {
    @NotBlank
    private String name;

    @NotBlank
    private String address;

    public ApartmentRequestDTO(Apartment apartment){
        this.name = apartment.getName();
        this.address = apartment.getAddress();
    }
}
