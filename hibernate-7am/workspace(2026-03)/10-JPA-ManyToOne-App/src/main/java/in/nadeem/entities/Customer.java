package in.nadeem.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_customer")
public class Customer {

	@Id
	@Column(name = "customer_id")
	private Integer customeId;

	@Column(name = "customer_name")
	private String customerName;

	public Integer getCustomeId() {
		return customeId;
	}

	public void setCustomeId(Integer customeId) {
		this.customeId = customeId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	@Override
	public String toString() {
		return "Customer [customeId=" + customeId + ", customerName=" + customerName + "]";
	}

}
