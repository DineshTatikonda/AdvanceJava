package com.project.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
@Data
@Entity
public class Jewellery {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private String style;
	private String type;
	private String weight;
	private String price;
	private String state;
	public Jewellery() {
		// TODO Auto-generated constructor stub
	}
	public Jewellery(int id, String style, String type, String weight, String price, String state) {
		super();
		this.id = id;
		this.style = style;
		this.type = type;
		this.weight = weight;
		this.price = price;
		this.state = state;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Jewellery [id=" + id + ", style=" + style + ", type=" + type + ", weight=" + weight + ", price=" + price
				+ ", state=" + state + "]";
	}	
	
}
