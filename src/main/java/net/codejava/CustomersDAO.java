package net.codejava;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class CustomersDAO {

    @Autowired
	private JdbcTemplate jdbcTemplate;

    public void saveCustomer(Customers customers) {
		SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
		insertActor.withTableName("customers").usingColumns("fname", "lname", "email", "mobile", "street", "zip", "refercode", "username");
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(customers);
		insertActor.execute(param);		
	}


}