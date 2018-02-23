/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Traitement;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author HP CORE I5
 */
@Stateless
public class UtilisateurdbFacade extends AbstractFacade<Utilisateurdb> implements UtilisateurdbFacadeLocal {
    @PersistenceContext(unitName = "IndigoSarlPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UtilisateurdbFacade() {
        super(Utilisateurdb.class);
    }
    
}
