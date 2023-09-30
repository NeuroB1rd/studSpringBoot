package com.example.demo.model;

import jakarta.validation.constraints.Min;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FindMiddleNumModel {

    @Min(1)
    private int size;

    private int highestNum;

}
