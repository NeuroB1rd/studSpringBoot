package com.example.demo.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FriendModel {
    private long id;
    //@Pattern(regexp = "^[a-z ,.'-]+$")
    private String name;
    //@Pattern(regexp = "^[A-Z0-9._%+-]+@[A-Z0-9-]+.+.[A-Z]{2,4}$")
    private String email;
    @NotEmpty
    private Date birthDate;
    private List<FriendMini> friends;

}
