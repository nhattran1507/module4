package com.example.case_study.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "bds")
public class BDS {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "INT")
    private int id;

    @NotBlank(message = "Status must not be empty")
    @Column(name = "status", columnDefinition = "ENUM('Available', 'Sold', 'Rented')", nullable = false)
    private String status;

    @Size(max = 255, message = "Location must be at most 255 characters")
    @Column(name = "vi_tri", columnDefinition = "VARCHAR(255)")
    private String viTri;

    @Size(max = 50, message = "Direction must be at most 50 characters")
    @Column(name = "huong", columnDefinition = "VARCHAR(50)")
    private String huong;

    @NotNull(message = "Price must not be null")
    @Column(name = "gia", columnDefinition = "DECIMAL(15,2)")
    private Double gia;

    @Column(name = "anh", columnDefinition = "TEXT")
    private String anh;

    @NotNull(message = "ID Loai BDS must not be null")
    @Column(name = "id_loai_bds", columnDefinition = "INT")
    private int idLoaiBDS;
}
