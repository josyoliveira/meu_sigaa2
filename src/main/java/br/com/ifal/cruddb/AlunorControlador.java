package br.com.ifal.cruddb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class AlunorControlador {

    @Autowired
    AlunoRepositorio ar;

    @RequestMapping("/aluno/form")
    public ModelAndView formulario(){
        ModelAndView aluno = new ModelAndView("formulario.html");
        aluno.addObject("aluno", new Aluno());
        return aluno;
    }

    @RequestMapping("/aluno/salva")
    public ModelAndView salvar(Aluno novoAluno){
        ar.save(novoAluno);
        return new ModelAndView("redirect:/aluno/listar");
    }

    @RequestMapping("/aluno/listar")
    public ModelAndView listar(){
        ModelAndView resposta = new ModelAndView("resultado.html");
        resposta.addObject("aluno", ar.findAll());
        return resposta;
    }

    


    
}