package com.campusland.crudcliente.dto.convert;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.campusland.crudcliente.dto.FacturaDTO;
import com.campusland.crudcliente.repositories.entities.Factura;
import com.campusland.crudcliente.repositories.entities.ItemFactura;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class FacturaDTOConvert {
    
    private ModelMapper mapper;
    private ItemFacturaDTOConvert itemConvert;

    public FacturaDTO convertDTO(Factura factura) {
        FacturaDTO facturaDTO = new FacturaDTO();
        facturaDTO.setCodFactura(factura.getId());
        facturaDTO.setFecha(factura.getCreateAt());
        facturaDTO.setCliente(factura.getCliente().getNombreCompleto());
        for (ItemFactura item : factura.getItems()){
            facturaDTO.addProducto(itemConvert.convertDTO(item));
        }
        return facturaDTO;
    }

    public Factura convertEntity(FacturaDTO facturaDTO) {
        return mapper.map(facturaDTO, Factura.class);
    }

}
