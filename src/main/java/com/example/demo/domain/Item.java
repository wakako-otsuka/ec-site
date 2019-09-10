package com.example.demo.domain;

import java.util.List;

/**
 * 商品情報を表すドメイン.
 * 
 * @author otsuka
 *
 */
public class Item {
	
	/**商品id*/
	private Integer id;
	
	/**商品名*/
	private String name;
	
	/**Ｍサイズの料金*/
	private Integer priceM;
	
	/**Ｌサイズの料金*/
	private Integer priceL;
	
	/**画像パス */
	private String imagePath;
	
	/**画像フラグ*/
	private boolean deleted;
	
	/**トッピングリスト*/
	private List<Topping>toppingList;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPriceM() {
		return priceM;
	}

	public void setPriceM(Integer priceM) {
		this.priceM = priceM;
	}

	public Integer getPriceL() {
		return priceL;
	}

	public void setPriceL(Integer priceL) {
		this.priceL = priceL;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public List<Topping> getToppingList() {
		return toppingList;
	}

	public void setToppingList(List<Topping> toppingList) {
		this.toppingList = toppingList;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", priceM=" + priceM + ", priceL=" + priceL + ", imagePath="
				+ imagePath + ", deleted=" + deleted + ", toppingList=" + toppingList + "]";
	}

	

}
