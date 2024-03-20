package com.campusland.crudcliente.repositories.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "facturas")
public class Factura {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Cliente cliente;

    private Date date;

    // @OneToMany(cascade = CascadeType.ALL)
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "facturas_id")
    private List<ItemFactura> items;

    // @Column(name = "create_at")
    // @Temporal(TemporalType.DATE)
    // private Date createAt;

    public double getTotalFactura() {
        double total = 0;
        for (ItemFactura item : items) {
            total += item.getCantidad() * item.getProducto().getPrecio();
        }
        return total;
    }

}
