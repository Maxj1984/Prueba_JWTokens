package edu.uspg.service;


import java.util.List;

import edu.uspg.model.Menu;



public interface IMenuService extends ICRUD<Menu>{
	
	List<Menu> listarMenuPorUsuario(String nombre);
}
