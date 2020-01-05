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

import com.tsdv.QuanLyVeTau.model.ScheduleTrain;
import com.tsdv.QuanLyVeTau.service.ScheduleTrainService;

@Controller
public class ScheduleTrainController {
	private ScheduleTrainService scheduleTrainService;

	@Autowired(required = true)
	@Qualifier(value = "scheduleTrainService")
	public void setScheduleTrainService(ScheduleTrainService ps) {
		this.scheduleTrainService = ps;
	}

	@RequestMapping(value = "/scheduleTrain", method = RequestMethod.GET)
	public String listScheduleTrains(Model model) {
		model.addAttribute("scheduleTrain", new ScheduleTrain());
		model.addAttribute("listScheduleTrains", this.scheduleTrainService.listScheduleTrains());
		return "scheduleTrain";
	}

	// For add and update ScheduleTrain both
	@RequestMapping(value = "/scheduleTrain/add", method = RequestMethod.POST)
	public String addScheduleTrain(@Valid @ModelAttribute("scheduleTrain") ScheduleTrain p, BindingResult bindingResult,
			Model model) {
		if (bindingResult.hasErrors()) {
			model.addAttribute("org.springframework.validation.BindingResult.form", bindingResult);
			model.addAttribute("listScheduleTrains", this.scheduleTrainService.listScheduleTrains());
			return "scheduleTrain";
		}
		if (p.getIdScheduleTrain() == null) {
			// new category, add it
			this.scheduleTrainService.addScheduleTrain(p);
		} else {
			// existing category, call update
			this.scheduleTrainService.updateScheduleTrain(p);
		}

		return "redirect:/scheduleTrain";

	}

	@RequestMapping("/scheduleTrain/remove/{id}")
	public String removeScheduleTrain(@PathVariable("id") int id) {

		this.scheduleTrainService.removeScheduleTrain(id);
		return "redirect:/scheduleTrain";
	}

	@RequestMapping("/scheduleTrain/edit/{id}")
	public String editScheduleTrain(@PathVariable("id") int id, Model model) {
		model.addAttribute("scheduleTrain", this.scheduleTrainService.getScheduleTrainById(id));
		model.addAttribute("listScheduleTrains", this.scheduleTrainService.listScheduleTrains());
		return "scheduleTrain";
	}
}
