# Guide to OAuth2

****What is OAuth2**** 

OAuth is an open standard for access delegation, commonly used as a way for Internet users to grant websites or applications access to their information on other websites but without giving them the passwords.

****How OAuth2 Works****

(1) Resource Owner - You.

(2) Resource Server - Application or Server that is storing the resources. eg- facebook has all our profile pics , basic info like mobile no, email etc.
                  	  
(3) Client - All kinds of applications trying to access Resource Server

(4) Authorization Server - Application or Server providing/defining the mechanism/set of rules needed by the 3rd party applications in order to grant access to shared resources.
                   	   
(*) Note - Facebook acts as both a Resource Server and an Authorization Server.
					   
----References----

||Authorization Server||

https://docs.spring.io/spring-security-oauth2-boot/docs/2.2.x-SNAPSHOT/reference/html/boot-features-security-oauth2-authorization-server.html
 
||Resource Server||

https://docs.spring.io/spring-security-oauth2-boot/docs/2.2.x-SNAPSHOT/reference/html/boot-features-security-oauth2-resource-server.html
 
 
****Access Tokens VS Refresh Tokens****
 
Access Token - An access token contains the security credentials for a login session and identifies the user, the user's groups, the user's privileges, and, in some cases, a particular application.
 
Refresh Token - A Refresh tokens  are the credentials that allow the client to obtain more access tokens without needing the user to re-authenticate. 
 
(*) Notes - When current access tokens expire or become invalid, the authorization server provides refresh tokens to the client to obtain new access token.
 
 ----References----
 
||Refreshing an Access Token||

https://www.oauth.com/oauth2-servers/making-authenticated-requests/refreshing-an-access-token/
 
 
 

