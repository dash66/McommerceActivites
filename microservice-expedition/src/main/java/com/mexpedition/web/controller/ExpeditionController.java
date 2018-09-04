package com.mexpedition.web.controller;

import com.mexpedition.dao.ExpeditionDao;
import com.mexpedition.model.Expedition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
public class ExpeditionController {

    @Autowired
    ExpeditionDao expeditionDao;

    @PostMapping("/expeditions")
    public ResponseEntity<Void> ajouterUneExpedition(@RequestBody Expedition expedition) {

        Expedition nouvelleExpedition = expeditionDao.save(expedition);

        TODO: /* return */
        return null;
    }

    //Récuperer un produit par son id
    @GetMapping(value = "/expeditions/{id}")
    public Optional<Expedition> recupererUneExpedition(@PathVariable int id) {

        Optional<Expedition> expedition = expeditionDao.findById(id);

        //  if(!expedition.isPresent())  throw new ProductNotFoundException("Le produit correspondant à l'id " + id + " n'existe pas");

        return expedition;
    }

    @PutMapping("/expeditions/update")
    public void updateExpedition(@RequestBody Expedition expedition) {

             expeditionDao.save(expedition);
    }

}
