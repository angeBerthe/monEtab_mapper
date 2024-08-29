package ci.digitalacademy.monetab.services.mapper;

public interface EntityMapper <D, E>{

    D fromEntity(E entity);
    E toEntity(D dto);
}
