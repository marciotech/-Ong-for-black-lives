package model;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

import javax.annotation.processing.Generated;


@EntityScan
public class Usuarios {


    @Id

    private Long id;
    private String nome;
}
