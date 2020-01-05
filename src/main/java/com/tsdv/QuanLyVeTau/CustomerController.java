package com.tsdv.QuanLyVeTau;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tsdv.QuanLyVeTau.model.Customer;
import com.tsdv.QuanLyVeTau.model.Ticket;
import com.tsdv.QuanLyVeTau.service.CustomerService;
import com.tsdv.QuanLyVeTau.service.TicketService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class CustomerController {

	private CustomerService customerService;
	private TicketService ticketService;

	@Autowired(required = true)
	@Qualifier(value = "ticketService")
	public void setTicketService(TicketService ps) {
		this.ticketService = ps;
	}

	@Autowired(required = true)
	@Qualifier(value = "customerService")
	public void setCustomerService(CustomerService ps) {
		this.customerService = ps;
	}

	@RequestMapping(value = "/customer", method = RequestMethod.GET)
	public String listCustomers(Model model) {
		model.addAttribute("customer", new Customer());
		model.addAttribute("listCustomers", this.customerService.listCustomers());
		return "customer";
	}

	// For add and update Customer both
	@RequestMapping(value = "/customer/add", method = RequestMethod.POST)
	public String addCustomer(@Valid @ModelAttribute("customer") Customer p, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			model.addAttribute("org.springframework.validation.BindingResult.form", bindingResult);
			model.addAttribute("listCustomers", this.customerService.listCustomers());
			return "customer";
		}
		if (p.getIdCustomer() == null) {
			// new category, add it
			this.customerService.addCustomer(p);
		} else {
			// existing category, call update
			this.customerService.updateCustomer(p);
		}

		return "redirect:/ticket";

	}

	@RequestMapping("customer/remove/{id}")
	public String removeCustomer(@PathVariable("id") int id) {

		this.customerService.removeCustomer(id);
		for (Ticket ticket : this.ticketService.listTickets()) {
			if (ticket.getIdCustomer() == id) {
				this.ticketService.removeTicket(ticket.getIdTicket());
			}
		}
		return "redirect:/customer";
	}

	@RequestMapping("customer/edit/{id}")
	public String editCustomer(@PathVariable("id") int id, Model model) {
		model.addAttribute("customer", this.customerService.getCustomerById(id));
		model.addAttribute("listCustomers", this.customerService.listCustomers());
		return "customer";
	}

}
