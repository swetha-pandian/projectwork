package com.tns.studentservice;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student
{
	private Integer S_id;
	private String S_name;
      private String S_address;
	private Integer S_phone;
	
	public Student() 
	{
		super();
	}
	
	public Student(Integer s_id, String s_name, String s_address, Integer s_phone)
	{
		super();
		S_id = s_id;
		S_name = s_name;
        S_address= s_address;
        S_phone= s_phone;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getS_id() {
		return S_id;
	}
	public void setS_id(Integer s_id) {
		S_id = s_id;
	}
	public String getS_name() {
		return S_name;
	}
	public void setS_name(String s_name)
	{
		S_name = s_name;
	}
      public String getS_address() {
		return S_address;
	}
	public void setS_id(String s_address) {
		S_address = s_address;
	}
      public Integer getS_phone() {
		return S_phone;
	}
	public void setS_(Integer s_phone) {
		S_phone = s_phone;
	}


	@Override
	public String toString()
	{
		return "Student[Student id:"+S_id+" Student name:"+S_name+" Student address:"+S_address+" Student phone:"+S_phone+"]";
	}
}
