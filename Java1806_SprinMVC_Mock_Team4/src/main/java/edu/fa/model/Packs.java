package edu.fa.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import javax.persistence.Id;

@Entity
public class Packs {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(columnDefinition = "TEXT")
	private String title;
	@Column(columnDefinition = "TEXT")
	private String detail;
	@Column(columnDefinition = "TEXT")
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "packDataId")
	private List<PackDatas> packDataList = new ArrayList<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public List<PackDatas> getPackDataList() {
		return packDataList;
	}

	public void setPackDataList(List<PackDatas> packDataList) {
		this.packDataList = packDataList;
	}

	public Packs() {
		super();
	}

	public Packs(int id, String title, String detail, List<PackDatas> packDataList) {
		super();
		this.id = id;
		this.title = title;
		this.detail = detail;
		this.packDataList = packDataList;
	}

}
