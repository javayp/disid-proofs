package proof.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "SBDATAAC_PET_TYPES")
public class PetType {

	@Id
	@Column(name = "PET_TYPE_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pet_type_seq")
	@SequenceGenerator(name = "pet_type_seq", sequenceName = "SBDATAAC_PET_TYPES_PET_TYPE_ID_SEQ")
	protected Long id;
	
	@Version
	@Column(name = "VERSION")
	private long version;

	@Column(name = "NAME")
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

    public long getVersion() {
		return version;
	}

	public void setVersion(long version) {
		this.version = version;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.getName();
	}
}
