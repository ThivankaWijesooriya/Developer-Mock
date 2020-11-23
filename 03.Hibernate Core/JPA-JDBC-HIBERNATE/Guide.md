Maven naming convention - group id , Artifact id and project name - > https://tool.oschina.net/uploads/apidocs/maven-3.0.4/guides/mini/guide-naming-conventions.html

Maven Project Structure -> https://maven.apache.org/guides/introduction/introduction-to-the-standard-directory-layout.html

Diff between spring data jpa and spring data jdbc -> https://stackoverflow.com/questions/51923060/spring-jdbc-vs-spring-data-jdbc-and-what-are-they-supporting


Spring Boot auto-configuration - https://www.springboottutorial.com/spring-boot-auto-configuration
                                 https://www.javatpoint.com/spring-boot-auto-configuration
                                  eg - automatically configures a datasource connectiing to h2 database based on dependecies
                                  available in the class path

H2 console auto-configuration Stack Trace -> o.s.b.a.h2.H2ConsoleAutoConfiguration : H2 console available at '/h2-console'. Database available at 'jdbc:h2:mem:testdb'

H2 Console local path -> http://localhost:8080/h2-console/

More info on H2 console -> https://github.com/in28minutes/in28minutes-initiatives/blob/master/The-in28Minutes-TroubleshootingGuide-And-FAQ/jpa-and-hibernate.md

In memory databases are stored in memory and only alive as long as application is running hence when application stops running then the database gets killed
hense whatever data you inserted to database will be lost as soon as application is stopped or restarted.
 
https://github.com/in28minutes/jpa-with-hibernate/tree/master/01-from-jdbc-to-jpa

Loading Initial Data with Spring Boot -> https://www.baeldung.com/spring-boot-data-sql-and-schema-sql

Create a sql file "data.sql" under "src/main/resources" spring boot will automatically execute sql when application is starting (This is a feature of Spring Boot Auto-Configuration) 

Spring Boot Bootstrap mode -> https://docs.spring.io/spring-data/data-commons/docs/current/api/org/springframework/data/repository/config/BootstrapMode.html
                              https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.bootstrap-mode
							  https://www.baeldung.com/spring-boot-lazy-initialization
							  
							  the default BootstrapMode for JPA repositories is now "deferred" so as to improve startup time.

