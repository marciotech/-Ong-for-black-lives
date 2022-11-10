/*package org.ong.ongforblacklives.repository;

import org.ong.ongforblacklives.model.UserModel;
import org.ong.ongforblacklives.model.UsuarioModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends MongoRepository<UUID> {



    List<UserModel> findAll();

    Optional<UserModel> findById(UUID id);

    UsuarioModel getById(UUID id);

    void delete(UserModel deleteUsuarioById);
}
*/