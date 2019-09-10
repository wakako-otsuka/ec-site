package com.example.demo.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * ユーザー登録情報を受け取るフォーム
 * 
 * @author otsuka
 *
 */
public class RegisterUserForm {
	
	/**名前*/
	@NotBlank(message="名前を入力して下さい")
	private String name;
	
	@Size(min=1,max=127,message="Eメールアドレスを入力して下さい")
	/**メールアドレス*/
	private String email;
	
	@NotBlank(message="メッセージを入力して下さい")
	/**パスワード*/
	private String password;
	
	@NotBlank(message="確認用パスワードを入力して下さい")
	/**確認用パスワード*/
	private String confirmPassword;
	
	@NotBlank(message="郵便番号を入力して下さい")
	/**郵便番号 */
	private String zipcode;
	
	@NotBlank(message="住所を入力して下さい")
	/**住所*/
	private String address;
	
	@Pattern(regexp="^[0-9]+$",message="数値で入力して下さい")
	@NotBlank(message="電話番号を入力して下さい")
	/**電話番号*/
	private String telephone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Override
	public String toString() {
		return "RegisterForm [name=" + name + ", email=" + email + ", password=" + password + ", confirmPassword="
				+ confirmPassword + ", zipcode=" + zipcode + ", address=" + address + ", telephone=" + telephone + "]";
	}
	
	
	

}
