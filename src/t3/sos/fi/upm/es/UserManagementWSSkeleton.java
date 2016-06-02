/**
 * UserManagementWSSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package t3.sos.fi.upm.es;

import java.util.HashMap;
import java.util.Map;

import org.apache.axis2.context.MessageContext;
import org.apache.axis2.context.ServiceContext;

import es.upm.fi.sos.t3.usermanagement.Response;
import es.upm.fi.sos.t3.usermanagement.User;

/**
 * UserManagementWSSkeleton java skeleton for the axisService
 */
public class UserManagementWSSkeleton {
	private static User superUser = new User();
	private static Map<String, User> users = new HashMap<String, User>();
	private static Map<String, String> sessions = new HashMap<String, String>();
	private static int instance = 0;

	public UserManagementWSSkeleton() {
		System.out.println("Creando nueva instancia. Hasta ahora hay: "
				+ (++instance));

		// Set the superuser
		superUser.setName("admin");
		superUser.setPwd("admin");
		users.put(superUser.getName(), superUser);
	}

	/**
	 * Esta operación cierra la sesión de un usuario. A partir de ese momento
	 * todas las llamadas a operaciones del servicio, excepto login, devolverán
	 * false. Si esta operación es llamada sin que el usuario haya iniciado
	 * sesión (login correcto) la llamada es ignorada.
	 * 
	 * @return
	 */
	public void logout() {
		System.out.println("#Logout");
		String serviceGroupContextId;
		serviceGroupContextId = MessageContext.getCurrentMessageContext()
				.getServiceGroupContextId();

		sessions.remove(serviceGroupContextId);
		printSessions();
		printUser();
	}

	/**
	 * Cada llamada a esta operación comienza una nueva sesión para un usuario
	 * (user). La respuesta (Response) es un booleano. Si esta operación tiene
	 * éxito, el usuario podrá llamar al resto de las operaciones del servicio
	 * usando esa misma sesión.
	 * 
	 * Si se llama a cualquier otra operación del servicio (salvo logout) sin
	 * haber comenzado una sesión con éxito, la operación llamada devolverá
	 * siempre false.
	 * 
	 * @param user
	 *            El parámetro user tiene dos elementos: nombre (name) y
	 *            contraseña (pwd).
	 * @return response El valor true se devuelve si la operación de login tiene
	 *         éxito. En caso contrario se devuelve false.
	 */
	public es.upm.fi.sos.t3.usermanagement.Response login(
			es.upm.fi.sos.t3.usermanagement.User user) {
		System.out.println("#Login");

		User u = null;
		Response response = new Response();
		response.setResponse(false);

		String serviceGroupContextId = MessageContext.getCurrentMessageContext()
				.getServiceGroupContextId();

		if (sessions.containsKey(serviceGroupContextId)) {
			// Session already created
			response.setResponse(true);
			printSessions();
			return response;
		}

		if (users.containsKey(user.getName())) {
			// User is registered.
			u = users.get(user.getName());
			if (u.getPwd().equals(user.getPwd())) {
				// Save session
				sessions.put(serviceGroupContextId, user.getName());
				response.setResponse(true);
				printSessions();
			}
		}

		return response;
	}

	/**
	 * Esta operación añade un usuario al sistema. Solo el usuario superuser
	 * puede llamar esta operación. El parámetro user tiene el nombre (name) y
	 * contraseña (pwd) del usuario a añadir. La respuesta (Response) es true si
	 * la operación tiene éxito. La operación devuelve false si el superuser
	 * intenta añadir un usuario con un username ya registrado o si un usuario
	 * distinto del superuser llama a esta operación.
	 * 
	 * @param user1
	 * @return response2 La respuesta (Response) es true si la operación tiene
	 *         éxito. La operación devuelve false si el superuser intenta añadir
	 *         un usuario con un username ya registrado o si un usuario distinto
	 *         del superuser llama a esta operación.
	 */
	public es.upm.fi.sos.t3.usermanagement.Response addUser(
			es.upm.fi.sos.t3.usermanagement.User user1) {
		System.out.println("#addUser");

		Response response = new Response();
		response.setResponse(false);

		// Is not the superuser
		if (getUserSession(superUser.getName()) == null)
			return response;

		if (users.containsKey(user1.getName()))
			// user already existing
			response.setResponse(false);
		else {
			// user not existing
			users.put(user1.getName(), user1);
			printUser();
			response.setResponse(true);
		}

		return response;
	}

	/**
	 * Esta operación permite que un usuario ya registrado y que ha iniciado
	 * sesión pueda cambiar su contraseña.
	 * 
	 * @param passwordPair
	 *            El parámetro passwordPair incluye la contraseña actual
	 *            (oldpwd) y la nueva (newpwd).
	 * @return response3 La respuesta (Response) es true si la operación tiene
	 *         éxito, es decir, la contraseña actual coincide con la que el
	 *         usuario inició la sesión y se ha realizado el cambio de
	 *         contraseña. La operación devuelve false en caso contrario.
	 */
	public es.upm.fi.sos.t3.usermanagement.Response changePassword(
			es.upm.fi.sos.t3.usermanagement.PasswordPair passwordPair) {
		System.out.println("#changePassword");

		User user = null; // TODO get user from session
		Response response = new Response();
		String session = MessageContext.getCurrentMessageContext()
				.getServiceGroupContextId();


		response.setResponse(false);			
		
		if (sessions.containsKey(session)){
			// User has already started a session and is therefore also registered
			user = users.get(sessions.get(session));
			if (user.getPwd().equals(passwordPair.getOldpwd())) {
				// Passwords correct
				user.setPwd(passwordPair.getNewpwd());
				response.setResponse(true);
			} 			
		}
					
		return response;
	}

	/**
	 * Esta operación elimina un usuario del sistema. Solo el usuario superuser
	 * puede llamar esta operación.
	 * 
	 * @param username
	 *            El parámetro username tiene el nombre del usuario a eliminar.
	 * @return response4 La respuesta (Response) es true si la operación tiene
	 *         éxito. La operación devuelve false si el superuser intenta
	 *         eliminar un usuario con un username no registrado o si un usuario
	 *         distinto del superuser llama a esta operación.
	 */
	public es.upm.fi.sos.t3.usermanagement.Response removeUser(
			es.upm.fi.sos.t3.usermanagement.Username username) {
		System.out.println("#removeUser");

		Response response = new Response();
		response.setResponse(false);

		// Is not the superuser
		if (getUserSession(superUser.getName()) == null)
			return response;

		if (users.containsKey(username.getUsername())) {
			// user existing
			users.remove(username.getUsername());
			sessions.remove(getUserSession(username.getUsername()));
			response.setResponse(true);
			printUser();
			printSessions();
		} else {
			// user not existing
			response.setResponse(false);
		}

		return response;
	}

	private String getUserSession(String username) {
		for (Map.Entry<String, String> entry : sessions.entrySet()) {
			if (entry.getValue().equals(username))
				return entry.getKey();
		}

		// Superuser not logged in
		return null;
	}

	// Function will be called when a new session starts
	public void init(ServiceContext serviceContext) {
		// TODO: Our code
		System.out.println("Init session");
	}

	// Function will be called when a session ends
	public void destroy(ServiceContext serviceContext) {
		// TODO: Our code
		System.out.println("Destroy session");
		logout();
	}
	
	private void printUser(){
		System.out.println("Print Users: ");
		for(Map.Entry<String, User> entry : users.entrySet()){
			System.out.println(entry.getKey());
		}
		System.out.println();
	}
	
	private void printSessions(){
		System.out.println("Print sessions: ");
		for(Map.Entry<String, String> entry : sessions.entrySet()){
			System.out.println(entry.getKey() + ", " + entry.getValue());
		}
		System.out.println();
	}
}
