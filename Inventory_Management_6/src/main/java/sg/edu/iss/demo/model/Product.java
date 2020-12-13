package sg.edu.iss.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String description;
	private String type;
	private String category;
	private float originalPrice;
	private float wholesalePrice;
	private float retailPrice;
	private float partnerPrice;
	private int MOQ;
	private String subCategory;
	
	//supplier associated with this product
	@ManyToOne
    @JoinColumn(name = "supplierId")
    private Supplier supplier;
	
	//order associated with this product
	@OneToMany(mappedBy = "product")
	private List<Reorder> orders;
	
	public Product(String name, String description, String type, String category, float originalPrice,
			float wholesalePrice, float retailPrice, float partnerPrice, int mOQ, String subCategory, Supplier supplier,
			List<Reorder> orders) {
		super();
		this.name = name;
		this.description = description;
		this.type = type;
		this.category = category;
		this.originalPrice = originalPrice;
		this.wholesalePrice = wholesalePrice;
		this.retailPrice = retailPrice;
		this.partnerPrice = partnerPrice;
		MOQ = mOQ;
		this.subCategory = subCategory;
		this.supplier = supplier;
		this.orders = orders;
	}
	
}
