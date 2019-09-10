package com.example.demo.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.User;
import com.example.demo.form.RegisterUserForm;
import com.example.demo.service.RegisterService;

@Controller
@RequestMapping("/registerUser")
public class RegisterUserController {

	@Autowired
	private RegisterService registerService;
	
	@ModelAttribute
	public RegisterUserForm setUpRegisterForm() {
		return new RegisterUserForm();
	}

	/**
	 * 登録画面を表示します.
	 * 
	 * @return
	 */
	@RequestMapping("")
	public String toinsert() {
		return "register_user";
	}

	/**
	 * ユーザー情報を登録します.
	 *
	 * @param form   リクエストパラ
	 * @param result
	 * @return
	 */
	@RequestMapping("/insert")
	public String insert(@Validated RegisterUserForm form, BindingResult result) {
		if (!form.getPassword().equals(form.getConfirmPassword())) {
			result.rejectValue("password", "", "パスワードが違います");
		}
		if (result.hasErrors()) {
			return toinsert();
		}
		User user = new User();
		BeanUtils.copyProperties(form, user);
		registerService.insert(user);
		return "redirect:/registerUser/redirectLogin";
	}

	/**
	 * ログイン画面を表示します.
	 * 
	 * @return
	 */
	@RequestMapping("/redirectLogin")
	public String redirectLogin() {
		return "forward:/loginUser";
	}
}