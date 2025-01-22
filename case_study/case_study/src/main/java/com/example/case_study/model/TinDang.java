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
@Entity(name = "tin_dang")
public class TinDang {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "INT")
    private int id;

    @NotBlank(message = "Status must not be empty")
    @Column(name = "status", columnDefinition = "ENUM('Pending', 'Approved', 'Rejected')", nullable = false)
    private String status;

    @NotBlank(message = "Title must not be empty")
    @Size(max = 255, message = "Title must be at most 255 characters")
    @Column(name = "tieu_de", columnDefinition = "VARCHAR(255)", nullable = false)
    private String tieuDe;

    @Column(name = "noi_dung", columnDefinition = "TEXT")
    private String noiDung;

    @NotNull(message = "ID Loai Tin must not be null")
    @Column(name = "id_loai_tin", columnDefinition = "INT")
    private int idLoaiTin;

    @NotNull(message = "ID Muc Dich must not be null")
    @Column(name = "id_muc_dich", columnDefinition = "INT")
    private int idMucDich;

    @NotNull(message = "ID BDS must not be null")
    @Column(name = "id_bds", columnDefinition = "INT")
    private int idBDS;

    @NotNull(message = "ID Nguoi Dung must not be null")
    @Column(name = "id_nguoi_dung", columnDefinition = "INT")
    private int idNguoiDung;

    @NotNull(message = "Publish Date must not be null")
    @Column(name = "ngay_dang_bai", columnDefinition = "DATE", nullable = false)
    private java.time.LocalDate ngayDangBai;

    @Column(name = "ngay_ket_thuc", columnDefinition = "DATE")
    private java.time.LocalDate ngayKetThuc;
}
