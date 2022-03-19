package net.codejava;

import java.util.List;

import javax.print.DocFlavor.STRING;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@CrossOrigin
@Controller
public class AppController {
	
	@RequestMapping("/home")
	public void showallString(){

	}

	@RequestMapping("/AdminLogin")
	public void showallbuttons(){

	}

	@Autowired
	//private SalesDAO dao;
	private RegistrationDAO dao;
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Registration> listRegistration = dao.list();
		model.addAttribute("listRegistration", listRegistration);
	    return "index";
	}

	@RequestMapping("/signup")
	public String showNewForm(Model model) {
	    Registration registration = new Registration();
	    model.addAttribute("registration", registration);
	     
	    return "signup";
	}
	

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(@ModelAttribute("registration") Registration registration) {
	    dao.save(registration);
	     
	    return "redirect:/customerdetails";
	}

	@Autowired
	private CustomersDAO cusDao;
	@RequestMapping("/customerdetails")
	public String showNewCustomerForm(Model model) {
	    Customers customers = new Customers();
	    model.addAttribute("customers", customers);
	     
	    return "customers";
	}
	@RequestMapping(value = "/saveCustomers", method = RequestMethod.POST)
	public String save(@ModelAttribute("customers") Customers customers) {
	    cusDao.saveCustomer(customers);
	     
	    return "redirect:/restaurants";
	}


	@Autowired
	private RestaurantDAO resDao;

	@RequestMapping("/restaurants")
	public String viewRestaurant(Model model) {
		Restaurant restaurant = new Restaurant();
		List<Restaurant> listRestaurant = resDao.list();
		model.addAttribute("listRestaurant", listRestaurant);
	    return "Restaurant";
	}

	@Autowired
	private SpecialQueriesDAO vCustStatsDao;

	@RequestMapping("/v_custStats")
	public String vCustStats(Model model) {
		VCustStats vcs = new VCustStats();
		List<VCustStats> listCustStats =  vCustStatsDao.custStatList();
		model.addAttribute("listCustStats", listCustStats);
	    return "vcustStats";
	}

	@RequestMapping("/v_popularRestaurants")
	public String vPopularRestaurants(Model model) {
		VPopularRestaurants vpr = new VPopularRestaurants();
		List<VPopularRestaurants> listPopRes =  vCustStatsDao.popRestList();
		model.addAttribute("listPopRes", listPopRes);
	    return "vPopularRestaurants";
	}
	@RequestMapping("/v_itemTypes")
	public String vItemTypes(Model model) {
		vItemType vit = new vItemType();
		List<vItemType> listItemType =  vCustStatsDao.itemTypeList();
		model.addAttribute("listItemType", listItemType);
	    return "vItemType";
	}

	@RequestMapping("/v_cusRestOrders")
	public String VCustomerRestaurantOrder(Model model) {
		VCustomerRestaurantOrder vcro = new VCustomerRestaurantOrder();
		List<VCustomerRestaurantOrder> listCustomerRestaurantOrders =  vCustStatsDao.cusRestOrderList();
		model.addAttribute("listCustomerRestaurantOrders", listCustomerRestaurantOrders);
	    return "VCustomerRestaurantOrder";
	}

	@RequestMapping("/v_restLastOrderDate")
	public String VRestaurantLastOrderDate(Model model) {
		VRestLastOrderDate vrlod = new VRestLastOrderDate();
		List<VRestLastOrderDate> listRestLastOrderDate =  vCustStatsDao.restLastOrderDateList();
		model.addAttribute("listRestLastOrderDate", listRestLastOrderDate);
	    return "VRestLastOrderDate";
	}


	@RequestMapping("/v_RiderStats")
	public String VRiderStat(Model model) {
		VRiderStats vrstat = new VRiderStats();
		List<VRiderStats> listVRiderStats =  vCustStatsDao.riderStatList();
		model.addAttribute("listVRiderStats", listVRiderStats);
	    return "VRiderStats";
	}

	@RequestMapping("/v_RestaurantCategory")
	public String VResCategory(Model model) {
		VRestaurantCategory vrc = new VRestaurantCategory();
		List<VRestaurantCategory> listVRestCategory =  vCustStatsDao.resCategoryList();
		model.addAttribute("listVRestCategory", listVRestCategory);
	    return "VRestaurantCategory";
	}

	@RequestMapping("/v_OrderStats")
	public String VOrderStats(Model model) {
		VOrderStats vos = new VOrderStats();
		List<VOrderStats> listVOrderStats =  vCustStatsDao.orderStatsList();
		model.addAttribute("listVOrderStats", listVOrderStats);
	    return "VOrderStats";
	}

	@RequestMapping("/v_popularItems")
	public String VPopularItems(Model model) {
		VPopularItems vpi = new VPopularItems();
		List<VPopularItems> listVPopularItems =  vCustStatsDao.popularItemsList();
		model.addAttribute("listVPopularItems", listVPopularItems);
	    return "VPopularItems";
	}

	@RequestMapping("/v_mostOrderedItems")
	public String VMostOrderedItems(Model model) {
		VMostOrderedItems vmoi = new VMostOrderedItems();
		List<VMostOrderedItems> listVMostOrderedItems =  vCustStatsDao.mostOrderedItemsList();
		model.addAttribute("listVMostOrderedItems", listVMostOrderedItems);
	    return "VMostOrderedItems";
	}
	@RequestMapping("/v_riderRank")
	public String VRiderRank(Model model) {
		VRiderRank vrr = new VRiderRank();
		List<VRiderRank> listRiderRank =  vCustStatsDao.riderRank();
		model.addAttribute("listRiderRank", listRiderRank);
	    return "VRiderRank";
	}
	@RequestMapping("/v_quarterRevenue")
	public String VQuarterRevenue(Model model) {
		VQuarterRevenue vqr = new VQuarterRevenue();
		List<VQuarterRevenue> listQuarterRevenue =  vCustStatsDao.quarterRevenue();
		model.addAttribute("listQuarterRevenue", listQuarterRevenue);
	    return "VQuarterRevenue";
	}

	@RequestMapping("/v_deptStats")
	public String VDepartmentStat(Model model) {
		VDepartmentStat vds = new VDepartmentStat();
		List<VDepartmentStat> listDeptStats =  vCustStatsDao.departmentStat();
		model.addAttribute("listDeptStats", listDeptStats);
	    return "VDepartmentStat";
	}

	/* @GetMapping("/menuItemsId/{restaurantID}")
	Menuitems menuitemsById = new Menuitems();
	public String showByID (@PathVariable(value="{restaurantID}") String restaurantID, Model model){
		String rest = Restaurant.getRestaurantID(restaurantID);

	} */

	// @Autowired
	// private MenuitemsDAO menuDao;
	// @RequestMapping("/menuItems")
	// public String viewMenuPage(Model model) {
	// 	List<Menuitems> listMenuitems = menuDao.list();
	// 	Menuitems menuItems = new Menuitems();
	// 	model.addAttribute("listMenuitems", listMenuitems);
	//     return "MenuItems";
	// }

	@Autowired
	private MenuitemsDAO menuDao;
	@RequestMapping("/menuItems")
	public String viewMenuPage(Model model,@RequestParam(defaultValue = "R001") String restroId) {
		List<Menuitems> listMenuitems = menuDao.list(restroId);
		Menuitems menuItems = new Menuitems();
		model.addAttribute("listMenuitems", listMenuitems);
	    return "MenuItems";
	}


	/*
	@RequestMapping("/new")
	public String showNewForm(Model model) {
	    Sale sale = new Sale();
	    model.addAttribute("sale", sale);
	     
	    return "new_form";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(@ModelAttribute("sale") Sale sale) {
	    dao.save(sale);
	     
	    return "redirect:/";
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditForm(@PathVariable(name = "id") int id) {
	    ModelAndView mav = new ModelAndView("edit_form");
	    Sale sale = dao.get(id);
	    mav.addObject("sale", sale);
	     
	    return mav;
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(@ModelAttribute("sale") Sale sale) {
	    dao.update(sale);
	     
	    return "redirect:/";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable(name = "id") int id) {
	    dao.delete(id);
	    return "redirect:/";       
	}
	*/	
}
