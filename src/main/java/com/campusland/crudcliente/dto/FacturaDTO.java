package com.campusland.crudcliente.dto;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class FacturaDTO {
    private Long idFactura;
    private Date fecha;
    private String cliente;
    private String descripcion;
    private List<ItemFacturaDTO> productos;
}
