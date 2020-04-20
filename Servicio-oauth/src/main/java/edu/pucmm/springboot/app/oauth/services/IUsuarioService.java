package edu.pucmm.springboot.app.oauth.services;

import edu.pucmm.springboot.app.oauth.models.entity.Usuario;

public interface IUsuarioService {

	public Usuario findByUsername(String username);
}
