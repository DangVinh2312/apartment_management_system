package com.management.apartment.dto.contract;

import com.management.apartment.entities.ContactDetail;
import com.management.apartment.entities.Room;
import com.management.apartment.entities.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embedded;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class ContractRequestDTO {
    private LocalDate startDate;

    private LocalDate endDate;

    private Long roomId;

    private Long userId;

    private double initPrice;

    private double deposit;

    private double electricPrice;

    private double waterPrice;

    private double cleaningFee;

    private double parkingFee;
}
