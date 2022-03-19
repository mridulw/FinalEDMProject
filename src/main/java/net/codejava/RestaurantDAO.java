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
    public class RestaurantDAO {
        @Autowired
        private JdbcTemplate jdbcTemplate;
    
        public List<Restaurant> list() {
            String sql = "SELECT restaurantID, restaurantName from Restaurant";
    
            List<Restaurant> listRestaurant = jdbcTemplate.query(sql, 
                    BeanPropertyRowMapper.newInstance(Restaurant.class));
     
            return listRestaurant;
        }    

}
