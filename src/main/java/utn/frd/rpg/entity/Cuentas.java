/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utn.frd.rpg.entity;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Pablo
 */
@Entity
@Table(name = "cuentas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cuentas.findAll", query = "SELECT c FROM Cuentas c"),
    @NamedQuery(name = "Cuentas.findById", query = "SELECT c FROM Cuentas c WHERE c.id = :id"),
    @NamedQuery(name = "Cuentas.findByTransacciones", query = "SELECT c FROM Cuentas c WHERE c.transacciones = :transacciones"),
    @NamedQuery(name = "Cuentas.findBySaldo", query = "SELECT c FROM Cuentas c WHERE c.saldo = :saldo"),
    @NamedQuery(name = "Cuentas.findByNroCuenta", query = "SELECT c FROM Cuentas c WHERE c.nroCuenta = :nroCuenta"),
    @NamedQuery(name = "Cuentas.findByIdCliente", query = "SELECT c FROM Cuentas c WHERE c.idCliente = :idCliente")})
public class Cuentas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "transacciones")
    private String transacciones;
    @Basic(optional = false)
    @NotNull
    @Column(name = "saldo")
    private int saldo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nroCuenta")
    private int nroCuenta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_cliente")
    private int idCliente;

    public Cuentas() {
    }

    public Cuentas(Integer id) {
        this.id = id;
    }

    public Cuentas(Integer id, String transacciones, int saldo, int nroCuenta, int idCliente) {
        this.id = id;
        this.transacciones = transacciones;
        this.saldo = saldo;
        this.nroCuenta = nroCuenta;
        this.idCliente = idCliente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(String transacciones) {
        this.transacciones = transacciones;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cuentas)) {
            return false;
        }
        Cuentas other = (Cuentas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "utn.frd.rpg.Cuentas[ id=" + id + " ]";
    }
    
}
