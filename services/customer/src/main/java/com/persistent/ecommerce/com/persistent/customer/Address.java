package com.persistent.ecommerce.com.persistent.customer;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.validation.annotation.Validated;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Document
@Builder
@Validated
public class Address {
    private String street;
    private String houseNumber;
    private String zipCode;
}
