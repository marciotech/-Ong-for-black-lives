package org.ong.ongforblacklives.controller.usuariodto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.ong.ongforblacklives.model.UsuarioModel;

@Data
//@Getter
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor

public class UsuarioDto {
    private String nome;
    private String cidade;
    private String bairro;
    private String cep;
    private String email;
    private String area_de_atuacao;

    public UsuarioDto build(UsuarioModel usuarioModel){
        UsuarioDto usuarioDto = new UsuarioDto()
                .setNome(usuarioModel.nome)
                .setCidade(usuarioModel.cidade)
                .setBairro(usuarioModel.getBairro())
                .setCep(usuarioModel.cep)
                .setEmail(usuarioModel.email)
                .setArea_de_atuacao(usuarioModel.area_de_atuacao);
        return usuarioDto;
    }

    /*public UsuarioDto(UsuarioDto usuarioDto) {
        this.nome = usuarioDto.getNome();
        this.cidade = usuarioDto.getCidade();
        this.bairro = usuarioDto.getBairro();
        this.cep = usuarioDto.getCep();
        this.email = usuarioDto.getEmail();
        this.area_de_atuacao = usuarioDto.getArea_de_atuacao();
    }

    public UsuarioDto(UsuarioModel usuarioModel) {

    }

    public UsuarioDto(Usuario entity) {

    }

    public static List<UsuarioDto> convert(List<UsuarioModel> usuarioModels){
        return usuarioModels.stream().map(UsuarioDto::new).collect(Collectors.toList());*/

    }

