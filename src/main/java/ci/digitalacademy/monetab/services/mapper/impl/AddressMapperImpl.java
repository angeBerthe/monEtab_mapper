package ci.digitalacademy.monetab.services.mapper.impl;

import ci.digitalacademy.monetab.models.Address;
import ci.digitalacademy.monetab.services.dto.AddressDTO;
import ci.digitalacademy.monetab.services.mapper.AddressMapper;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class AddressMapperImpl implements AddressMapper {

    private final ModelMapper modelMapper;
    @Override
    public AddressDTO fromEntity(Address entity) {
        return modelMapper.map(entity, AddressDTO.class);
    }

    @Override
    public Address toEntity(AddressDTO dto) {
        return modelMapper.map(dto, Address.class);
    }
}
