package edu.TiendaVirtual.TiendaVirtual;

import java.io.File;
import java.util.List;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.tiendavirtual.DAO.Ajax;
import com.tiendavirtual.DAO.ClienteDAO;
import com.tiendavirtual.DAO.ProductosDAO;
import com.tiendavirtual.DAO.ProveedorDAO;
//import com.tiendavirtual.DAO.ProveedorDAO;
import com.tiendavirtual.DAO.UserDAO;
import com.tiendavirtual.DTO.Cliente;
import com.tiendavirtual.DTO.Productos;
import com.tiendavirtual.DTO.Proveedor;
//import com.tiendavirtual.DTO.Proveedor;
import com.tiendavirtual.DTO.User;

@RestController
public class VirtualStoreRESTController {
	
	@RequestMapping("/ingresarCliente")
	public String insertarCliente(Cliente c) {		
		ClienteDAO dao= new ClienteDAO();
		dao.insertCliente(c);
		return "Cliente ingresado";
		//?cedula=1252531&nombre=ClaraLuz&direccion=barranquilla&telefono=58374&email=correo@correo.com
	}
	
	@RequestMapping("/listarClientes")
	public ArrayList<Cliente> listarClientes() {
		ClienteDAO dao= new ClienteDAO();
		dao.listarClientes();
		return dao.listarClientes();
	}
	
	//?NIT=112233&nombre=Gato&direccion=Barranquilla&telefono=314456987&email=gato@hotmail.com&sitioweb=www.elgato.com
	@RequestMapping("/registrarProveedor")
	public String registrarProveedor(Proveedor p) {		
		ProveedorDAO dao = new ProveedorDAO();
		dao.insertProveedor(p);
		return "Proveedor Registrado";		
	}
	
	@RequestMapping("/registrarProducto")
	public String registrarProducto(Productos p) {		
		ProductosDAO dao = new ProductosDAO();
		dao.insertProducto(p);
		return "Producto Registrado";		
	}
	
	@RequestMapping("/consultarProveedores")
	public ArrayList<Proveedor> consultarProveedores(String nit) {		
		ProveedorDAO dao = new ProveedorDAO();
		return dao.consultarProveedores(nit);		
	}
	
	@RequestMapping("/actualizarProveedor")
	public void actualizarProveedor(Proveedor pro) {
		ProveedorDAO dao = new ProveedorDAO();
		dao.actualizarProveedor(pro);
	}
	
	@RequestMapping("/eliminarProveedor")
	public void eliminarProveedor(String NIT) {
		ProveedorDAO dao = new ProveedorDAO();
		dao.eliminarProveedor(NIT);
	}
	
	@RequestMapping("/consultarUsuarios")
	public ArrayList<User> consultarUsuarios(String cedula) {		
		UserDAO dao= new UserDAO();
		return dao.consultarUsuarios(cedula);
	}
	
	@RequestMapping("/consultarClientes")
	public ArrayList<Cliente> consultarClientes(String cedula) {		
		ClienteDAO dao= new ClienteDAO();
		return dao.consultarClientes(cedula);
	}
	
	@RequestMapping("/consultarProductos")
	public ArrayList<Productos> consultarProductos(long codigo_producto) {		
		ProductosDAO dao = new ProductosDAO();
		return dao.consultarProductos(codigo_producto);
	}
	
	@RequestMapping("/actualizarCliente")
	public void actualizarCliente(Cliente cli) {
		ClienteDAO dao = new ClienteDAO();
		dao.actualizarCliente(cli);
	}
	
	@RequestMapping("/eliminarCliente")
	public void eliminarCliente(String cedula) {
		ClienteDAO dao = new ClienteDAO();
		dao.eliminarCliente(cedula);
	}
	
	
	@RequestMapping("/ingresarUsuario")
	public String insertarUsuario(User u) {		
		UserDAO dao= new UserDAO();
		dao.insertUser(u);
		return "usuario ingresado";
		//?cedula=1252531&nombre=ClaraLuz&direccion=barranquilla&telefono=58374&email=correo@correo.com	
	}

	@RequestMapping("/actualizarUsuario")
	public void actualizarUsuario(User user) {
		UserDAO dao = new UserDAO();
		dao.actualizarUsuario(user);
	}
	
	@RequestMapping("/eliminarUsuario")
	public void eliminarUsuario(String cedula) {
		UserDAO dao = new UserDAO();
		dao.eliminarUsuario(cedula);
	}
	
	@RequestMapping("/listarUsuarios")
	public ArrayList<User> listarUser() {
		UserDAO dao= new UserDAO();
		dao.listarUser();
		return dao.listarUser();
	}
	
	@RequestMapping("/listarProveedores")
	public ArrayList<Proveedor> listarProveedor() {
		ProveedorDAO dao= new ProveedorDAO();
		dao.listarProveedor();
		return dao.listarProveedor();
	}
	
	@PostMapping("/upload") 
	  public ResponseEntity<?> handleFileUpload( @RequestParam("file") MultipartFile file ) {
	    String fileName = file.getOriginalFilename();
	    try {
	      File f = new File("C:\\ArchivosRecibidos\\" + fileName);
	      file.transferTo(f);
	      ProductosDAO dao= new ProductosDAO();
		  dao.FileUpload(f);
	    } catch (Exception e) {
	      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	    } 
	    return ResponseEntity.ok("Archivo Cargado correctamente");
	  }
	
	@RequestMapping("/ventasProductos")
	public ArrayList<Productos> ventasProductos() {
		Ajax dao= new Ajax();
		dao.productosVentas();
		return dao.productosVentas();
	}
	
	
	
	
	
}
