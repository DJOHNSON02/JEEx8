/**
 * 
 */
package edu.nbcc.factory;

/**
 * @author Dylan
 *
 */
public class CustomerTest {
	public static void main(String[] args) {
		User user = UserFactory.getInstance(UserType.ADMIN);
		System.out.println(user.getEntitlements());
	}
}