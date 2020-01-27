package br.com.ifal.cruddb;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

/**
 * AlunorControladorTest
 */
public class AlunorControladorTest extends AbstractTest{

    @Before
    @Override
    public void setUp(){
        super.setUp();
    }

    @Test
    public void deveRetornaUmaPaginaWebParaAListagemDosAlunos() throws Exception {
        String uri = "/aluno/listar";
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri).accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();

        int statusRetornando = mvcResult.getResponse().getStatus();
        int statusEsperado = 200;

        assertEquals(statusEsperado, statusRetornando);
    }
}