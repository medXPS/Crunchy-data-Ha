package com.testpg.test.pg.replication.on.k8s.cluster.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;

@Data
@Entity
public class Item {
    @Id
    private Long id;

    @Column(name = "\"desc\"") // Use escaped double quotes for the column name
    private String description; // Renamed the field to avoid conflict with reserved keyword


}
