package Gerenciador.Pedidos.GerenciadorPedidos;

import Gerenciador.Pedidos.GerenciadorPedidos.Model.Produto;
import Gerenciador.Pedidos.GerenciadorPedidos.Principal.Principal;
import Gerenciador.Pedidos.GerenciadorPedidos.Repository.CategoriaRepository;
import Gerenciador.Pedidos.GerenciadorPedidos.Repository.PedidoRepository;
import Gerenciador.Pedidos.GerenciadorPedidos.Repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GerenciadorPedidosApplication  {
//	@Autowired
//	private CategoriaRepository categoriaRepository;
//	@Autowired
//	private PedidoRepository pedidoRepository;
//	@Autowired
//	private ProdutoRepository produtoRepository;

	public static void main(String[] args) {
		SpringApplication.run(GerenciadorPedidosApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		Principal principal = new Principal(categoriaRepository, pedidoRepository, produtoRepository);
//		principal.adicionarBanco();
//	}
}
