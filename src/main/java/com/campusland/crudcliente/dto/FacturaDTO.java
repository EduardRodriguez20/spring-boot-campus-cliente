package com.campusland.crudcliente.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class FacturaDTO {
    private Long codFactura;
    private Date fecha;
    private String cliente;
    private List<ItemFacturaDTO> productos = new ArrayList<>();

    public double getTotalFactura() {
        double total = 0;
        for (ItemFacturaDTO item : productos) {
            total += item.getSubtotal();
        }
        return total;
    }

    public void addProducto(ItemFacturaDTO producto) {
        productos.add(producto);
    }
}
