package fr.gtm.proxibanque.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.gtm.proxibanque.domain.Adresse;

/**
 * est l'interface permettant d'effectuer des requêtes en BDD sur la classe Adresse.
 * 
 * @author Mohammed, Kamir et Arnauld.
 * @version 3.0.
 */
public interface AdresseRepository extends JpaRepository<Adresse, Integer> {

}
