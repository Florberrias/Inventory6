package sg.edu.iss.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Supplier {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int supplierId;
	private int brandId;
	private String brandName;
	private String companyName;
	private int contactNumber;
	private String address;
	private String emailAddress;
	@OneToMany(mappedBy = "supplier")
	private Product product;
	
	public Supplier(int brandId, String brandName, String companyName, int contactNumber, String address,
			String emailAddress, Product product) {
		super();
		this.brandId = brandId;
		this.brandName = brandName;
		this.companyName = companyName;
		this.contactNumber = contactNumber;
		this.address = address;
		this.emailAddress = emailAddress;
		this.product = product;
	}
	
}
