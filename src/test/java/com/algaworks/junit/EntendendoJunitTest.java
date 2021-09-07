package com.algaworks.junit;

import org.junit.*;

public class EntendendoJunitTest {

	@BeforeClass
	public static void iniciarTestes() {
		System.out.println(">>> Iniciando todos os Testes <<<");
	}

	@AfterClass
	public static void encerrarTestes() {
		System.out.println(">>> Encerrando todos os Testes <<<");
	}

	@Before
	public void iniciarTeste() {
		System.out.println(">>> Iniciar o Teste <<<");
	}

	@After
	public void encerrarTeste() {
		System.out.println(">>> Encerrar o Teste <<<");
	}

	@Test
	public void testandoAlgo() {
		System.out.println(">>> Testando Algo <<<");
	}

	@Test
	public void testandoOutraCoisa() {
		System.out.println(">>> Testando Outra Coisa <<<");
	}
}
