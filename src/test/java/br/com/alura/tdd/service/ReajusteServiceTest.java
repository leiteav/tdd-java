package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteServiceTest {

	@Test
	public void reajustar() {
		ReajusteService reajuste = new ReajusteService();
		Funcionario func = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000.00"));
		reajuste.concederReajuste(func, Desempenho.A_DESEJAR);
		
		assertEquals(new BigDecimal("1030.00"), func.getSalario() );
		
	}
}
