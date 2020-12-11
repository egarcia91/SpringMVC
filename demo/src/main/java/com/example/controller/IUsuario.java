package com.example.controller;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

public interface IUsuario {

	public void autenticar(JTextField txtUsuario, JPasswordField txtPass);

	public void salir();

}
