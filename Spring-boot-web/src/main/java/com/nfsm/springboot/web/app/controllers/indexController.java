package com.nfsm.springboot.web.app.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.nfsm.springboot.web.app.models.*;

@Controller

public class indexController {
	@RequestMapping ("/index")
	public String index(Model model) {
		model.addAttribute("saludo", "Lista de productos en equipo");
		model.addAttribute("praxedis", "Praxedis Calleja Sanchez");
		model.addAttribute("adriel", "Adriel Cante Balam");
		model.addAttribute("Raul", "Raul Efrain Lopez Mendez");
		return "index";
	}
	
	
	
	
	@RequestMapping ("/articulo")
	public String articulo (Model model) {
		
				
		model.addAttribute("titulo", "Listado De Articulos");
		
		return "articulo";
	}
	@ModelAttribute ("articulos")
	public List<Articulo> poblarArticulo(){
		List<Articulo> articulos = Arrays.asList(new Articulo("Pantalla LED Hisense 55\" Ultra HD 4K Smart TV 55H6F","$9,299","Hisense","5","coppel"),
				new Articulo("Tenis DC Shoes Lynnfield Color Azul para Hombre", "$899", "DC","4","coppel"),
				new Articulo("Tenis DC Shoes Lynnfield Color Azul para Hombre", "$1,699","no hay","6","coppel"),
				new Articulo("Motocicleta Veloci AGGRESSOR ZX-2 250CC 2020", "$26,999", "Veloci", "8", "coppel"),
				new Articulo("Reloj Bulova 96L266 Plateado", "$2,439", "Bulova","10","coppel"),
				new Articulo("Celular Motorola Moto One Action 128 GB Blanco","$5,999","Motorola","10","coppel"));
		
		return articulos;
	}
	
	
	}

