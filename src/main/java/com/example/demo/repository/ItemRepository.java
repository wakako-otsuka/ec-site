package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Item;

@Repository
public class ItemRepository {

	@Autowired
	private NamedParameterJdbcTemplate template;
	
	/**Itemオブジェクトを生成するローマッパー.*/
	
	private static final RowMapper<Item> ITEM_ROW_MAPPER=(rs,i)->{
		Item item =new Item();
		item.setId(rs.getInt("id"));
		item.setName(rs.getString("name"));
		item.setPriceM(rs.getInt("price_m"));
		item.setPriceL(rs.getInt("price_l"));
		item.setImagePath(rs.getString("image_path"));
		item.setDeleted(rs.getBoolean("deleted"));
		return item;
	};
	
	/**
	 * 商品一覧を表示.
	 * @param name  商品名
	 * @param order　並び順
	 * @return 商品一覧画面
	 */
	public List<Item> findAll(String name,String order){
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT id,name,description,price_m,price_l,image_path,deleted FROM items WHERE name like :name ORDER BY price_m");
		sql.append(" "+order+" ");
		SqlParameterSource param=new MapSqlParameterSource().addValue("name",("%"+ name+"%"));
		List<Item> ItemList = template.query(sql.toString() ,param,ITEM_ROW_MAPPER);
		return ItemList;
}
}