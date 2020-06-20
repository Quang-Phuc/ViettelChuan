package edu.fa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.fa.model.Packs;
import edu.fa.repository.PackRepository;
import edu.fa.service.PackService;

@Service
public class PackServiceImpl implements PackService {
	@Autowired
	private PackRepository packRepository;

	@Override
	public List<Packs> findAllPack() {
		return packRepository.findAll();
	}

	@Override
	public Packs save(Packs packs) {
		return packRepository.save(packs);
	}

	@Override
	public Packs update(Packs packs) {
		return packRepository.save(packs);
	}

	@Override
	public void deleteById(int Id) {
		packRepository.delete(Id);
	}

	@Override
	public Packs findPackById(int Id) {
		return packRepository.findAllById(Id);
	}

}
