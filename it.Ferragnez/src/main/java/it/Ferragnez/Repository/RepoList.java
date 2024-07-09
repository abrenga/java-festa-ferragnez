package it.Ferragnez.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.Ferragnez.Model.FerragnezModel;
@Repository
public interface RepoList extends JpaRepository<FerragnezModel, Integer> {

}
