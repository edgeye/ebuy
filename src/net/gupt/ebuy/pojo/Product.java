package net.gupt.ebuy.pojo;

import java.util.Date;
/**
 * ��Ʒʵ����
 * @author glf
 *
 */
public class Product {
	
	private int id;//��ƷID
	private String type;//��Ʒ����
	private String name;//��Ʒ����
	private Double price;//��Ʒ�۸�
	private Integer quantity;//��Ʒ����
	private String image;//��ƷͼƬ
	private String description;//��Ʒ����
	private Date time;//��Ʒ����ʱ��
	
	public Product() {
		
	}
	
	

	public Product(int id, String type, String name, Double price,
			Integer quantity, String image, String description, Date time) {
		super();
		this.id = id;
		this.type = type;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.image = image;
		this.description = description;
		this.time = time;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}
