package edu.ucad.dr.EcoleDoctorale.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import edu.ucad.dr.EcoleDoctorale.dto.Sex;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString
public class Candidat implements Serializable {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)

    //IDENTIFICATION DU CANDIDAT
    private Long id;
    private String nom;
    private String prenom;
    private String addresse;
    private String telephone;
    private String email;
    @Enumerated(EnumType.STRING)
    private Sex sex;
    private String nationalite;


    //CURSUS UNIVERSITAIRE
    private String diplomeAccess;
    private String specialite;
    private String universite;
    private String paysUniversity;    
    private Date dateObtention;
    private String mention; 

    //DOCTORAT AUQUEL LE CANDIDAT DEMANDE SON ADMISSION
    private String intituleDiplome;
    private String etablissement;
    private String ecoleDoctorale;
    private String laboratoireAccueil;
    private String addresseLaboratoire;
    private String themeRecherche;

    public Candidat(Long id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }    
}


