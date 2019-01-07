package br.com.vendas.test;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.vendas.DAO.FuncionariosDAO;
import br.com.vendas.domain.Funcionario;

public class FuncionarioDAOTest {

	@Test
	@Ignore
	public void salvar() throws Exception {
		Funcionario f1 = new Funcionario();

		f1.setNome("Teste 2");
		f1.setCpf("12558484848484");
		f1.setSenha("123");
		f1.setFuncao("Diretor");
		FuncionariosDAO dao = new FuncionariosDAO();

		dao.salvar(f1);

	}

	@Test
	@Ignore
	public void listar() {
		FuncionariosDAO dao = new FuncionariosDAO();
		List<Funcionario> funcionarios = dao.listar();
		for (Funcionario funcionario : funcionarios) {
			System.out.println(funcionario);
		}
	}

	@Test
	@Ignore
	public void buscarPorCodigo() {
		FuncionariosDAO dao = new FuncionariosDAO();
		Funcionario f1 = dao.buscarPorCodigo(1L);
		System.out.println(f1);
	}

	@Test
	@Ignore
	public void excluir() {
		FuncionariosDAO dao = new FuncionariosDAO();
		Funcionario funcionario = dao.buscarPorCodigo(1L);
		dao.excluir(funcionario);
	}

	@Test
	public void editar() {
		FuncionariosDAO dao = new FuncionariosDAO();
		Funcionario funcionario = dao.buscarPorCodigo(3L);
		funcionario.setNome("Teste Editado 2");
		funcionario.setCpf("123456789");
		funcionario.setSenha("1234");
		funcionario.setFuncao("Dono");
		dao.editar(funcionario);
	}
}
