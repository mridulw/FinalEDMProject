package net.codejava;

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
public class RegistrationDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Registration> list() {
		String sql = "SELECT * FROM REGISTRATION";

		List<Registration> listRegistration = jdbcTemplate.query(sql, 
				BeanPropertyRowMapper.newInstance(Registration.class));

		return listRegistration;
	}
	
	public void save(Registration registration) {
		SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
		insertActor.withTableName("registration").usingColumns("username", "password", "securityquestion", "securityanswer");
		//insertActor.withTableName("customers").usingColumns("fname", "lname", "email", "mobile", "street", "zip", "refercode", "username");
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(registration);
		
		insertActor.execute(param);		
	}


	// public void save(Registration registration) {
	// 	SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
	// 	insertActor.withTableName("registration").usingColumns("username", "password", "securityquestion", "securitypassword");
	// 	BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(registration);
		
	// 	insertActor.execute(param);		
	// }
	/*
	public Sale get(int id) {
		String sql = "SELECT * FROM SALES WHERE id = ?";
		Object[] args = {id};
		Sale sale = jdbcTemplate.queryForObject(sql, args, BeanPropertyRowMapper.newInstance(Sale.class));
		return sale;
	}
	
	public void update(Sale sale) {
		String sql = "UPDATE SALES SET item=:item, quantity=:quantity, amount=:amount WHERE id=:id";
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(sale);
		NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);
		template.update(sql, param);		
	}
	
	public void delete(int id) {
		String sql = "DELETE FROM SALES WHERE id = ?";
		jdbcTemplate.update(sql, id);
	}
    */
}
