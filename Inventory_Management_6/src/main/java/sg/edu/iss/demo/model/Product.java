package sg.edu.iss.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String description;
	private String type;
	private String category;
	private String subCategory;
	private float originalPrice;
	private float retailPrice;
	private float wholesalePrice;
	private float partnerPrice;
	private int reorderQty;
	private int MOQ;
	@OneToOne(mappedBy = "product", cascade = CascadeType.REMOVE)
	private Stock stock;
	@ManyToOne
	@JoinColumn(name = "supplierId")
	private Supplier supplier;
	@OneToMany(mappedBy = "product")
	private List<Consumption> consumptions;
	public Product() {
		super();
	}
	public Product(String name, String description, String type, String category, String subCategory,
			float originalPrice, float retailPrice, float wholesalePrice, float partnerPrice, int reorderQty, int mOQ,
			Supplier supplier) {
		super();
		this.name = name;
		this.description = description;
		this.type = type;
		this.category = category;
		this.subCategory = subCategory;
		this.originalPrice = originalPrice;
		this.retailPrice = retailPrice;
		this.wholesalePrice = wholesalePrice;
		this.partnerPrice = partnerPrice;
		this.reorderQty = reorderQty;
		MOQ = mOQ;
		this.supplier = supplier;
		consumptions = new ArrayList<Consumption>();
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSubCategory() {
		return subCategory;
	}
	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}
	public float getOriginalPrice() {
		return originalPrice;
	}
	public void setOriginalPrice(float originalPrice) {
		this.originalPrice = originalPrice;
	}
	public float getWholesalePrice() {
		return wholesalePrice;
	}
	public void setWholesalePrice(float wholesalePrice) {
		this.wholesalePrice = wholesalePrice;
	}
	public float getRetailPrice() {
		return retailPrice;
	}
	public void setRetailPrice(float retailPrice) {
		this.retailPrice = retailPrice;
	}
	public float getPartnerPrice() {
		return partnerPrice;
	}
	public void setPartnerPrice(float partnerPrice) {
		this.partnerPrice = partnerPrice;
	}
	public int getReorderQty() {
		return reorderQty;
	}
	public void setReorderQty(int reorderQty) {
		this.reorderQty = reorderQty;
	}
	public int getMOQ() {
		return MOQ;
	}
	public void setMOQ(int mOQ) {
		MOQ = mOQ;
	}
	public Stock getStock() {
		return stock;
	}
	public void setStock(Stock stock) {
		this.stock = stock;
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	public List<Consumption> getConsumptions() {
		return consumptions;
	}
	public void setConsumptions(List<Consumption> consumptions) {
		this.consumptions = consumptions;
	}
	public void addConsumption(Consumption consumption) {
		consumptions.add(consumption);
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", type=" + type
				+ ", category=" + category + ", subCategory=" + subCategory + ", originalPrice=" + originalPrice
				+ ", wholesalePrice=" + wholesalePrice + ", retailPrice=" + retailPrice + ", partnerPrice="
				+ partnerPrice + ", MOQ=" + MOQ + ", supplier=" + supplier + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + MOQ;
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Float.floatToIntBits(originalPrice);
		result = prime * result + Float.floatToIntBits(partnerPrice);
		result = prime * result + reorderQty;
		result = prime * result + Float.floatToIntBits(retailPrice);
		result = prime * result + ((stock == null) ? 0 : stock.hashCode());
		result = prime * result + ((subCategory == null) ? 0 : subCategory.hashCode());
		result = prime * result + ((supplier == null) ? 0 : supplier.hashCode());
		result = prime * result + ((consumptions == null) ? 0 : consumptions.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + Float.floatToIntBits(wholesalePrice);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (MOQ != other.MOQ)
			return false;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Float.floatToIntBits(originalPrice) != Float.floatToIntBits(other.originalPrice))
			return false;
		if (Float.floatToIntBits(partnerPrice) != Float.floatToIntBits(other.partnerPrice))
			return false;
		if (reorderQty != other.reorderQty)
			return false;
		if (Float.floatToIntBits(retailPrice) != Float.floatToIntBits(other.retailPrice))
			return false;
		if (stock == null) {
			if (other.stock != null)
				return false;
		} else if (!stock.equals(other.stock))
			return false;
		if (subCategory == null) {
			if (other.subCategory != null)
				return false;
		} else if (!subCategory.equals(other.subCategory))
			return false;
		if (supplier == null) {
			if (other.supplier != null)
				return false;
		} else if (!supplier.equals(other.supplier))
			return false;
		if (consumptions == null) {
			if (other.consumptions != null)
				return false;
		} else if (!consumptions.equals(other.consumptions))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (Float.floatToIntBits(wholesalePrice) != Float.floatToIntBits(other.wholesalePrice))
			return false;
		return true;
	}

}