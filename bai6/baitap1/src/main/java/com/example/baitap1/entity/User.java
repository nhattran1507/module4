package com.example.baitap1.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "INT")
    private int id;

    @NotBlank(message = "First name is not empty")
    @Size(min = 5, max = 45, message = "First name must be between 5 and 45 Character")
    @Column(name = "first name", columnDefinition = "VARCHAR(50)")
    private String firstName;

    @NotBlank(message = "Last name is not empty")
    @Size(min = 5, max = 45, message = "Last name must be between 5 and 45 Character")
    @Column(name = "last name", columnDefinition = "VARCHAR(50)")
    private String lastName;

    @NotEmpty
    @Pattern(regexp = "^(\\+?[0-9]{1,4}[0-9]{9}|0[0-9]{9})$", message = "Phone Number is Invalid")
    @Column(name = "number phone", columnDefinition = "VARCHAR(15)")
    private String phone;

    @NotNull(message = "Age must not be null")
    @Min(value = 18, message = "Age must be at least 18")
    @Column(name = "age", columnDefinition = "INT")
    private int age;

    @NotEmpty(message = "Email must not be empty")
    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$", message = "Email should be valid")
    @Column(name = "email", columnDefinition = "VARCHAR(50)")
    private String email;
}
