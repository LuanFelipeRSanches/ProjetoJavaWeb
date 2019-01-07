package br.com.vendas.test;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.vendas.DAO.FornecedoresDAO;
import br.com.vendas.domain.Fornecedor;

public class FornecedorDAOTest {

	@Test
	@Ignore
	public void salvar() throws Exception {
		Fornecedor f1 = new Fornecedor();

		f1.setDescricao("Teste");

		FornecedoresDAO dao = new FornecedoresDAO();

		dao.salvar(f1);

	}

	@Test
	@Ignore
	public void listar() {
		FornecedoresDAO dao = new FornecedoresDAO();
		List<Fornecedor> fornecedores = dao.listar();
		for (Fornecedor fornecedor : fornecedores) {
			System.out.println(fornecedor);
		}
	}

	@Test
	@Ignore
	public void buscarPorCodigo() {
		FornecedoresDAO dao = new FornecedoresDAO();
		Fornecedor f1 = dao.buscarPorCodigo(1L);
		System.out.println(f1);
	}

	@Test
	@Ignore
	public void excluir() {
		FornecedoresDAO dao = new FornecedoresDAO();
		Fornecedor fornecedor = dao.buscarPorCodigo(1L);
		dao.excluir(fornecedor);
	}

	@Test
	@Ignore
	public void editar() {
		FornecedoresDAO dao = new FornecedoresDAO();
		Fornecedor fornecedor = dao.buscarPorCodigo(1L);
		fornecedor.setDescricao("Teste Editado 2");
		dao.editar(fornecedor);
	}
}
