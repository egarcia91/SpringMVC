package com.example.model;

public class Usuario {
	
	private String user;
	
	private String password;
	
	public Usuario() {}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
     * Metodo para autenticar usuario
     * datos de prueba
     *    usuario: prueba
     *    pass: 123
     * 
     * @param nickname nombre de usuario
     * @param pass Palabra clave
     * @return Usuario si existe sino NULL
     */
    public Usuario autenticar(String user, String password){        
        if("prueba".equals(user) && "123".equals(password)){
            return new Usuario();
        }
        return null;
    }

}
