package edu.ucad.dr.EcoleDoctorale.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.ucad.dr.EcoleDoctorale.dao.CandidatRepository;
import edu.ucad.dr.EcoleDoctorale.entities.Candidat;

@CrossOrigin("*")
@RestController
public class CandidatRestService {
    
    @Autowired
    private CandidatRepository candidatRepository;

    @GetMapping(value="/listCandidats")
    public List<Candidat> listCandidats(){
        return candidatRepository.findAll();
    }

    @GetMapping(value="/listCandidats/{id}")
    public Candidat getProduct(@PathVariable(name="id") Long id){
        return candidatRepository.findById(id).get();
    }

    @PutMapping(value="/listCandidats/{id}")
    public Candidat update(@PathVariable(name="id") Long id, @RequestBody  Candidat c){
        c.setId(id);
        return candidatRepository.save(c);
    }

    @PostMapping(value="/listCandidats")
    public Candidat save(@RequestBody  Candidat c){
        return candidatRepository.save(c);
    }
    
    @DeleteMapping(value="/listCandidats/{id}")
    public void delete(@PathVariable(name="id") Long id){
        candidatRepository.deleteById(id);
    }



}
