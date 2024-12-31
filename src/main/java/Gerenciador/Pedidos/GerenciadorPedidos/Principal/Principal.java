package Gerenciador.Pedidos.GerenciadorPedidos.Principal;

import Gerenciador.Pedidos.GerenciadorPedidos.Model.Categoria;
import Gerenciador.Pedidos.GerenciadorPedidos.Model.Pedido;
import Gerenciador.Pedidos.GerenciadorPedidos.Model.Produto;
import Gerenciador.Pedidos.GerenciadorPedidos.Repository.CategoriaRepository;
import Gerenciador.Pedidos.GerenciadorPedidos.Repository.PedidoRepository;
import Gerenciador.Pedidos.GerenciadorPedidos.Repository.ProdutoRepository;
import org.springframework.validation.beanvalidation.SpringValidatorAdapter;

import java.time.LocalDate;
import java.util.Scanner;

public class Principal {

    private Scanner scanner = new Scanner(System.in);
    private CategoriaRepository categoriaRepository;
    private PedidoRepository pedidoRepository;
    private ProdutoRepository produtoRepository;

//    public Principal(CategoriaRepository categoriaRepository, PedidoRepository pedidoRepository, ProdutoRepository produtoRepository) {
//        this.categoriaRepository = categoriaRepository;
//        this.pedidoRepository = pedidoRepository;
//        this.produtoRepository = produtoRepository;
//    }

    public void adicionarBanco(){
        Produto produto = new Produto("Notebook", 3500.0);
        Categoria categoria = new Categoria(1L, "Eletrônicos");
        Pedido pedido = new Pedido(1L, LocalDate.now());

        produtoRepository.save(produto);
        categoriaRepository.save(categoria);
        pedidoRepository.save(pedido);
    }
}
