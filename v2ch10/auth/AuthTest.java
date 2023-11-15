package auth;

import javax.security.auth.Subject;
import javax.security.auth.login.LoginContext;
import javax.security.auth.login.LoginException;
import java.security.Principal;

/**
 * This program obtains information about a user's Unix login
 *
 * @author Cay Horstmann
 * @version 1.03 2021-11-29
 */
public class AuthTest
{
	public static void main(final String[] args)
	{
		try
		{
			var context = new LoginContext("Login1");
			context.login();
			System.out.println("Authentication successful.");
			Subject subject = context.getSubject();
			for (Principal p : subject.getPrincipals())
			{
				System.out.println(p.getClass()
				                    .getName() + ": " + p.getName());
			}
			context.logout();
		}
		catch (LoginException e)
		{
			System.out.println("Authentication failed.");
			e.printStackTrace();
		}
	}
}
