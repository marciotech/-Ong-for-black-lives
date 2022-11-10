package org.ong.ongforblacklives.controller.usuariodto;

import org.ong.ongforblacklives.model.UsuarioModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Data
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

	public UsuarioDto build(UsuarioModel usuarioModel) {
		return new UsuarioDto().setNome(usuarioModel.nome).setCidade(usuarioModel.cidade)
				.setBairro(usuarioModel.getBairro()).setCep(usuarioModel.cep).setEmail(usuarioModel.email)
				.setArea_de_atuacao(usuarioModel.area_de_atuacao);
	}
}
