/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daa2.model.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author CHELLI BONITA
 */
@Entity
@Table(name = "cliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c")
    , @NamedQuery(name = "Cliente.findByIdCliente", query = "SELECT c FROM Cliente c WHERE c.idCliente = :idCliente")
    , @NamedQuery(name = "Cliente.findByRazonSocial", query = "SELECT c FROM Cliente c WHERE c.razonSocial = :razonSocial")
    , @NamedQuery(name = "Cliente.findByRuc", query = "SELECT c FROM Cliente c WHERE c.ruc = :ruc")
    , @NamedQuery(name = "Cliente.findByIdDistrito", query = "SELECT c FROM Cliente c WHERE c.idDistrito = :idDistrito")
    , @NamedQuery(name = "Cliente.findByDireccion", query = "SELECT c FROM Cliente c WHERE c.direccion = :direccion")
    , @NamedQuery(name = "Cliente.findByBroker", query = "SELECT c FROM Cliente c WHERE c.broker = :broker")
    , @NamedQuery(name = "Cliente.findByUsuario", query = "SELECT c FROM Cliente c WHERE c.usuario = :usuario")
    , @NamedQuery(name = "Cliente.findByClave", query = "SELECT c FROM Cliente c WHERE c.clave = :clave")})
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCliente")
    private Integer idCliente;
    @Basic(optional = false)
    @Column(name = "RazonSocial")
    private String razonSocial;
    @Column(name = "RUC")
    private String ruc;
    @Column(name = "idDistrito")
    private Integer idDistrito;
    @Basic(optional = false)
    @Column(name = "Direccion")
    private String direccion;
    @Basic(optional = false)
    @Column(name = "Broker")
    private String broker;
    @Basic(optional = false)
    @Column(name = "Usuario")
    private String usuario;
    @Basic(optional = false)
    @Column(name = "Clave")
    private String clave;

    public Cliente() {
    }

    public Cliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Cliente(Integer idCliente, String razonSocial, String direccion, String broker, String usuario, String clave) {
        this.idCliente = idCliente;
        this.razonSocial = razonSocial;
        this.direccion = direccion;
        this.broker = broker;
        this.usuario = usuario;
        this.clave = clave;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public Integer getIdDistrito() {
        return idDistrito;
    }

    public void setIdDistrito(Integer idDistrito) {
        this.idDistrito = idDistrito;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getBroker() {
        return broker;
    }

    public void setBroker(String broker) {
        this.broker = broker;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCliente != null ? idCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.idCliente == null && other.idCliente != null) || (this.idCliente != null && !this.idCliente.equals(other.idCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "daa2.model.entities.Cliente[ idCliente=" + idCliente + " ]";
    }
    
}
