package org.sam.gerenciador.modelo;

public class Usuario {
	
	private String login;
	private String contrasenia;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getContraseña() {
		return contrasenia;
	}
	public void setContraseña(String contraseña) {
		this.contrasenia = contraseña;
	}
	
	public boolean esIgual(String login, String contrasenia) {
		if (this.login.equals(login)) {
			return false;
		}
		if(this.contrasenia.equals(contrasenia)) {
			return false;
		}
		return true;
	}
}
