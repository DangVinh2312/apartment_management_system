package com.management.apartment.dto.user;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.management.apartment.entities.Apartment;
import com.management.apartment.entities.Room;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class UserRequestDTO {
    @NotBlank
    private String name;

    @NotBlank
    private String cccd;

    @NotNull
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate dob;

    private String tel;

    private String homeTown;

    private Apartment apartment;

    private String roomName;
}
