package sg.edu.iss.demo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import sg.edu.iss.demo.model.Car;
import sg.edu.iss.demo.model.OrderStatus;
import sg.edu.iss.demo.model.Product;
import sg.edu.iss.demo.model.Reorder;
import sg.edu.iss.demo.model.RoleType;
import sg.edu.iss.demo.model.Stock;
import sg.edu.iss.demo.model.StockStatus;
import sg.edu.iss.demo.model.Supplier;
import sg.edu.iss.demo.model.Transaction;
import sg.edu.iss.demo.model.User;
import sg.edu.iss.demo.model.Consumption;
import sg.edu.iss.demo.repo.CarRepository;
import sg.edu.iss.demo.repo.ConsumptionRepository;
import sg.edu.iss.demo.repo.ProductRepository;
import sg.edu.iss.demo.repo.ReorderRepository;
import sg.edu.iss.demo.repo.StockRepository;
import sg.edu.iss.demo.repo.SupplierRepository;
import sg.edu.iss.demo.repo.TransactionRepository;
import sg.edu.iss.demo.repo.UserRepository;

@SpringBootApplication
public class InventoryManagement6Application {

	@Autowired
	private UserRepository urepo;
	
	@Autowired
	private ProductRepository prepo;
	
	@Autowired
	private SupplierRepository srepo;
	
	@Autowired
	private StockRepository strepo;
	
	@Autowired
	private ReorderRepository rrepo;
	
	@Autowired
	private CarRepository crepo;
	
	@Autowired
	private TransactionRepository trepo;
	
	@Autowired
	private ConsumptionRepository consrepo;

	public static void main(String[] args) {
		SpringApplication.run(InventoryManagement6Application.class, args);
		
	}
	
	@Bean
	CommandLineRunner runner() {
		return args -> {
			urepo.save(new User("admin1", "password", "admin1@gmail.com", 
					RoleType.ADMIN));
			urepo.save(new User("admin2", "password", "admin2@gmail.com", 
					RoleType.ADMIN));
			urepo.save(new User("admin3", "password", "admin3@gmail.com", 
					RoleType.ADMIN));
			urepo.save(new User("admin4", "password", "admin4@gmail.com", 
					RoleType.ADMIN));
			urepo.save(new User("admin5", "password", "admin5@gmail.com", 
					RoleType.ADMIN));
			urepo.save(new User("mechanic1", "password", "mechanic1@gmail.com", 
					RoleType.MECHANIC));
			urepo.save(new User("mechanic2", "password", "mechanic2@gmail.com", 
					RoleType.MECHANIC));
			urepo.save(new User("mechanic3", "password", "mechanic3@gmail.com", 
					RoleType.MECHANIC));
			urepo.save(new User("mechanic4", "password", "mechanic4@gmail.com", 
					RoleType.MECHANIC));
			urepo.save(new User("mechanic5", "password", "mechanic5@gmail.com", 
					RoleType.MECHANIC));
			
			Supplier s1 = new Supplier("Toyota Distributors", 
					"7 Toa Payoh Industrial Park, Singapore 319059", "Ali", 98765432, 
					"alimani@gmail.com", 101, "Toyota");
			Product p1 = new Product("Royal Maxpider Car Mat", "comfortable car mat", 
					"accessories", "mat", "driver mat", 100, 150, 130, 120, 5, 10, s1);
			s1.addProduct(p1);
			srepo.save(s1);
			prepo.save(p1);
			
			Supplier s2 = new Supplier("Honda Distributors", 
					"69 Tampines Industrial Park, Singapore 325674", "Bobby",88635732, 
					"bobbyfir@gmail.com", 102, "Honda");
			Product p2 = new Product("Turanza T005 Tyre", "a very good tyre", 
					"expendable", "tyre", "tyre", 150, 200, 180, 170, 10, 40, s2);
			s2.addProduct(p2);
			srepo.save(s2);
			prepo.save(p2);
			
			Supplier s3 = new Supplier("Mazda Distributors", 
					"4 Simei Industrial Park, Singapore 346038", "Charlie", 93245024, 
					"chaplin@gmail.com", 103, "Mazda");
			Product p3 = new Product("Ultra shade", "provide sun shade", 
					"accessories", "visor", "door visor", 150, 200, 180, 170, 15, 40, s3);
			s3.addProduct(p3);
			srepo.save(s3);
			prepo.save(p3);
			
			Supplier s4 = new Supplier("Hyundai Distributors", 
					"89 Toa Payoh Industrial Park, Singapore 234086", "Park", 93247685, 
					"jisung@gmail.com", 104, "Hyundai");
			Product p4 = new Product("The Powerful Light", "lighting for the car", 
					"electrical", "light", "headlight", 210, 260, 240, 230, 20, 20, s4);
			s4.addProduct(p4);
			srepo.save(s4);
			prepo.save(p4);
			
			Supplier s5 = new Supplier("Lexus Distributors", 
					"12 Kallang Industrial Park, Singapore 644009", "Biscuit", 91230459, 
					"cracker@gmail.com", 105, "Lexus");
			Product p5 = new Product("Steel Rim", "tyre rim", 
					"expendable", "rim", "rim", 200, 250, 230, 220, 25, 40, s5);
			s5.addProduct(p5);
			srepo.save(s5);
			prepo.save(p5);
			
			Supplier s6 = new Supplier("Kia Distributors", 
					"4 Geylang Industrial Park, Singapore 213084", "Pai", 97520943, 
					"paikia@gmail.com", 106, "Kia");
			Product p6 = new Product("Auto gear box", "ear box for auto car", 
					"mechanical", "gearbox", "auto gearbox", 500, 550, 530, 520, 30, 
					50, s6);
			s6.addProduct(p6);
			srepo.save(s6);
			prepo.save(p6);
			
			Supplier s7 = new Supplier("BMW Distributors", 
					"Bukit Timah Industrial Park, Singapore 570934", "Richman", 93408633, 
					"iamrich@gmail.com", 107, "BMW");
			Product p7 = new Product("Model RTX clutch", "2020 clutch model", 
					"mechanical", "clutch", "clutch", 340, 390, 370, 360, 35, 100, s7);
			s7.addProduct(p7);
			srepo.save(s7);
			prepo.save(p7);
			
			Supplier s8 = new Supplier("Mercedes Distributors", 
					"45 Queenstown Industrial Park, Singapore 363095", "Hamilton", 
					91035873, "lewis@gmail.com", 108, "Mercedes");
			Product p8 = new Product("Gold Dashboard", "dashboard for the rich", 
					"accessories", "board", "dashboard", 140, 190, 170, 160, 40, 20, s8);
			s8.addProduct(p8);
			srepo.save(s8);
			prepo.save(p8);
			
			Supplier s9 = new Supplier("Audi Distributors", 
					"76 Jurong Industrial Park, Singapore 630345", "Ken", 94258053, 
					"watanabe@gmail.com", 109, "Audi");
			Product p9 = new Product("The door", "strong door", 
					"accessories", "door", "driver door", 240, 290, 270, 260, 45, 10, s9);
			s9.addProduct(p9);
			srepo.save(s9);
			prepo.save(p9);
			
			Supplier s10 = new Supplier("Nissan Distributors", 
					"67 Woodlands Industrial Park, Singapore 585340", "Sunny", 94672344, 
					"sunny@gmail.com", 110, "Nissan");
			Product p10 = new Product("Steering Wheel", "wheel for steering", 
					"accessories", "steering wheel", "powered steering wheel", 230, 280, 
					260, 250, 50, 20, s10);
			s10.addProduct(p10);
			srepo.save(s10);
			prepo.save(p10);
			
			strepo.save(new Stock(p1, 30, StockStatus.IN_STOCK));
			strepo.save(new Stock(p2, 30, StockStatus.REORDER_PLACED));
			strepo.save(new Stock(p3, 30, StockStatus.REORDER_PLACED));
			strepo.save(new Stock(p4, 30, StockStatus.IN_STOCK));
			strepo.save(new Stock(p5, 30, StockStatus.BELOW_REORDER_LEVEL));
			strepo.save(new Stock(p6, 30, StockStatus.BELOW_REORDER_LEVEL));
			strepo.save(new Stock(p7, 30, StockStatus.BELOW_REORDER_LEVEL));
			strepo.save(new Stock(p8, 30, StockStatus.IN_STOCK));
			strepo.save(new Stock(p9, 30, StockStatus.IN_STOCK));
			strepo.save(new Stock(p10, 30, StockStatus.IN_STOCK));
			
			DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			
			Reorder r1 = new Reorder(p1, OrderStatus.ADDED_TO_INVENTORY, 5);
			r1.setDate(LocalDate.parse("06/05/2020", df));
			r1.setDamagedQty(2);
			rrepo.save(r1);
			
			Reorder r2 = new Reorder(p4, OrderStatus.ADDED_TO_INVENTORY, 20);
			r2.setDate(LocalDate.parse("06/05/2020", df));
			r2.setDamagedQty(4);
			rrepo.save(r2);
			
			Reorder r3 = new Reorder(p8, OrderStatus.ADDED_TO_INVENTORY, 40);
			r3.setDate(LocalDate.parse("06/05/2020", df));
			r3.setDamagedQty(1);
			rrepo.save(r3);
			
			Reorder r4 = new Reorder(p9, OrderStatus.ADDED_TO_INVENTORY, 45);
			r4.setDate(LocalDate.parse("06/05/2020", df));
			r4.setDamagedQty(3);
			rrepo.save(r4);
			
			Reorder r5 = new Reorder(p10, OrderStatus.ADDED_TO_INVENTORY, 50);
			r5.setDate(LocalDate.parse("06/05/2020", df));
			r5.setDamagedQty(5);
			rrepo.save(r5);
			
			Reorder r6 = new Reorder(p2, OrderStatus.RECEIVED, 10);
			r6.setDate(LocalDate.parse("06/12/2020", df));
			rrepo.save(r6);
			
			Reorder r7 = new Reorder(p3, OrderStatus.REORDERED, 15);
			r7.setDate(LocalDate.parse("06/12/2020", df));
			rrepo.save(r7);
			
			rrepo.save(new Reorder(p5, OrderStatus.PENDING_ORDER, 25));
			rrepo.save(new Reorder(p6, OrderStatus.PENDING_ORDER, 30));
			rrepo.save(new Reorder(p7, OrderStatus.PENDING_ORDER, 35));

			
		};
	}

}
