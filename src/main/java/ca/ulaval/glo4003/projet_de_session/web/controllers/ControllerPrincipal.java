package ca.ulaval.glo4003.projet_de_session.web.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ca.ulaval.glo4003.projet_de_session.web.viewmodels.ViewModel;



@Controller
public class ControllerPrincipal
{
	private ViewModel unModel;

	@RequestMapping("/")
	public String getIndex(HttpServletRequest request, Model model) 
	{
		return "index";
	}
	
	@RequestMapping("/display")
	public String getDisplay(HttpServletRequest request, Model model) 
	{
		model.addAttribute("viewModel", unModel);
		return "display";
	}
	
	//Changer pour method dans ServiceEmploye
	@RequestMapping(value = "/display", method = RequestMethod.POST)
	public @ResponseBody ViewModel connection(@RequestBody ViewModel viewModel) 
	{
		unModel = viewModel;
		return viewModel;
	}
}
