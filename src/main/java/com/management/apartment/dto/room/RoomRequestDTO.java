package com.management.apartment.dto.room;

import com.management.apartment.entities.Apartment;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RoomRequestDTO {
    private String name;

    private double price;

    private String description;

    private Long apartmentId;

}
