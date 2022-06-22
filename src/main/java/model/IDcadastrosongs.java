package model;

import java.util.List;
import java.util.Optional;

public interface IDcadastrosongs {

    IDcadastrosongs save(IDcadastrosongs iDcadastrosongs);
    IDcadastrosongs update(IDcadastrosongs iDcadastrosongs);
    void delete(Long id);
    List<IDcadastrosongs> findAll();
    Optional<IDcadastrosongs> findById(Long id);
    List<IDcadastrosongs> findByAreadeatuacao(IDcadastrosongs iDcadastrosongs);
}
