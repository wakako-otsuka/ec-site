package com.example.demo.form;

/**
 * 商品一覧表示の際のリクエストパラメーターを受け取るフォーム.
 * 
 * @author otsuka
 *
 */
public class ShowItemListForm {
	
	
	/**並び変えの順番*/
	private String order;
	
	/**リンクページ*/
	private Integer page;
	
    /**検索名*/
    private String name;

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ShowItemListForm [order=" + order + ", page=" + page + ", name=" + name + ", getOrder()=" + getOrder()
				+ ", getPage()=" + getPage() + ", getName()=" + getName() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
    
    
   

}
