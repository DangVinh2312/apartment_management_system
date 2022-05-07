package com.management.apartment.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.management.apartment.dto.room.RoomRequestDTO;
import com.management.apartment.helpers.RoomStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private double price;

    private String description;

    private RoomStatus roomStatus = RoomStatus.EMPTY;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(nullable = false)
    private Apartment apartment;

    public Room (RoomRequestDTO roomRequestDTO) {
        this.name = roomRequestDTO.getName();
        this.description = roomRequestDTO.getDescription();
        this.price = roomRequestDTO.getPrice();
    }
}
