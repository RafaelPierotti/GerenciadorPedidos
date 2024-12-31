package Gerenciador.Pedidos.GerenciadorPedidos.Repository;

import Gerenciador.Pedidos.GerenciadorPedidos.Model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
