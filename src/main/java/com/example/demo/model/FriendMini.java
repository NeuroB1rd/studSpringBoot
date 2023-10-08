package com.example.demo.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class FriendMini {
    @NotNull
    private long id;
    @Pattern(regexp = "^[а-яА-ЯёЁa-zA-Z]+$")
    private String name;

}
