package com.lib.borrower.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "Borrower")
public class BorrowerEntity {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String userName;
    private String Email;
    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String country;
    private String phoneNumber;
}
