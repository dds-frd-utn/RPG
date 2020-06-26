/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utn.frd.rpg.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Pablo
 */
@Entity
@Table(name = "transacciones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Transacciones.findAll", query = "SELECT t FROM Transacciones t"),
    @NamedQuery(name = "Transacciones.findById", query = "SELECT t FROM Transacciones t WHERE t.id = :id"),
    @NamedQuery(name = "Transacciones.findByNroTransaccion", query = "SELECT t FROM Transacciones t WHERE t.nroTransaccion = :nroTransaccion"),
    @NamedQuery(name = "Transacciones.findByFecha", query = "SELECT t FROM Transacciones t WHERE t.fecha = :fecha"),
    @NamedQuery(name = "Transacciones.findByMonto", query = "SELECT t FROM Transacciones t WHERE t.monto = :monto"),
    @NamedQuery(name = "Transacciones.findByImpuesto", query = "SELECT t FROM Transacciones t WHERE t.impuesto = :impuesto"),
    @NamedQuery(name = "Transacciones.findByIdnroCuenta", query = "SELECT t FROM Transacciones t WHERE t.idnroCuenta = :idnroCuenta")})
public class Transacciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nroTransaccion")
    private int nroTransaccion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Monto")
    private int monto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Impuesto")
    private int impuesto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_nroCuenta")
    private int idnroCuenta;

    public Transacciones() {
    }

    public Transacciones(Integer id) {
        this.id = id;
    }

    public Transacciones(Integer id, int nroTransaccion, Date fecha, int monto, int impuesto, int idnroCuenta) {
        this.id = id;
        this.nroTransaccion = nroTransaccion;
        this.fecha = fecha;
        this.monto = monto;
        this.impuesto = impuesto;
        this.idnroCuenta = idnroCuenta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getNroTransaccion() {
        return nroTransaccion;
    }

    public void setNroTransaccion(int nroTransaccion) {
        this.nroTransaccion = nroTransaccion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public int getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(int impuesto) {
        this.impuesto = impuesto;
    }

    public int getIdnroCuenta() {
        return idnroCuenta;
    }

    public void setIdnroCuenta(int idnroCuenta) {
        this.idnroCuenta = idnroCuenta;
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
        if (!(object instanceof Transacciones)) {
            return false;
        }
        Transacciones other = (Transacciones) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "utn.frd.rpg.entities.Transacciones[ id=" + id + " ]";
    }
    
}
