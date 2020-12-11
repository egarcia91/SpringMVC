package com.example.view;

import com.example.controller.IUsuario;

public class LoginView extends javax.swing.JFrame {

	private IUsuario controlador;

	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPasswordField jPasswordField1;
	private javax.swing.JTextField jTextField1;

	public LoginView(IUsuario controlador) {
		initComponents();

		this.controlador = controlador;
		LoginView.this.setVisible(true);
		LoginView.this.setTitle("LOGIN");
		LoginView.this.setLocationRelativeTo(null);
	}

	@SuppressWarnings("unchecked")
	private void initComponents() {
		java.awt.GridBagConstraints gridBagConstraints;

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		jPasswordField1 = new javax.swing.JPasswordField();
		jLabel3 = new javax.swing.JLabel();
		jPanel2 = new javax.swing.JPanel();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(new java.awt.GridBagLayout());

		jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		jPanel1.setLayout(new java.awt.GridBagLayout());

		jLabel1.setText("Usuario");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
		jPanel1.add(jLabel1, gridBagConstraints);

		jTextField1.setPreferredSize(new java.awt.Dimension(220, 20));
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
		gridBagConstraints.insets = new java.awt.Insets(0, 10, 10, 10);
		jPanel1.add(jTextField1, gridBagConstraints);

		jLabel2.setText("Contraseña");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
		jPanel1.add(jLabel2, gridBagConstraints);

		jPasswordField1.setPreferredSize(new java.awt.Dimension(220, 20));
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 3;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(0, 10, 10, 10);
		jPanel1.add(jPasswordField1, gridBagConstraints);

		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.insets = new java.awt.Insets(0, 10, 10, 10);
		getContentPane().add(jPanel1, gridBagConstraints);

		jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel3.setText("Autenticación");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
		getContentPane().add(jLabel3, gridBagConstraints);

		jPanel2.setLayout(new java.awt.GridLayout(1, 0));

		jButton1.setText("Ingresar");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});
		jPanel2.add(jButton1);

		jButton2.setText("Salir");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});
		jPanel2.add(jButton2);

		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.insets = new java.awt.Insets(0, 10, 10, 10);
		getContentPane().add(jPanel2, gridBagConstraints);

		pack();
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
		controlador.autenticar(jTextField1, jPasswordField1);
	}// GEN-LAST:event_jButton1ActionPerformed

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
		controlador.salir();
	}// GEN-LAST:event_jButton2ActionPerformed

}