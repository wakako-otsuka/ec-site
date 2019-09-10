package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.domain.Item;
import com.example.demo.repository.ItemRepository;

/**
 * 商品一覧を表示するサービス.
 * 
 * @author otsuka
 *
 */
@Service
@Transactional
public class ShowItemListService {

	@Autowired
	private ItemRepository itemRepository;
	
	/**
	 * 商品一覧を表示する.
	 * 
	 * @param name 商品名
	 * @param order　順番
	 * @return　商品一覧画面
	 */
	public List<Item> showItemList(String name,String order){
		List<Item> itemList=itemRepository.findAll(name, order);
		return itemList;
	}
	
}
