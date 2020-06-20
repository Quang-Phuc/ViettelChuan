package edu.fa.model;

import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class PackDatas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(columnDefinition = "TEXT")
	private String name;
	@Column(columnDefinition = "TEXT")
	private String description;
	@Column(columnDefinition = "TEXT")
	private String detail;
	@Column(columnDefinition = "TEXT")
	private String contentSms;
	@Column(columnDefinition = "TEXT")
	private String phoneSms;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "packDataId")
	private Packs packs;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Packs getPacks() {
		return packs;
	}

	public void setPacks(Packs packs) {
		this.packs = packs;
	}

	public String getContentSms() {
		return contentSms;
	}

	public void setContentSms(String contentSms) {
		this.contentSms = contentSms;
	}

	public String getPhoneSms() {
		return phoneSms;
	}

	public void setPhoneSms(String phoneSms) {
		this.phoneSms = phoneSms;
	}

	public PackDatas() {
		super();
	}

	public PackDatas(int id, String name, String description, String detail, String contentSms, String phoneSms,
			Packs packs) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.detail = detail;
		this.contentSms = contentSms;
		this.phoneSms = phoneSms;
		this.packs = packs;
	}

}
