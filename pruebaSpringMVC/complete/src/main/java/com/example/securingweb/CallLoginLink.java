package com.example.securingweb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Properties;

//import org.apache.commons.lang3.StringUtils;
//import org.json.JSONObject;

public class CallLoginLink {
	
	public CallLoginLink() {}

	protected boolean callLoginLinkMethod() throws SocketTimeoutException, IOException {

		URL url;
		try {
			url = new URL("https://10.7.232.26:443/ws_login_1_1/ConsultarDatosUsuarioService");
		} catch (MalformedURLException e) {
			System.out.println("me fui por malformacion de URL");
			throw new RuntimeException("Error al crear URL", e);
		}

		int connectTimeout = 5000;
		int requestTimeout = 5000;

		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		System.out.println("por el momento pude hacer la conexion");
		conn.setDoOutput(true);
		conn.setConnectTimeout(connectTimeout);
		conn.setReadTimeout(requestTimeout);
		conn.setRequestMethod("POST");
		conn.setRequestProperty("Content-Type", "application/json");

		System.out.println("empiezo a pasar parametros por body");
		conn.setRequestProperty("user", "asdf");
		conn.setRequestProperty("password", "asdasd");
		conn.setRequestProperty("IpCliente", "192.168.1.23");

		// response.code =
		System.out.println("hago el llamado a servidor");
		System.out.println(conn.getResponseCode());
		/*
		 * InputStream is = isResponseCodeOKForHTTPClient(response.code) ? conn
		 * .getInputStream() : conn.getErrorStream();
		 * 
		 * String encoding = conn.getContentEncoding();
		 * 
		 * if (is != null) { BufferedReader br = new BufferedReader(new
		 * InputStreamReader(is, null == encoding ? "UTF-8" : encoding));
		 * 
		 * StringBuilder builder = new StringBuilder(); String line = null; while ((line
		 * = br.readLine()) != null) { builder.append(line); } response.body =
		 * builder.toString();
		 * 
		 * }
		 */

		return true;
	}
}
