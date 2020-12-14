//package com.example.servingwebcontent;
//
//import javax.swing.JOptionPane;
//import javax.swing.JPasswordField;
//import javax.swing.JTextField;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RequestBody;
//
//@Controller
//public class GreetingController {
//
//	@GetMapping("/greeting")
//	public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name,
//			Model model) {
//		model.addAttribute("name", name);
//		return "greeting";
//	}
//
//
//	@GetMapping("/formulario")
//	public String login() {
//
//		return "formulario";
//
//	}
//
//	@PostMapping("/holapost")
//	@ResponseBody
//	public String holaPost(@RequestParam String name, @RequestParam String username, @RequestParam String password) {
//
//		return "estas logueado, "+ name +", bienvenido";
//	}
//	
//	
//	
//}
