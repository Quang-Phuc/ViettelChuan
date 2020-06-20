package edu.fa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.fa.model.Packs;

public interface PackRepository extends JpaRepository<Packs, Integer> {
	Packs findAllById(int Id);
}
