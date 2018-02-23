/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Traitement;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author HP CORE I5
 */
@Entity
@Table(name = "UTILISATEURDB")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Utilisateurdb.findAll", query = "SELECT u FROM Utilisateurdb u"),
    @NamedQuery(name = "Utilisateurdb.findByNomutilisateurdb", query = "SELECT u FROM Utilisateurdb u WHERE u.utilisateurdbPK.nomutilisateurdb = :nomutilisateurdb"),
    @NamedQuery(name = "Utilisateurdb.findByMdp", query = "SELECT u FROM Utilisateurdb u WHERE u.utilisateurdbPK.mdp = :mdp"),
    @NamedQuery(name = "Utilisateurdb.findByAdresse", query = "SELECT u FROM Utilisateurdb u WHERE u.adresse = :adresse")})
public class Utilisateurdb implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UtilisateurdbPK utilisateurdbPK;
    @Size(max = 30)
    @Column(name = "ADRESSE")
    private String adresse;

    public Utilisateurdb() {
    }

    public Utilisateurdb(UtilisateurdbPK utilisateurdbPK) {
        this.utilisateurdbPK = utilisateurdbPK;
    }

    public Utilisateurdb(String nomutilisateurdb, String mdp) {
        this.utilisateurdbPK = new UtilisateurdbPK(nomutilisateurdb, mdp);
    }

    public UtilisateurdbPK getUtilisateurdbPK() {
        return utilisateurdbPK;
    }

    public void setUtilisateurdbPK(UtilisateurdbPK utilisateurdbPK) {
        this.utilisateurdbPK = utilisateurdbPK;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (utilisateurdbPK != null ? utilisateurdbPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Utilisateurdb)) {
            return false;
        }
        Utilisateurdb other = (Utilisateurdb) object;
        if ((this.utilisateurdbPK == null && other.utilisateurdbPK != null) || (this.utilisateurdbPK != null && !this.utilisateurdbPK.equals(other.utilisateurdbPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Traitement.Utilisateurdb[ utilisateurdbPK=" + utilisateurdbPK + " ]";
    }
    
}
