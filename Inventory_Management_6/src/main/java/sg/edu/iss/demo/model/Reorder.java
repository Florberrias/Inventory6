package sg.edu.iss.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Reorder {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	//product associated with this order
	@ManyToOne
	@JoinColumn(name="productId", nullable = false)
	private Product product;
	private String name;
	private int quantity;
	private OrderStatus orderStatus;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date lastReorderDate;
	private int reorderQty;
	
	//supplier associated with this order
	@ManyToOne
    @JoinColumn(name = "supplierId", nullable = false)
    private Supplier supplier;
	
	public Reorder(Product product, String name, int quantity, OrderStatus orderStatus, Date lastReorderDate,
			int reorderQty, Supplier supplier) {
		super();
		this.product = product;
		this.name = name;
		this.quantity = quantity;
		this.orderStatus = orderStatus;
		this.lastReorderDate = lastReorderDate;
		this.reorderQty = reorderQty;
		this.supplier = supplier;
	}

}
