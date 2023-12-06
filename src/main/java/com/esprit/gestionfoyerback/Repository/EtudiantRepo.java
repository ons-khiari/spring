package com.esprit.gestionfoyerback.Repository;

import com.esprit.gestionfoyerback.Entity.Etudiant;
import com.esprit.gestionfoyerback.Enum.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface EtudiantRepo extends JpaRepository<Etudiant,Long> {
    Optional<Etudiant> findByCin(Long cin);
    List<Etudiant> findByRole(Role role);
}
