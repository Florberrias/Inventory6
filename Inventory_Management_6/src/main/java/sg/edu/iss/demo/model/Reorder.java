package sg.edu.iss.demo.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Reorder {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@JoinColumn(name = "productId")
	private Product product;
	private OrderStatus status;
	private int orderQty;
	@DateTimeFormat (pattern = "dd-MM-yyyy")
	private LocalDate date;
	private int damagedQty;
	public Reorder() {
		super();
	}
	public Reorder(Product product, OrderStatus status, int orderQty) {
		super();
		this.product = product;
		this.status = status;
		this.orderQty = orderQty;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	public int getOrderQty() {
		return orderQty;
	}
	public void setOrderQty(int orderQty) {
		this.orderQty = orderQty;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public int getDamagedQty() {
		return damagedQty;
	}
	public void setDamagedQty(int damagedQty) {
		this.damagedQty = damagedQty;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Reorder [id=" + id + ", product=" + product + ", status=" + status + ", orderQty=" + orderQty
				+ ", date=" + date + ", damagedQty=" + damagedQty + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + damagedQty;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + id;
		result = prime * result + orderQty;
		result = prime * result + ((product == null) ? 0 : product.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		Reorder other = (Reorder) obj;
		if (damagedQty != other.damagedQty)
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (id != other.id)
			return false;
		if (orderQty != other.orderQty)
			return false;
		if (product == null) {
			if (other.product != null)
				return false;
		} else if (!product.equals(other.product))
			return false;
		if (status != other.status)
			return false;
		return true;
	}
}
