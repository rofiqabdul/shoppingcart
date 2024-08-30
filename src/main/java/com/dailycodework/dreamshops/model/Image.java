/* Copyright (C) 2024 ASYX International B.V. All rights reserved. */
package com.dailycodework.dreamshops.model;

import java.sql.Blob;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Rofiq
 * @version 1.0, Aug 30, 2024
 * @since 
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fileName;
    private String fileType;
    
    @Lob
    private Blob image;
    private String downloadUrl;
    
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

}
