package com.onezero.test;

import java.util.Hashtable;

import javax.naming.AuthenticationException;
import javax.naming.AuthenticationNotSupportedException;
import javax.naming.Context;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;

public class Runner {

	public static void main(String[] args) {

		Hashtable<String, String> environment = new Hashtable<String, String>();

		environment.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
		environment.put(Context.PROVIDER_URL, "ldap://192.168.0.162:389"); // 389 default ldap port
		environment.put(Context.SECURITY_AUTHENTICATION, "simple");
		environment.put(Context.SECURITY_PRINCIPAL, "LK06789"); // Username
		environment.put(Context.SECURITY_CREDENTIALS, "qwe@123"); // Password

		
		try {
			DirContext context = new InitialDirContext(environment);
			System.out.println("Connected..");
			System.out.println(context.getEnvironment());


			context.close();
			/* return "redirect:/Form"; */

		} catch (AuthenticationNotSupportedException exception) {
			System.out.println("The authentication is not supported by the server");
			/* return "Login"; */
		}

		catch (AuthenticationException exception) {
			System.out.println("Incorrect password or username");
			/* return "Login"; */
		}

		catch (NamingException exception) {
			
			exception.printStackTrace();
			/* return "Login"; */
		}

	}

}
