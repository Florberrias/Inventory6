package sg.edu.iss.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@ManyToOne
	@JoinColumn(name="productId")
	private Product product;
	private String name;
	private int quantity;
	private OrderStatus orderStatus;
	private Date lastReorderDate;
	private int reorderQty;
	@ManyToOne
    @JoinColumn(name = "supplierId")
    private Supplier supplier;
	
	public Order(Product product, String name, int quantity, OrderStatus orderStatus, Date lastReorderDate,
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
