package br.com.tdd.service;

import java.math.BigDecimal;

import br.com.tdd.modelo.Desempenho;
import br.com.tdd.modelo.Funcionario;

public class ReajusteService {

	public void concederReajuste(Funcionario func, Desempenho desempenho) {
		BigDecimal percentual = desempenho.percentualReajuste();
		func.reajustarSalario(percentual);
	}

}
