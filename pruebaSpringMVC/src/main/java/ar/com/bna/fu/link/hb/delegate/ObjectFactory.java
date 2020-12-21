//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.12.21 a las 03:11:09 PM ART 
//


package ar.com.bna.fu.link.hb.delegate;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ar.com.bna.fu.link.hb.delegate package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Version_QNAME = new QName("http://delegate.hb.link.fu.bna.com.ar/", "version");
    private final static QName _EsCliente_QNAME = new QName("http://delegate.hb.link.fu.bna.com.ar/", "esCliente");
    private final static QName _EsClienteResponse_QNAME = new QName("http://delegate.hb.link.fu.bna.com.ar/", "esClienteResponse");
    private final static QName _VersionResponse_QNAME = new QName("http://delegate.hb.link.fu.bna.com.ar/", "versionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ar.com.bna.fu.link.hb.delegate
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VersionResponse }
     * 
     */
    public VersionResponse createVersionResponse() {
        return new VersionResponse();
    }

    /**
     * Create an instance of {@link EsCliente }
     * 
     */
    public EsCliente createEsCliente() {
        return new EsCliente();
    }

    /**
     * Create an instance of {@link EsClienteResponse }
     * 
     */
    public EsClienteResponse createEsClienteResponse() {
        return new EsClienteResponse();
    }

    /**
     * Create an instance of {@link Version }
     * 
     */
    public Version createVersion() {
        return new Version();
    }

    /**
     * Create an instance of {@link Usuario }
     * 
     */
    public Usuario createUsuario() {
        return new Usuario();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Version }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://delegate.hb.link.fu.bna.com.ar/", name = "version")
    public JAXBElement<Version> createVersion(Version value) {
        return new JAXBElement<Version>(_Version_QNAME, Version.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EsCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://delegate.hb.link.fu.bna.com.ar/", name = "esCliente")
    public JAXBElement<EsCliente> createEsCliente(EsCliente value) {
        return new JAXBElement<EsCliente>(_EsCliente_QNAME, EsCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EsClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://delegate.hb.link.fu.bna.com.ar/", name = "esClienteResponse")
    public JAXBElement<EsClienteResponse> createEsClienteResponse(EsClienteResponse value) {
        return new JAXBElement<EsClienteResponse>(_EsClienteResponse_QNAME, EsClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VersionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://delegate.hb.link.fu.bna.com.ar/", name = "versionResponse")
    public JAXBElement<VersionResponse> createVersionResponse(VersionResponse value) {
        return new JAXBElement<VersionResponse>(_VersionResponse_QNAME, VersionResponse.class, null, value);
    }

}
