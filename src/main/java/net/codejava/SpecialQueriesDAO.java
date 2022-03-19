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
public class SpecialQueriesDAO {
   
    
        @Autowired
        private JdbcTemplate jdbcTemplate;
    
        public List<VCustStats> custStatList() {
            String sql = "select * from v_cust_stats";
    
            List<VCustStats> listCustStats = jdbcTemplate.query(sql, 
                    BeanPropertyRowMapper.newInstance(VCustStats.class));
     
            return listCustStats;
        }    

        public List<VPopularRestaurants> popRestList() {
            String sql = "select * from v_popular_restaurant";
    
            List<VPopularRestaurants> listPopRes = jdbcTemplate.query(sql, 
                    BeanPropertyRowMapper.newInstance(VPopularRestaurants.class));
     
            return listPopRes;
        }   
        public List<vItemType> itemTypeList() {
            String sql = "select * from v_item_type";
    
            List<vItemType> listItemType = jdbcTemplate.query(sql, 
                    BeanPropertyRowMapper.newInstance(vItemType.class));
     
            return listItemType;
        }   

        public List<VCustomerRestaurantOrder> cusRestOrderList() {
            String sql = "select * from V_Customer_Restaurant_Order";
    
            List<VCustomerRestaurantOrder> listCusRestOrder = jdbcTemplate.query(sql, 
                    BeanPropertyRowMapper.newInstance(VCustomerRestaurantOrder.class));
     
            return listCusRestOrder;
        }   

        public List<VRestLastOrderDate> restLastOrderDateList() {
            String sql = "select * from V_RESTAURANT_LAST_ORDER_DATE";
    
            List<VRestLastOrderDate> listRestLastOrderDate = jdbcTemplate.query(sql, 
                    BeanPropertyRowMapper.newInstance(VRestLastOrderDate.class));
     
            return listRestLastOrderDate;
        }   

        public List<VRiderStats> riderStatList() {
            String sql = "select * from V_Riders_Stats";
    
            List<VRiderStats> listRiderStat = jdbcTemplate.query(sql, 
                    BeanPropertyRowMapper.newInstance(VRiderStats.class));
     
            return listRiderStat;
        }   

        public List<VRestaurantCategory> resCategoryList() {
            String sql = "select * from V_RESTAURANT_CATEGORY";
    
            List<VRestaurantCategory> listResCategory = jdbcTemplate.query(sql, 
                    BeanPropertyRowMapper.newInstance(VRestaurantCategory.class));
     
            return listResCategory;
        }

        public List<VOrderStats> orderStatsList() {
            String sql = "select * from v_order_stats";
    
            List<VOrderStats> listOrderStats = jdbcTemplate.query(sql, 
                    BeanPropertyRowMapper.newInstance(VOrderStats.class));
     
            return listOrderStats;
        }
        public List<VPopularItems> popularItemsList() {
            String sql = "select * from popular_item";
    
            List<VPopularItems> listPopularItems = jdbcTemplate.query(sql, 
                    BeanPropertyRowMapper.newInstance(VPopularItems.class));
     
            return listPopularItems;
        }
        public List<VMostOrderedItems> mostOrderedItemsList() {
            String sql = "select * from v_most_ordered_dish";
    
            List<VMostOrderedItems> listMostOrderedItems = jdbcTemplate.query(sql, 
                    BeanPropertyRowMapper.newInstance(VMostOrderedItems.class));
     
            return listMostOrderedItems;
        }
        
        public List<VRiderRank> riderRank() {
            String sql = "select * from v_rider_rank";
    
            List<VRiderRank> listRiderRank = jdbcTemplate.query(sql, 
                    BeanPropertyRowMapper.newInstance(VRiderRank.class));
     
            return listRiderRank;
        }
        public List<VQuarterRevenue> quarterRevenue() {
            String sql = "select * from v_quarter_revenue";
    
            List<VQuarterRevenue> listQuarterRevenue = jdbcTemplate.query(sql, 
                    BeanPropertyRowMapper.newInstance(VQuarterRevenue.class));
     
            return listQuarterRevenue;
        }
        public List<VDepartmentStat> departmentStat() {
            String sql = "select * from v_department_stat";
    
            List<VDepartmentStat> listDepartmentStat = jdbcTemplate.query(sql, 
                    BeanPropertyRowMapper.newInstance(VDepartmentStat.class));
     
            return listDepartmentStat;
        }
}


