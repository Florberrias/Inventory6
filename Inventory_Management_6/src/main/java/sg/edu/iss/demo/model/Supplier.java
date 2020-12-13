package sg.edu.iss.demo.model;

import java.util.List;

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
	private int id;
	private int brandId;
	private String brandName;
	private String companyName;
	private int contactNumber;
	private String address;
	private String emailAddress;
	
	//list of products by this supplier
	@OneToMany(mappedBy = "supplier")
	private List<Product> products;
	
	//list of orders by this supplier
	@OneToMany(mappedBy = "supplier")
	private List<Reorder> orders;
	
	public Supplier(int brandId, String brandName, String companyName, int contactNumber, String address,
			String emailAddress, List<Product> products, List<Reorder> orders) {
		super();
		this.brandId = brandId;
		this.brandName = brandName;
		this.companyName = companyName;
		this.contactNumber = contactNumber;
		this.address = address;
		this.emailAddress = emailAddress;
		this.products = products;
		this.orders = orders;
	}

	
}
