package POJO;// default package
// Generated 2016-10-7 12:13:28 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * EssayAttachment generated by hbm2java
 */
@Entity
@Table(name = "essay_attachment", catalog = "phenomenology")
public class EssayAttachment implements java.io.Serializable {

	private Integer id;
	private Essay essay;
	private String title;
	private String location;

	public EssayAttachment() {
	}

	public EssayAttachment(Essay essay, String title, String location) {
		this.essay = essay;
		this.title = title;
		this.location = location;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "Id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "essayId", nullable = false)
	public Essay getEssay() {
		return this.essay;
	}

	public void setEssay(Essay essay) {
		this.essay = essay;
	}

	@Column(name = "title", nullable = false)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "location", nullable = false)
	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
