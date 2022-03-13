package edu.ucad.dr.EcoleDoctorale.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="P1", types = Candidat.class)
public interface CandidatProj {
    public String getNom();
    public String getPrenom();
}
