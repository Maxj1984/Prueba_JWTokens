package edu.uspg.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import edu.uspg.model.Usuario;



//import com.mitocode.model.Usuario;

public interface IUsuarioDAO extends JpaRepository<Usuario, Integer> {

	Usuario findOneByUsername(String username);
}
