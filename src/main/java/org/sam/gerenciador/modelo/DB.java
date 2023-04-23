package org.sam.gerenciador.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DB {

	private static List<Empresa> listaEmpresas = new ArrayList<>();
	private static List<Usuario> listaUsuarios = new ArrayList<>();
	private static Integer llaveSecuencial = 1;
	
	static {
		Empresa empresa = new Empresa();
		empresa.setId(DB.llaveSecuencial++);
		empresa.setNombre("Alura");
		Empresa empresa2 = new Empresa();
		empresa2.setId(DB.llaveSecuencial++);
		empresa2.setNombre("Caelum");	
		
		listaEmpresas.add(empresa);
		listaEmpresas.add(empresa2);
		
		Usuario a = new Usuario();
		a.setLogin("admin");
		a.setContraseña("12345");
		Usuario u = new Usuario();
		u.setLogin("user");
		u.setContraseña("12345");
		
		listaUsuarios.add(a);
		listaUsuarios.add(u);
	}
	
	public void agregarEmpresa(Empresa empresa) {
		empresa.setId(DB.llaveSecuencial++);
		DB.listaEmpresas.add(empresa);
	}

	public List<Empresa> getEmpresas(){
		return DB.listaEmpresas;
	}
	
	public void eliminarEmpresa(Integer id) {
		
		Iterator<Empresa> it = listaEmpresas.iterator();
		while(it.hasNext()) {
			Empresa emp = it.next();
			if(emp.getId() == id) {
				it.remove();
			}
		}

	}

	public Empresa buscarEmpresaPorId(Integer id) {
		for(Empresa empresa : listaEmpresas) {
			if(empresa.getId() == id) {
				return empresa;
			}
		}
		return null;
	}
}
