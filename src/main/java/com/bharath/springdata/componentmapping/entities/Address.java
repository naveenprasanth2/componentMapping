package com.bharath.springdata.componentmapping.entities;

import jakarta.persistence.Embeddable;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Embeddable
public class Address {
    private String streetaddress;
    private String city;
    private String state;
    private String zipCode;
    private String country;
}
