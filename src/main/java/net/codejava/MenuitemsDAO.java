package net.codejava;

import java.util.List;

import org.apache.catalina.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class MenuitemsDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	// Servlet servlet = new Servlet();
	// String id  = servlet.doPost("${restaurant.restaurantID}");
	
    public List<Menuitems> list(String resId) {
		String sql = "SELECT * FROM Menu_Items where restaurantid = '" + resId + "'";

		List<Menuitems> listMenuitems = jdbcTemplate.query(sql, 
				BeanPropertyRowMapper.newInstance(Menuitems.class));

		return listMenuitems;
	}
}