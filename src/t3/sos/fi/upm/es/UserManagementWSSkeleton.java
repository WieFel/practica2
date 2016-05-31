/**
 * UserManagementWSSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package t3.sos.fi.upm.es;

import java.util.HashMap;
import java.util.Map;

import es.upm.fi.sos.t3.usermanagement.Response;
import es.upm.fi.sos.t3.usermanagement.User;

/**
 * UserManagementWSSkeleton java skeleton for the axisService
 */
public class UserManagementWSSkeleton {
	private User superUser;
	private Map<String, User> users;
	private static int instance = 0;
	
	public UserManagementWSSkeleton(){
		System.out.println("Creando nueva instancia. Hasta ahora hay: " + (++instance));

		users = new HashMap<String, User>();
		superUser = new User();
		
		// Set the superuser
		superUser.setName("admin");
		superUser.setPwd("admin");
		users.put(superUser.getName(), superUser);
	}

	/**
	 * Esta operación cierra la sesión de un usuario. A partir de ese momento todas las llamadas a
	 * operaciones del servicio, excepto login, devolverán false. Si esta operación es llamada sin que el
	 * usuario haya iniciado sesión (login correcto) la llamada es ignorada.
	 * 
	 * @return
	 */
	public void logout() {
		// TODO : fill this with the necessary business logic

	}

	/**
	 * Cada llamada a esta operación comienza una nueva sesión para un usuario (user). La respuesta (Response) es un
	 * booleano. 
	 * 
	 * Si se llama a cualquier otra operación del servicio (salvo logout) sin haber comenzado una
	 * sesión con éxito, la operación llamada devolverá siempre false.
	 * 
	 * @param user		El parámetro user tiene dos elementos: nombre (name) y contraseña (pwd).
	 * @return response	Si esta operación tiene éxito, el usuario podrá llamar al resto de las operaciones del servicio 
	 * 					usando esa misma sesión. El valor true se devuelve si la operación de login tiene éxito. En caso 
	 * 					contrario se devuelve false.
	 */
	public es.upm.fi.sos.t3.usermanagement.Response login(
			es.upm.fi.sos.t3.usermanagement.User user) {
		
		User u;
		Response response = new Response();
		response.setResponse(false);
		
		if (users.containsKey(user.getName())) {
			// User is registered.
			u = users.get(user.getName());
			if (u.getPwd().equals(user.getPwd()))
				// Initialize and save session
				// TODO: how to init a session??
				response.setResponse(true);
		}	
		
		return response;
	}

	/**
	 * Esta operación añade un usuario al sistema. Solo el usuario superuser puede llamar esta
	 * operación. El parámetro user tiene el nombre (name) y contraseña (pwd) del usuario a añadir.
	 * La respuesta (Response) es true si la operación tiene éxito. La operación devuelve false si el
	 * superuser intenta añadir un usuario con un username ya registrado o si un usuario distinto del
	 * superuser llama a esta operación.
	 * 
	 * @param user1
	 * @return response2	La respuesta (Response) es true si la operación tiene éxito. La operación 
	 * 						devuelve false si el superuser intenta añadir un usuario con un username 
	 * 						ya registrado o si un usuario distinto del superuser llama a esta operación.
	 */
	public es.upm.fi.sos.t3.usermanagement.Response addUser(
			es.upm.fi.sos.t3.usermanagement.User user1) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement "
				+ this.getClass().getName() + "#addUser");
	}

	/**
	 * Esta operación permite que un usuario ya registrado y que ha iniciado sesión pueda cambiar su
	 * contraseña. 
	 * 
	 * @param passwordPair	El parámetro passwordPair incluye la contraseña actual (oldpwd) y la nueva
	 * 						(newpwd).
	 * @return response3	La respuesta (Response) es true si la operación tiene éxito, es decir, la 
	 * 						contraseña actual coincide con la que el usuario inició la sesión y se ha 
	 * 						realizado el cambio de contraseña. La operación devuelve false en caso contrario.
	 */
	public es.upm.fi.sos.t3.usermanagement.Response changePassword(
			es.upm.fi.sos.t3.usermanagement.PasswordPair passwordPair) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement "
				+ this.getClass().getName() + "#changePassword");
	}

	/**
	 * Esta operación elimina un usuario del sistema. Solo el usuario superuser puede llamar esta
	 * operación.
	 * 
	 * @param username		El parámetro username tiene el nombre del usuario a eliminar.
	 * @return response4	La respuesta (Response) es true si la operación tiene éxito. La operación 
	 * 						devuelve false si el superuser intenta eliminar un usuario con un username 
	 * 						no registrado o si un usuario distinto del superuser llama a esta operación.
	 */
	public es.upm.fi.sos.t3.usermanagement.Response removeUser(
			es.upm.fi.sos.t3.usermanagement.Username username) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement "
				+ this.getClass().getName() + "#removeUser");
	}

}
