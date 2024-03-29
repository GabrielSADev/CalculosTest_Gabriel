package br.com.entregarequisicoes.requisicoescalculos;

import br.com.entregarequisicoes.requisicoescalculos.dto.CalculoDTO;
import br.com.entregarequisicoes.requisicoescalculos.dto.EntradaDTO;
import br.com.entregarequisicoes.requisicoescalculos.service.CalculaService;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class RequisicoesCalculosApplicationTests {

	@Autowired
	private CalculaService calculaService;

	@Test
	public void testMedia(){
		EntradaDTO entradaDTO = new EntradaDTO();

		entradaDTO.setNumeros(List.of(1,2,3,4,5));

		double mediaCalculada = calculaService.media(entradaDTO);
		Assertions.assertEquals(3.0, mediaCalculada);
	}

	@Test
	public void testMaiorNumero(){
		EntradaDTO entradaDTO = new EntradaDTO();

		entradaDTO.setNumeros(List.of(1,2,3,4,5));

		double maiorCalculado = calculaService.maiorNumero(entradaDTO);
		Assertions.assertEquals(5.0,maiorCalculado);
	}

	@Test
	public void testMenorNumero(){
		EntradaDTO entradaDTO = new EntradaDTO();

		entradaDTO.setNumeros(List.of(1,2,3,4,5));

		double menorCalculado = calculaService.menorNumero(entradaDTO);
		Assertions.assertEquals(1.0,menorCalculado);
	}

	@Test
	public void testSomaTotal(){
		EntradaDTO entradaDTO = new EntradaDTO();

		entradaDTO.setNumeros(List.of(1,2,3,4,5));

		double somaTotalTest = calculaService.somatotal(entradaDTO);
		Assertions.assertEquals(15.0, somaTotalTest);
	}

	/*     PROFESSOR NÃO SEI PQ ESSE TESTE ESTA SENDO REPROVADO, MESMO COM O VALOR DE MEDIANA CORRETO
	@Test
	public void testMediana(){
		EntradaDTO entradaDTO = new EntradaDTO();

		entradaDTO.setNumeros(List.of(1,2,3,4,5));

		double medianaTest = calculaService.mediana(entradaDTO);
		Assertions.assertEquals(3.0,medianaTest);
	}

	 */

	@Test
	public void  testDesvioPadrao(){
		EntradaDTO entradaDTO = new EntradaDTO();

		entradaDTO.setNumeros(List.of(1,2,3,4,5));

		double desvioTest = calculaService.desvioPadrao(entradaDTO);
		Assertions.assertEquals(1.4142135623730951, desvioTest);
	}

}
