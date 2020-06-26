/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utn.frd.rpg.sessions;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import utn.frd.rpg.entities.Transacciones;

/**
 *
 * @author Pablo
 */
@Stateless
public class TransaccionesFacade extends AbstractFacade<Transacciones> {

    @PersistenceContext(unitName = "jdbc/MySQLDataSouce")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TransaccionesFacade() {
        super(Transacciones.class);
    }
    
}
