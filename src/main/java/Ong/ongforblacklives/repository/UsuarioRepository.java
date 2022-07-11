package Ong.ongforblacklives.repository;

import Ong.ongforblacklives.model.UsuarioModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository<UsuarioModel, String> {
}