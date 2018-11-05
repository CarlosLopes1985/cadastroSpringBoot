package curso.springboot.springboot.controller;

import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import curso.springboot.springboot.model.Produto;
import curso.springboot.springboot.repository.ProdutoRepository;

@Controller
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	private static String PASTA_DESTINO = "C://temp//";
	
	/**
	 * 
	 * @return
	 */
	@RequestMapping(value="/cadastroProdutos")
	public String inicioProduto(){
		
		return "cadastro/cadastroProdutos";
	}
	
	/**
	 * 
	 * @param produto
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/salvarProduto")
	public ModelAndView salvarProduto(Produto produto){
		
		produtoRepository.save(produto);
		
		ModelAndView mv = new ModelAndView("cadastro/uploadImagemProduto");
		
		return mv;
	}
	
	/**
	 * 
	 * @param file
	 * @param redirectAttributes
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/uploadImagem")
	public ModelAndView uploadImagemProduto(@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes){
		
		if(file.isEmpty()){
			 redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
			 ModelAndView mv = new ModelAndView("cadastro/uploadStatus");
			 return mv;
		}
		ModelAndView mv = null;
		try {
			
			byte[]bytes = file.getBytes();
			
			Path path = Paths.get(PASTA_DESTINO + file.getOriginalFilename());
			
			System.out.println("O caminho é : "+path);
			
			Files.write(path, bytes);
			
			 redirectAttributes.addFlashAttribute("message",
	                    "You successfully uploaded '" + file.getOriginalFilename() + "'");
			 mv =  new ModelAndView("cadastro/uploadStatus");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return mv;
	}
	
	

}
