package ci.digitalacademy.monetab.services.mapper.impl;

import ci.digitalacademy.monetab.models.Teacher;
import ci.digitalacademy.monetab.services.dto.TeacherDTO;
import ci.digitalacademy.monetab.services.mapper.TeacherMapper;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class TeacherMapperImpl implements TeacherMapper {

    private final ModelMapper modelMapper;
    @Override
    public TeacherDTO fromEntity(Teacher entity) {
        return modelMapper.map(entity, TeacherDTO.class);
    }

    @Override
    public Teacher toEntity(TeacherDTO dto) {
        return modelMapper.map(dto, Teacher.class);
    }
}
