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

public class CallLoginLink {

	public CallLoginLink() {}

	protected boolean callLoginLinkMethod(String user, String pass) throws SocketTimeoutException, IOException {

		URL url;
		try {
			url = new URL("https://dws06ct0001.dcc.dbna.net/ws_login_1_1/ConsultarDatosUsuarioService");
		} catch (MalformedURLException e) {
			System.out.println("me fui por malformacion de URL");
			throw new RuntimeException("Error al crear URL", e);
		}

		int connectTimeout = 50000;
		int requestTimeout = 50000;
		String basicAuth = "Basic d3NfbG9naW5fbGluazpQYXNzdzByZA==";

		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		System.out.println("por el momento pude hacer la conexion");
		conn.setDoOutput(true);
		conn.setConnectTimeout(connectTimeout);
		conn.setReadTimeout(requestTimeout);
		conn.setRequestMethod("POST");
		conn.setRequestProperty("Authorization", basicAuth);
		//conn.setRequestProperty("Content-Type", "application/json");
		conn.setRequestProperty("Accept-Encoding", "gzip,deflate"); 
		conn.setRequestProperty("Content-Type", "application/soap+xml;charset=UTF-8");
		//conn.setRequestProperty("Content-Length", "391");
		conn.setRequestProperty("Connection", "Keep-Alive");

//			Host: 10.7.232.26:443
//			User-Agent: Apache-HttpClient/4.5.5 (Java/12.0.1)


		System.out.println("empiezo a pasar parametros por body");
//		conn.setRequestProperty("Alias", "wslogin3");
//		conn.setRequestProperty("Clave", "Prueba05");
//		conn.setRequestProperty("IpCliente", "");

		String xmlValue = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:del=\"http://delegate.hb.link.fu.bna.com.ar/\"><soap:Header/><soap:Body><del:esCliente><arg0>"+user+"</arg0><arg1>"+pass+"</arg1></del:esCliente></soap:Body></soap:Envelope>";
		//String jsonValue = "{\"Alias\":\"wslogin3\",\"Clave\":\"Prueba05\",\"IpCliente\":\"\"}";
		OutputStream os = conn.getOutputStream();
		os.write(xmlValue.getBytes());
		os.flush();

		System.out.println("hago el llamado a servidor");
		System.out.println(conn.getResponseCode());
		System.out.println("aca ya no llega");

		InputStream is = isResponseCodeOKForHTTPClient(conn.getResponseCode()) ? conn
		.getInputStream() : conn.getErrorStream();

		String encoding = conn.getContentEncoding();

		if (is != null) {

			BufferedReader br = new BufferedReader(new InputStreamReader(is, null == encoding ? "UTF-8" : encoding));
			StringBuilder builder = new StringBuilder();
			String line = null;
			while ((line = br.readLine()) != null) {
				builder.append(line);
			}

			System.out.println(builder.toString());
		}

		return true;
	}

	private boolean isResponseCodeOKForHTTPClient(int code) {
		return code >= 200 && code < 400;
	}


}
