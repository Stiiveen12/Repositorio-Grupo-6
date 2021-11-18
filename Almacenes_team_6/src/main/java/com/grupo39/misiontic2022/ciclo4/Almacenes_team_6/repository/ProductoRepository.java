package com.grupo39.misiontic2022.ciclo4.Almacenes_team_6.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.grupo39.misiontic2022.ciclo4.Almacenes_team_6.model.Producto;

public interface ProductoRepository extends MongoRepository<Producto, String>{
	
	List<Producto> findByCodigoproducto(Long codigoproducto);
	
	List<Producto> findByNombreproducto(String nombreproducto);

}