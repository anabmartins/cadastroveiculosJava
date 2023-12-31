package com.example.cadastroveiculos.repository;
import com.example.cadastroveiculos.model.Fabricante;
import com.example.cadastroveiculos.model.Veiculo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, String> {
    List<Veiculo> findByFabricante(Fabricante fabricante);
}
