package ci.digitalacademy.monetab.services.mapper.impl;

import ci.digitalacademy.monetab.models.NoteFile;
import ci.digitalacademy.monetab.services.dto.NoteFileDTO;
import ci.digitalacademy.monetab.services.mapper.NoteFileMapper;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class NoteFileImpl implements NoteFileMapper {

    private final ModelMapper modelMapper;
    @Override
    public NoteFileDTO fromEntity(NoteFile entity) {
        return modelMapper.map(entity, NoteFileDTO.class);
    }

    @Override
    public NoteFile toEntity(NoteFileDTO dto) {
        return modelMapper.map(dto, NoteFile.class);
    }
}
