package net.gupt.ebuy.pojo;

import java.util.Date;
/**
 * �������ʵ����
 * @author glf
 *
 */
public class Idea {
	
	private int id;//���ID
	private String name;//����������û�����
	private String header;//�û�ͷ��
	private String newMess;//�����������
	private String reMess;//����Ա����ظ�����
	private Date newTime;//�������ʱ��
	private String reTime;//����Ա����ظ�ʱ��
	
	public Idea() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getNewMess() {
		return newMess;
	}

	public void setNewMess(String newMess) {
		this.newMess = newMess;
	}

	public String getReMess() {
		return reMess;
	}

	public void setReMess(String reMess) {
		this.reMess = reMess;
	}

	public Date getNewTime() {
		return newTime;
	}

	public void setNewTime(Date newTime) {
		this.newTime = newTime;
	}

	public String getReTime() {
		return reTime;
	}

	public void setReTime(String reTime) {
		this.reTime = reTime;
	}


}
