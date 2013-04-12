package net.gupt.ebuy.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.gupt.ebuy.pojo.CartItem;

public class CartServiceImpl implements CartService {
	//用于保存购物车内商品的集合
	private List<CartItem> list1 = new ArrayList<CartItem>();
	//用于保存从购物车中删除的商品
	private List<CartItem> list2 = new ArrayList<CartItem>();

	public boolean add(CartItem ci) {
		for(int i=0; i<list1.size(); i++) {
			//如果商品已存在于购物车中，则不重复添加
			if(ci.getProduct().getId()==list1.get(i).getProduct().getId()) {
				return false;
			}
		}
		list1.add(ci);
		return true;
	}
	
	public Map<String, List<CartItem>> list() {
		Map<String, List<CartItem>> map = new HashMap<String, List<CartItem>>();
		map.put("list1", list1);
		map.put("list2", list2);
		return map;
	}
	
	public boolean empty() {
		boolean flag = list1.removeAll(list1);
		return flag;
	}
	
	public void delete(int id) {
		for(int i=0; i<list1.size(); i++) {
			if(id==list1.get(i).getProduct().getId()) {
				//将list1中的商品移除到list2中以备恢复
				list2.add(list1.remove(i));
			}
		}
	}
	
	public void recover(int id) {
		for(int i=0; i<list2.size(); i++) {
			if(id==list2.get(i).getProduct().getId()) {
				//从list2中移除商品到list1中
				list1.add(list2.remove(i));
			}
		}
	}
	
	public double count() {
		double sum = 0.0;
		//统计所有商品价格
		for(int i=0; i<list1.size(); i++) {
			sum = sum + list1.get(i).getProduct().getPrice()*list1.get(i).getQty();
		}
		return sum;
	}

	public List<CartItem> getList1() {
		return list1;
	}

	public void setList1(List<CartItem> list1) {
		this.list1 = list1;
	}

	public List<CartItem> getList2() {
		return list2;
	}

	public void setList2(List<CartItem> list2) {
		this.list2 = list2;
	}

	public void change(int n, int id) {
		for(int i=0; i<list1.size(); i++) {
			//修改ID对应的商品数量
			if(id==list1.get(i).getProduct().getId()) {
				list1.get(i).setQty(n);
			}
		}
	}

}
