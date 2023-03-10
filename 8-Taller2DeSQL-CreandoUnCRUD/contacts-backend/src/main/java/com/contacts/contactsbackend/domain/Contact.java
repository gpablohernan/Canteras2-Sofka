package com.contacts.contactsbackend.domain;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Column;
import jakarta.persistence.GenerationType;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDate;

/**
 * @author Pablo Hernán Gatti
 *
 * Clase Contacto
 */
@Data
@Entity
@Table(name = "contact")
public class Contact implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "con_id", nullable = false)
    private Long id;
    @Column(name = "con_full_name", nullable = false)
    private String fullName;

    @Column(name = "con_phone_number", nullable = false)
    private String phoneNumber;

    @Column(name = "con_email", nullable = false)
    private String email;
    @Column(name = "con_birth_date", nullable = false)
    private LocalDate birthDate;
    @Column(name = "con_deleted_at")
    private Timestamp deletedAt;

    public void setId(Long id) {
        this.id = id;
    }
}
