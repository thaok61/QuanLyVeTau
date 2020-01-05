package com.tsdv.QuanLyVeTau;

import java.util.ArrayList;
import java.util.List;

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
import org.springframework.web.servlet.ModelAndView;

import com.tsdv.QuanLyVeTau.model.ScheduleTrain;
import com.tsdv.QuanLyVeTau.model.Ticket;
import com.tsdv.QuanLyVeTau.service.CustomerService;
import com.tsdv.QuanLyVeTau.service.ScheduleTrainService;
import com.tsdv.QuanLyVeTau.service.TicketService;

@Controller
public class TicketController {
	private TicketService ticketService;
	private CustomerService customerService;
	private ScheduleTrainService scheduleTrainService;

	@Autowired(required = true)
	@Qualifier(value = "scheduleTrainService")
	public void setScheduleTrainService(ScheduleTrainService ps) {
		this.scheduleTrainService = ps;
	}

	@Autowired(required = true)
	@Qualifier(value = "customerService")
	public void setCustomerService(CustomerService ps) {
		this.customerService = ps;
	}

	@Autowired(required = true)
	@Qualifier(value = "ticketService")
	public void setTicketService(TicketService ps) {
		this.ticketService = ps;
	}

	@RequestMapping(value = "/ticket", method = RequestMethod.GET)
	public String listTickets(Model model) {
		model.addAttribute("ticket", new Ticket());
		model.addAttribute("listTickets", this.ticketService.listTickets());
		model.addAttribute("listCustomers", this.customerService.listCustomers());
		model.addAttribute("listScheduleTrains", this.scheduleTrainService.listScheduleTrains());
		return "ticket";
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView index () {
	    ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("home");
	    return modelAndView;
	}
	// For add and update Ticket both
	@RequestMapping(value = "/ticket/add", method = RequestMethod.POST)
	public String addTicket(@Valid @ModelAttribute("ticket") Ticket p, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			model.addAttribute("org.springframework.validation.BindingResult.form", bindingResult);
			model.addAttribute("listTickets", this.ticketService.listTickets());
			model.addAttribute("listCustomers", this.customerService.listCustomers());
			model.addAttribute("listScheduleTrains", this.scheduleTrainService.listScheduleTrains());
			return "ticket";
		}
		if (p.getIdTicket() == null) {
			// new category, add it
			this.ticketService.addTicket(p);
			
		} else {
			// existing category, call update
			this.ticketService.updateTicket(p);
		}
		return "redirect:/ticket";
	}

	@RequestMapping(value = "/ticket/slot/{id}", method = RequestMethod.POST)
	public String updateSlotTicket(@PathVariable("id") int id, Model model) {
			Ticket ticket = this.ticketService.getTicketById(id);
			ScheduleTrain scheduleTrain = this.scheduleTrainService.getScheduleTrainById(ticket.getIdScheduleTrain());
			List<Integer> listSlots = new ArrayList<>();
			for (int i = 0; i < scheduleTrain.getSlot(); i++) {
				listSlots.add(i);
			}
			model.addAttribute("ticket", ticket);
			model.addAttribute("listTickets", this.ticketService.listTickets());
			model.addAttribute("listCustomers", this.customerService.listCustomers());
			model.addAttribute("listScheduleTrains", this.scheduleTrainService.listScheduleTrains());
			model.addAttribute("listSlots", listSlots);
			return "slot";

	}

	@RequestMapping("ticket/remove/{id}")
	public String removeTicket(@PathVariable("id") int id) {

		this.ticketService.removeTicket(id);
		return "redirect:/ticket";
	}

	@RequestMapping("ticket/edit/{id}")
	public String editTicket(@PathVariable("id") int id, Model model) {
		model.addAttribute("ticket", this.ticketService.getTicketById(id));
		model.addAttribute("listTickets", this.ticketService.listTickets());
		model.addAttribute("listCustomers", this.customerService.listCustomers());
		model.addAttribute("listScheduleTrains", this.scheduleTrainService.listScheduleTrains());
		return "ticket";
	}
}
