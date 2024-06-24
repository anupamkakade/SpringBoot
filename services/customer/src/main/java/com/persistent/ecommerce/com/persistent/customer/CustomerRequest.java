package com.persistent.ecommerce.com.persistent.customer;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record CustomerRequest (
        String id,
        @NotNull(message =  "Customer First Name is required")
        String firstName,
        @NotNull(message =  "Customer Last Name is required")
        String lastName,
        @NotNull(message =  "Customer Email is required")
        @Email(message = "Customer email addresss is not valid email address")
        String email,
        Address address
){
}
