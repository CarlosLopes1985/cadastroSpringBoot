package curso.springboot.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import curso.springboot.springboot.model.Pessoa;
import curso.springboot.springboot.repository.PessoaRepository;

@Controller
public class PessoaController {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@RequestMapping(method=RequestMethod.GET, value=("/index"))
	public String inicio(){
		return "cadastro/index";
		
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/salvarPessoa")
	public ModelAndView salvar(Pessoa pessoa){
		pessoaRepository.save(pessoa);
		
		ModelAndView mv = new ModelAndView("cadastro/cadastroPessoa");
		Iterable<Pessoa>pessoaIt = pessoaRepository.findAll();
		mv.addObject("pessoas", pessoaIt);
		
		return mv;
	}
	
	@RequestMapping(value="listaPessoas" , method=RequestMethod.GET)
	public ModelAndView pessoas(){
		
		ModelAndView mv = new ModelAndView("cadastro/cadastroPessoa");
		Iterable<Pessoa>pessoaIt = pessoaRepository.findAll();
		mv.addObject("pessoas", pessoaIt);
		return mv;
	}
}
