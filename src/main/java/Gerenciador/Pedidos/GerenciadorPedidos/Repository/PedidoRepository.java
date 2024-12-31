package Gerenciador.Pedidos.GerenciadorPedidos.Repository;

import Gerenciador.Pedidos.GerenciadorPedidos.Model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
