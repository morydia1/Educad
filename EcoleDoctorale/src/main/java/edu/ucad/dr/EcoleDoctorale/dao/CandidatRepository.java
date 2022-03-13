package edu.ucad.dr.EcoleDoctorale.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import edu.ucad.dr.EcoleDoctorale.entities.Candidat;

@CrossOrigin("*")
@RepositoryRestResource
public interface CandidatRepository extends JpaRepository<Candidat,Long> {
    
    @RestResource(path = "/byNom")
    public List<Candidat> findByNomContains(@Param("nom") String nom); 

    @RestResource(path = "/byNomPage")
    public Page <Candidat> findByNomContains(@Param("nom") String nom, Pageable p);
}
