package com.sda.writejson;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author nieckarz
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    String name;
    String lastName;
    Address address;


}
