/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Traitement;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HP CORE I5
 */
@Local
public interface UtilisateurdbFacadeLocal {

    void create(Utilisateurdb utilisateurdb);

    void edit(Utilisateurdb utilisateurdb);

    void remove(Utilisateurdb utilisateurdb);

    Utilisateurdb find(Object id);

    List<Utilisateurdb> findAll();

    List<Utilisateurdb> findRange(int[] range);

    int count();
    
}
