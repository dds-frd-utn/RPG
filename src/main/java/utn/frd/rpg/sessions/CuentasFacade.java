/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utn.frd.rpg.sessions;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import utn.frd.rpg.entities.Cuentas;

/**
 *
 * @author Pablo
 */
@Stateless
public class CuentasFacade extends AbstractFacade<Cuentas> {

    @PersistenceContext(unitName = "jdbc/MySQLDataSouce")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CuentasFacade() {
        super(Cuentas.class);
    }
    
}
