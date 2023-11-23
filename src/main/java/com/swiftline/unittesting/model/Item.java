package com.swiftline.unittesting.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonNull private int id;

    @NonNull private String description;

    @NonNull private double price;

    @NonNull private int quantity;

    @Transient
    private double value;
}
