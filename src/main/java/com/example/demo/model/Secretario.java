package models;

import jakarta.persistence.Entity;

@Entity
public class Secretario extends Usuario{
    private Integer qtdBoletinsGerados;
}
