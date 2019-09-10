package com.example.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.User;

/**
 * usersテーブルを操作するレポジトリ.
 * 
 * @author otsuka
 *
 */
@Repository
public class UserRepository {

	@Autowired
	private NamedParameterJdbcTemplate template;

	private static final RowMapper<User> USER_ROW_MAPPER = (rs, i) -> {
		User user = new User();
		user.setId(rs.getInt("id"));
		user.setName(rs.getString("name"));
		user.setEmail(rs.getString("email"));
		user.setPassword(rs.getString("password"));
		user.setZipcode(rs.getString("zipcode"));
		user.setAddress(rs.getString("address"));
		user.setTelephone(rs.getString("telephone"));
		return user;
	};

	/**
	 * ユーザ情報を登録する.
	 * 
	 * @param user ユーザ
	 */
	public void insert(User user) {
		String sql = ("INSERT INTO users (name,email,password,zipcode,address,telephone)VALUE(:name,:email,:password,:zipcode,:address,:telephone;");
		SqlParameterSource param = new BeanPropertySqlParameterSource(user);
		template.update(sql, param);

	}
}
