package com.campusland.crudcliente.dto;

import lombok.Data;

@Data
public class ItemFacturaDTO {
    
    private Integer cantidad;    
    private String producto;
    private Double precio;

    public Double getSubtotal() {
        return cantidad * precio;
    }

}
