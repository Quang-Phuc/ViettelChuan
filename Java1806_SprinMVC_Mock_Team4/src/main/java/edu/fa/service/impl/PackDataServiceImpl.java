package edu.fa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.fa.model.PackDatas;
import edu.fa.repository.PackDataRepository;
import edu.fa.service.PackDataService;

@Service
public class PackDataServiceImpl implements PackDataService {
	@Autowired
	private PackDataRepository packDataRepository;

	@Override
	public List<PackDatas> findAllPackDatas() {
		return packDataRepository.findAll();
	}

	@Override
	public PackDatas save(PackDatas packDatas) {
		return packDataRepository.save(packDatas);
	}

	@Override
	public PackDatas update(PackDatas packDatas) {
		return packDataRepository.save(packDatas);
	}

	@Override
	public void deleteById(int Id) {
		packDataRepository.delete(Id);
	}

	@Override
	public PackDatas findPackDataById(int Id) {
		return packDataRepository.findAllById(Id);
	}

}
