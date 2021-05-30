package br.com.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.tdd.modelo.Desempenho;
import br.com.tdd.modelo.Funcionario;
import br.com.tdd.service.ReajusteService;

public class ReajusteServiceTest {
	
	private ReajusteService reajuste;
	private Funcionario func;
	
	@BeforeAll
	public static void inicio() {
		System.out.print("Início.");
	}
	
	@AfterAll
	public static void fim() {
		System.out.print("Fim.");
	}
	
	@BeforeEach
	public void inicializar() {
	this.reajuste = new ReajusteService();
	this.func = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000.00"));
	}
	
	@Test
	public void reajustarSalarioFuncComBaseNoDesempenho() {
		this.reajuste.concederReajuste(this.func, Desempenho.A_DESEJAR);
		assertEquals(new BigDecimal("1030.00"), func.getSalario() );
	}
	
	@Test
	public void reajustarSalarioFuncComBaseNoDesempenhoBom() {
		this.reajuste.concederReajuste(this.func, Desempenho.BOM);	
		assertEquals(new BigDecimal("1150.00"), func.getSalario() );
	}
	
	@Test
	public void reajustarSalarioFuncComBaseNoDesempenhoOtimo() {
		reajuste.concederReajuste(func, Desempenho.OTIMO);	
		assertEquals(new BigDecimal("1200.00"), func.getSalario() );
		
	}
}
