/**
 * 
 */
package edu.nbcc.factory;

/**
 * @author Dylan
 *
 */
public class Customer implements User {

	@Override
	public String getEntitlements() {
		return "Customer User";
	}

}
