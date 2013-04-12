package net.gupt.ebuy.pojo;
/**
 * 商品类型实体类
 * @author glf
 *
 */
public class MainType {
	
	private Integer id;//类型ID
	private String type;//类型名称
	
	public MainType() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
