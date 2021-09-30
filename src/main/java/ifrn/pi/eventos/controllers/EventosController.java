package ifrn.pi.eventos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ifrn.pi.eventos.models.Evento;

@Controller
public class EventosController {
	
	@RequestMapping("/eventos/form" )
	public String form() {
		return "formEventos";
	}
	@RequestMapping("/eventos/form/confirm")
	public String confirmacao(Evento evento) {
		
		System.out.println(evento.getNome()+" "+evento.getLocal()+""+evento.getData()+" "+evento.getHorario());
		return "confirm";
	}
	

}
