package com.management.apartment.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.management.apartment.dto.user.UserRequestDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String cccd;

    private LocalDate dob;

    private String tel;

    private String homeTown;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "user")
    @JsonIgnore
    private Contract contract;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    public User (UserRequestDTO userRequestDTO) {
        this.name = userRequestDTO.getName();
        this.cccd = userRequestDTO.getCccd();
        this.dob = userRequestDTO.getDob();
        this.tel = userRequestDTO.getTel();
        this.homeTown = userRequestDTO.getHomeTown();
    }
}
