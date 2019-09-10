package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.Item;
import com.example.demo.form.ShowItemListForm;
import com.example.demo.service.ShowItemListService;

/**
 * 商品一覧を表示するコントローラ.
 * @author otsuka
 *
 */
@Controller
@RequestMapping("/")
public class ShowItemListController {

	@Autowired
	private ShowItemListService showItemListService;
	
	private static final int VIEW_SIZE=9;
	
	/**
	 * 商品一覧を表示するコントローラ.
	 * 
	 * @param form
	 * @param model
	 * @return
	 */
	@RequestMapping("")
	public String showItemList(ShowItemListForm form,Model model) {
		if(form.getPage()==null) {
			form.setPage(1);
		}
		if(form.getOrder()==null||form.getOrder().equals("")) {
			form.setOrder("asc");
		}
		if(form.getName()==null||form.getName().equals("")) {
			form.setName("");
		}
		
		List<Item>itemList=null;
		itemList=showItemListService.showItemList(form.getName(), form.getOrder());
		model.addAttribute("itemList", itemList);
		model.addAttribute("name",form.getName());
		model.addAttribute("order",form.getOrder());
		
		return "item_list";
	}

	
}
