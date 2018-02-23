/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Traitement;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author HP CORE I5
 */
@Embeddable
public class UtilisateurdbPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "NOMUTILISATEURDB")
    private String nomutilisateurdb;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "MDP")
    private String mdp;

    public UtilisateurdbPK() {
    }

    public UtilisateurdbPK(String nomutilisateurdb, String mdp) {
        this.nomutilisateurdb = nomutilisateurdb;
        this.mdp = mdp;
    }

    public String getNomutilisateurdb() {
        return nomutilisateurdb;
    }

    public void setNomutilisateurdb(String nomutilisateurdb) {
        this.nomutilisateurdb = nomutilisateurdb;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nomutilisateurdb != null ? nomutilisateurdb.hashCode() : 0);
        hash += (mdp != null ? mdp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UtilisateurdbPK)) {
            return false;
        }
        UtilisateurdbPK other = (UtilisateurdbPK) object;
        if ((this.nomutilisateurdb == null && other.nomutilisateurdb != null) || (this.nomutilisateurdb != null && !this.nomutilisateurdb.equals(other.nomutilisateurdb))) {
            return false;
        }
        if ((this.mdp == null && other.mdp != null) || (this.mdp != null && !this.mdp.equals(other.mdp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Traitement.UtilisateurdbPK[ nomutilisateurdb=" + nomutilisateurdb + ", mdp=" + mdp + " ]";
    }
    
}
