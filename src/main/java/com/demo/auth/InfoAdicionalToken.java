package com.demo.auth;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;

import com.demo.auth.model.entity.Usuario;
import com.demo.auth.model.service.IUsuarioServices;

@Component
public class InfoAdicionalToken implements TokenEnhancer{
	
	@Autowired
	IUsuarioServices usuarioServices;

	@Override
	public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
	
		Usuario usuario = this.usuarioServices.findByUsername(authentication.getName());
		Map<String, Object> info = new HashMap<String, Object>();
		info.put("info_adicional", "hola que tal ".concat(authentication.getName()));
		info.put("infoUsuario", "usuario "+ usuario.getUsername());
		((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(info);
		return accessToken;
	}
	

}
