# SD

## Module Design

### Front-End
	thymleaf/css/js

### Back-End
	1. application: Configuration Class and Statring Server
	
	2. persistence: Access to MySQL Database
	
	3. web/controller: Interactivation between Front-End and Back-End


## Framework Spring

### Strategies
	The main 4 key strategies of spring will simplify the development of an enterprise Java application.
	1. Spring is light weight and It minimally invasive development with POJO.
	2. Spring achieves the loose coupling through dependency injection and interface based programming.
	3. Declarative programming through aspects and common conventions.
	4. Boilerplate reduction through aspects and templates.

### Advantages
	The Spring framework addresses most of the infrastructure functionalities of the Enterprise applications. Following are the few major advantages of Spring Framework.

	1. Spring enables the developers to develop the enterprise applications using POJOs (Plain Old Java Object). The benefit of developing the applications using POJO is, that we do not need to have an enterprise container such as an application server but we have the option of using a robust servlet container.
	2. Spring comes with some of the existing technologies like ORM framework, logging framework, J2EE and JDK Timers etc, Hence we don’t need to integrate explicitly those technologies.
	3. Spring WEB framework has a well-designed  web MVC framework, which provides a great alternate to web framework.
	4. Spring can eliminate the creation of the singleton and factory classes.
	5. Spring framework is both complete and modular, because spring framework has a layered architecture.
	6. Spring provides a consistent transaction management interface that can scale down to a local transaction and scale up to global transactions (using JTA).
	7. Spring framework includes support for managing business objects and exposing their services to the presentation tier components, so that the web and desktop applications can access the same objects.
	8. Spring framework has taken the best practice that have been proven over the years in several applications and formalized as design patterns.
	9. Spring application can be used for the development of different kind of applications, like standalone applications, standalone GUI applications, Web applications and applets as well.
	
	And more over the Spring framework consists of features organized into about 20 modules, these modules are grouped into Core Container, Data Access/Integration, Web, AOP (Aspect Oriented Programming ), Instrumentation and Test.

### Spring Core Container :
	The Spring Core container is the basis for the complete spring framework. The Spring core container provides an implementation for IoC supporting Dependency Injection. The container provides a consistent means of configuring and managing the Java objects using call backs. The container is also responsible for managing the objects life cycle such as

	1. Creating the Objects
	2. Calling initialization methods
	3. Configuring objects by writing them together

### Spring AOP (Aspect Oriented Programming) :
	Spring AOP module provides an implementation of AOP (Aspect Oriented Programming). The Spring AOP is a proxy-based framework implemented in Java and it is developed based on AOP Alliance API, which enables us to use the advise developed under Spring AOP to be used with other AOP implementations, meaning it allows us to migrate the components implemented using Spring AOP to some other AOP implementation or to integrate any existing AOP alliance complaint component to work with Spring.

### Spring JDBC and DAO Module:
	The Spring framework supports for DAO includes a consistent exception hierarchy and a convenient translation from data access API-specific exceptions to the Spring DAO exception hierarchy.

	The Spring framework provides a solutions for the various problems identified by using JDBC as low-level data access API for implementing DAO, by giving thin, robust and highly extensible JDBC abstraction framework.

### ORM Module:
	The ORM (Object Relational Mapping) module for the Spring framework provides a high level abstraction for well-accepted object-relational mapping APIs such as Hibernate, JPA, JDO, OJB and iBatis. The Spring ORM module is not replacing or a competitive for any existing ORMs; instead it is designed to reduce the complexity by boilerplate code from the application in using the ORMs.

### J2EE (Java Enterprise Edition):
	The JEE module of Spring framework is build on the solid base, provided by the core package. This provides a support for using the remoting services in a simplified manner. This supports to build POJOs and expose them as remote objects without worrying about specific remoting technology given rules.

### Web Module:
	The Web module of Spring framework includes all the support for developing robust an maintainable web application in a simplified approach. It even includes support for MVC-based applications development.

## Nginx

### Location: 
	/codes/movie-ticket-and-service-website/src/main/resources/nginx.conf

### Advantages:
	1. Installations and configurations are simple and easy
	2. Fastest and the best for serving static files
	3. Dynamic content transformed into static content
	4. When compared to Apache, 4 times more concurrent connections are handled.
	5. Compatibility with commonly-used web apps
	6. Load Balancing Support
	7. Nginx makes websites faster thereby enabling them to get higher ranking by Google
	8. No risk in switching over to Nginx
	9. Support from Nginx service professionals
	10. The unique opportunity to try something new

### Sticky
	A nginx module to add a sticky cookie to be always forwarded to the same upstream server.
	When dealing with several backend servers, it's sometimes useful that one client (browser) is always served by the same backend server (for session persistance for example).
	Using a persistance by IP (with the ip_hash upstream module) is maybe not a good idea because there could be situations where a lot of different browsers are coming with the same IP address (behind proxies)and the load balancing system won't be fair.
	Using a cookie to track the upstream server makes each browser unique.
	When the sticky module can't apply, it switchs back to the classic Round Robin Upstream or returns a "Bad Gateway" (depending on the no_fallback flag).
	Sticky module can't apply when cookies are not supported by the browser