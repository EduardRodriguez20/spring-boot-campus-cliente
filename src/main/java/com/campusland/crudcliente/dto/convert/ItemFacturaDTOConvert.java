package com.campusland.crudcliente.dto.convert;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.campusland.crudcliente.dto.ItemFacturaDTO;
import com.campusland.crudcliente.repositories.entities.ItemFactura;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class ItemFacturaDTOConvert {
    
    private ModelMapper mapper;

    public ItemFacturaDTO convertDTO(ItemFactura itemFactura) {
        return mapper.map(itemFactura, ItemFacturaDTO.class);
    }

    public ItemFactura convertEntity(ItemFacturaDTO dto) {
        return mapper.map(dto, ItemFactura.class);
    }

}
