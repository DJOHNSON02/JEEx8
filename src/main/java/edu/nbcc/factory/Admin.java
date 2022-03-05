/**
 * 
 */
package edu.nbcc.factory;

/**
 * @author Dylan
 *
 */
public class Admin implements User {

	@Override
	public String getEntitlements() {
		return "Admin User";
	}

}
