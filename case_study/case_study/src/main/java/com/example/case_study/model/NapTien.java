package com.example.case_study.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "nap_tien")
public class NapTien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "INT")
    private int id;

    @NotNull(message = "User ID must not be null")
    @ManyToOne
    @JoinColumn(name = "id_nguoi_dung", referencedColumnName = "id")
    private NguoiDung nguoiDung;

    @NotNull(message = "Amount must not be null")
    @DecimalMin(value = "0.0", inclusive = false, message = "Amount must be greater than zero")
    @Digits(integer = 13, fraction = 2, message = "Amount must have at most 13 integer digits and 2 decimal places")
    @Column(name = "so_tien", columnDefinition = "DECIMAL(15,2)", nullable = false)
    private double soTien;

    @NotNull(message = "Payment date must not be null")
    @PastOrPresent(message = "Payment date cannot be in the future")
    @Column(name = "ngay_nop", columnDefinition = "DATE", nullable = false)
    private LocalDate ngayNop;

    @NotBlank(message = "Payment method must not be empty")
    @Size(max = 50, message = "Payment method must not exceed 50 characters")
    @Column(name = "phuong_thuc_thanh_toan", columnDefinition = "VARCHAR(50)")
    private String phuongThucThanhToan;

    @NotNull(message = "Status must not be null")
    @Column(name = "status", columnDefinition = "ENUM('Pending', 'Completed', 'Cancelled')", nullable = false)
    private String status;
}