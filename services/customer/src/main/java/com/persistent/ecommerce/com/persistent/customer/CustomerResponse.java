package com.persistent.ecommerce.com.persistent.customer;



public record CustomerResponse (
        String id,
        String firstName,
        String lastName,
        String email,
        Address address){

}
