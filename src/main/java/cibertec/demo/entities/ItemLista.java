package cibertec.demo.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "items_lista")

public class ItemLista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombreProducto;
    private Integer cantidad;
    private String estado = "PENDIENTE";

    @ManyToOne
    @JoinColumn(name="lista_id")
    @JsonIgnore
    private ListaCompra lista;
}
