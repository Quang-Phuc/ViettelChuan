package edu.fa.service;

import java.util.List;

import edu.fa.model.PackDatas;

public interface PackDataService {
	List<PackDatas> findAllPackDatas();

	PackDatas save(PackDatas packDatas);

	PackDatas update(PackDatas packDatas);

	void deleteById(int Id);

	PackDatas findPackDataById(int Id);

}
