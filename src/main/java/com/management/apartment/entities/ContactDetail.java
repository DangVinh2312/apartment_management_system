package com.management.apartment.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
public class ContactDetail {
    private double initPrice;

    private double deposit;

    private double electricPrice;

    private double waterPrice;

    private double cleaningFee;

    private double parkingFee;
}
