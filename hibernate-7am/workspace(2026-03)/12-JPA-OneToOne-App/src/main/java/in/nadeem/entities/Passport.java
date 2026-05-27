package in.nadeem.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_passport")
public class Passport {

	@Id
	private Integer passportId;

	private LocalDate experienceDate;

	public Integer getPassportId() {
		return passportId;
	}

	public void setPassportId(Integer passportId) {
		this.passportId = passportId;
	}

	public LocalDate getExperienceDate() {
		return experienceDate;
	}

	public void setExperienceDate(LocalDate experienceDate) {
		this.experienceDate = experienceDate;
	}

}
