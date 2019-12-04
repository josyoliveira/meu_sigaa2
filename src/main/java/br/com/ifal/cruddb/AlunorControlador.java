package br.com.ifal.cruddb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class AlunorControlador {

    @RequestMapping("/aluno/form")
    public ModelAndView formulario(){
        ModelAndView aluno = new ModelAndView("formulario.html");
        aluno.addObject("aluno", new Aluno());
        return aluno;
    }
    
}