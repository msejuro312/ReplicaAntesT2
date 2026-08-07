package cibertec.demo.repository;

import cibertec.demo.entities.ListaCompra;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ListaCompraRepository extends JpaRepository<ListaCompra, Long> {
    List<ListaCompra> findByUsuarioId(Long idUsuario);
    Page<ListaCompra> findByUsuarioId(Long idUsuario, Pageable pageable);
}
