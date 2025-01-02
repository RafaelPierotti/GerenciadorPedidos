package Gerenciador.Pedidos.GerenciadorPedidos.Repository;

import Gerenciador.Pedidos.GerenciadorPedidos.Model.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {
}
