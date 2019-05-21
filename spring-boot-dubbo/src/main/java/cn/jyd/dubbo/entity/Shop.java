package cn.jyd.dubbo.entity;

import java.io.Serializable;

/**
 * @author jyd
 *
 */
public class Shop implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	
	
	
	public Shop() {
		super();
	}
	public Shop(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
