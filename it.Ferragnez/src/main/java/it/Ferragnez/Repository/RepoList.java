package it.Ferragnez.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.Ferragnez.Model.FerragnezModel;

public interface reposList extends JpaRepository<FerragnezModel, Integer> {

}
