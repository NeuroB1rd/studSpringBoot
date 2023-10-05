package com.example.demo.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.*;

import java.util.Date;
import java.util.List;
@Getter
@Setter
@ToString
@NoArgsConstructor
public class FriendDTO {
    private long id;
    //@Pattern(regexp = "^[a-z ,.'-]+$")
    private String name;
    //@Pattern(regexp = "^[A-Z0-9._%+-]+@[A-Z0-9-]+.+.[A-Z]{2,4}$")
    private String email;
    @Pattern(regexp = "[0-9]{4}.[0-9]{2}.[0-9]{2}")
    private String birthDate;
    private List<FriendMini> friends;

}
