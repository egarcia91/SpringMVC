package com.example.controller;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.example.model.Usuario;
import com.example.view.LoginView;

public class UsuarioController implements IUsuario {

	private LoginView loginView;

	public UsuarioController() {
		this.loginView = new LoginView(this);
	}

	@Override
	public void autenticar(JTextField txtUsuario, JPasswordField txtPass) {
		Usuario usuario = new Usuario().autenticar(txtUsuario.getText(), String.copyValueOf(txtPass.getPassword()));
		if (usuario != null) {
			JOptionPane.showMessageDialog(null, "Ingreso permitido", "Mouse dice", JOptionPane.INFORMATION_MESSAGE,
					null);
		} else {
			JOptionPane.showMessageDialog(null, "Los datos son incorrectos", "Error", JOptionPane.ERROR_MESSAGE, null);
		}

	}

	@Override
	public void salir() {
		loginView.dispose();

	}

}

