package br.com.CRUDAngular.CRUDSpring.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("_id")
    private long id;

    @Column(length = 255, nullable = false)
    private String name;

    @Column(length = 20, nullable = false)
    private String categoria;
}
