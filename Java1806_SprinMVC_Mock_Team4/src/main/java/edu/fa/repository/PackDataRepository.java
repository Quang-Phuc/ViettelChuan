package edu.fa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.fa.model.PackDatas;

@Repository
public interface PackDataRepository extends JpaRepository<PackDatas, Integer> {
	PackDatas findAllById(int Id);

}
