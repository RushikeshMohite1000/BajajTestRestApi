package com.pojo;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class RestResponse {
	
private	boolean is_success;
private	String user_id;
private	String email;
private	String roll_no;
private	List<String> numbers;
private	List<String> alphabets;

	public RestResponse() {
		
	}

	public RestResponse(boolean is_success, String user_id, String email, String roll_no, List<String> numbers,
			List<String> alphabets) {
		super();
		this.is_success = is_success;
		this.user_id = user_id;
		this.email = email;
		this.roll_no = roll_no;
		this.numbers = numbers;
		this.alphabets = alphabets;
	}

	public boolean getIs_success() {
		return is_success;
	}

	public void setIs_success(boolean is_success) {
		this.is_success = is_success;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(String roll_no) {
		this.roll_no = roll_no;
	}

	public List<String> getNumbers() {
		return numbers;
	}

	public void setNumbers(List<String> numbers) {
		this.numbers = numbers;
	}

	public List<String> getAlphabets() {
		return alphabets;
	}

	public void setAlphabets(List<String> alphabets) {
		this.alphabets = alphabets;
	}
	
	

}
