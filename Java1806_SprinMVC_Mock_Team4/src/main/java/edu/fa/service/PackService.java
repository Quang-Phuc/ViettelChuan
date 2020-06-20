package edu.fa.service;

import java.util.List;

import edu.fa.model.Packs;

public interface PackService {
	List<Packs> findAllPack();

	Packs save(Packs packs);

	Packs update(Packs packs);

	void deleteById(int Id);

	Packs findPackById(int Id);

}
