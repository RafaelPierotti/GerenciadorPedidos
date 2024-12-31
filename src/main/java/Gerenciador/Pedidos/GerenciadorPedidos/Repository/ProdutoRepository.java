package Gerenciador.Pedidos.GerenciadorPedidos.Repository;

import Gerenciador.Pedidos.GerenciadorPedidos.Model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
