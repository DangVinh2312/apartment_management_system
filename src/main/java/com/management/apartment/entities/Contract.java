package com.management.apartment.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private LocalDate startDate;

    private LocalDate endDate;

    @OneToOne
    @JoinColumn
    private Room room;

    @OneToOne
    @JoinColumn
    private User user;

    @Embedded
    private ContactDetail contactDetail;

}
