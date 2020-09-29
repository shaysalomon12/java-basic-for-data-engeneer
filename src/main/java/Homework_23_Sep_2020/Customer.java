package Homework_23_Sep_2020;

import lombok.*;
import java.util.List;
import java.util.Objects;

@Data
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@With
@Builder
public class Customer {

        private String first_Name;
        private String last_Name;
        private int age;
        private String address;



}
