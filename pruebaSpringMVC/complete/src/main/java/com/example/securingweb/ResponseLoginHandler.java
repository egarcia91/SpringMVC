package com.example.securingweb;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


public class ResponseLoginHandler extends DefaultHandler {

	boolean bapellidoYNombre = false;
	boolean bclaveFechaModificacion = false;
	boolean bclaveVencida = false;
	boolean bcodigoRespuesta = false;
	boolean bcuil = false;
	boolean bnumeroTarjeta = false;
	boolean bdescripcion = false;

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

		if (qName.equalsIgnoreCase("return")) {
			System.out.println("Return Init");
		} else if (qName.equalsIgnoreCase("apellidoYNombre")) {
			bapellidoYNombre = true;
		} else if (qName.equalsIgnoreCase("claveFechaModificacion")) {
			bclaveFechaModificacion = true;
		} else if (qName.equalsIgnoreCase("claveVencida")) {
			bclaveVencida = true;
		} else if (qName.equalsIgnoreCase("codigoRespuesta")) {
			bcodigoRespuesta = true;
		} else if (qName.equalsIgnoreCase("cuil")) {
			bcuil = true;
		} else if (qName.equalsIgnoreCase("numeroTarjeta")) {
			bnumeroTarjeta = true;
		} else if (qName.equalsIgnoreCase("descripcion")) {
			bdescripcion = true;
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if (qName.equalsIgnoreCase("return")) {
			System.out.println("Return End");
		}
	}

	@Override
	public void characters(char ch[], int start, int length) throws SAXException {

		if (bapellidoYNombre) {
			System.out.println("Apellido y Nombre "+ new String(ch, start, length));
			bapellidoYNombre = false;
		} else if (bclaveFechaModificacion) {
			System.out.println("Clave Fecha Modificacion " + new String(ch, start, length));
			bclaveFechaModificacion = false;
		} else if (bclaveVencida) {
			System.out.println("Clave Vencida " + new String(ch, start, length));
			bclaveVencida = false;
		} else if (bcodigoRespuesta) {
			System.out.println("Codigo Respuesta " + new String(ch, start, length));
			bcodigoRespuesta = false;
		} else if (bcuil) {
			System.out.println("Cuil " + new String(ch, start, length));
			bcuil = false;
		} else if (bnumeroTarjeta) {
			System.out.println("Numero Tarjeta " + new String(ch, start, length));
			bnumeroTarjeta = false;
		} else if (bdescripcion) {
			System.out.println("Descripcion " + new String(ch, start, length));
			bdescripcion = false;
		}
	}
}
