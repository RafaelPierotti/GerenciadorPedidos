package Gerenciador.Pedidos.GerenciadorPedidos.Principal;

import Gerenciador.Pedidos.GerenciadorPedidos.Model.Categoria;
import Gerenciador.Pedidos.GerenciadorPedidos.Model.Fornecedor;
import Gerenciador.Pedidos.GerenciadorPedidos.Model.Pedido;
import Gerenciador.Pedidos.GerenciadorPedidos.Model.Produto;
import Gerenciador.Pedidos.GerenciadorPedidos.Repository.CategoriaRepository;
import Gerenciador.Pedidos.GerenciadorPedidos.Repository.FornecedorRepository;
import Gerenciador.Pedidos.GerenciadorPedidos.Repository.PedidoRepository;
import Gerenciador.Pedidos.GerenciadorPedidos.Repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

@Component
public class Principal {

    private Scanner scanner = new Scanner(System.in);
    @Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    private ProdutoRepository produtoRepository;
    @Autowired
    private PedidoRepository pedidoRepository;
    @Autowired
    private FornecedorRepository fornecedorRepository;

//    public Principal(CategoriaRepository categoriaRepository, PedidoRepository pedidoRepository, ProdutoRepository produtoRepository) {
//        this.categoriaRepository = categoriaRepository;
//        this.pedidoRepository = pedidoRepository;
//        this.produtoRepository = produtoRepository;
//    }
//
//    public void adicionarBanco(){
//        Produto produto = new Produto("Notebook", 3500.0);
//        Categoria categoria = new Categoria(1L, "Eletrônicos");
//        Pedido pedido = new Pedido(1L, LocalDate.now());
//
//        produtoRepository.save(produto);
//        categoriaRepository.save(categoria);
//        pedidoRepository.save(pedido);
//    }

    public void principal() {

        Categoria categoriaEletronicos = new Categoria(1L, "Eletronicos");
        Categoria categoriaJardim = new Categoria(1L, "Jardim");
        categoriaRepository.saveAll(List.of(categoriaEletronicos, categoriaJardim));

        Fornecedor fornecedorEletronico = new Fornecedor("Samsung");
        Fornecedor fornecedorJardim = new Fornecedor("Grama");
        fornecedorRepository.saveAll(List.of(fornecedorEletronico, fornecedorJardim));

        Produto produtoEletronico1 = new Produto("Notebook", 2500.00, categoriaEletronicos, null);
        Produto produtoEletronico2 = new Produto("Celular", 8000.00, categoriaEletronicos, null);
        Produto produtoJardim1 = new Produto("Inseticida", 50.00, categoriaJardim, null);
        Produto produtoJardim2 = new Produto("Espatula", 100.00, categoriaJardim, null);

        produtoEletronico1.setFornecedor(fornecedorEletronico);
        produtoEletronico2.setFornecedor(fornecedorEletronico);
        produtoJardim1.setFornecedor(fornecedorJardim);
        produtoJardim2.setFornecedor(fornecedorJardim);
        produtoRepository.saveAll(List.of(produtoEletronico1, produtoEletronico2, produtoJardim1, produtoJardim2));

        Pedido pedido1 = new Pedido(1L, LocalDate.now());
        pedido1.setProdutos(List.of(produtoEletronico1, produtoJardim1));

        Pedido pedido2 = new Pedido(2L, LocalDate.now().minusDays(1));
        pedido2.setProdutos(List.of(produtoEletronico2, produtoJardim2));

        pedidoRepository.saveAll(List.of(pedido1, pedido2));

        System.out.println("Produtos na categoria eletrônicos: ");
        categoriaRepository.findById(1L).ifPresent(categoria -> {
            categoria.getProdutos().forEach(produto -> {
                System.out.println(" - " + produto.getNome());
            });
        });

        System.out.println("\nPedido e seus produtos: ");
        pedidoRepository.findAll().forEach(pedido -> {
            System.out.println("Pedido " + pedido.getId() + ":" );
            pedido.getProdutos().forEach(produto -> {
                System.out.println(" - " + produto.getNome());
            });
        });

        System.out.println("\nProdutos e seus fornecedores: ");
        produtoRepository.findAll().forEach(produto -> {
            System.out.println("Produto: " + produto.getNome() + produto.getFornecedor());
        });
    }
}
