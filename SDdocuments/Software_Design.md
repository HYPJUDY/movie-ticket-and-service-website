# Software Design Report

## Part 1: Overview

### 1.1 Reason for technical selection of our framework
	1. The Spring framework provides a full-featured MVC module for building Web applications.
	2. Spring MVC separates the roles of controllers, model objects, dispatchers, and handler objects, making it easier to customize.
	3. Spring as a framework, provides some basic functions, such as transaction management, persistence layer integration, etc, so that developers are more focused on the development of application logic.
	4. Spring provides a good integrated support for many popular frameworks, such as hibernate, Struts2, JPA and so on.

### 1.2 Architecture Design
	1.2.1 

### 1.3 Module Partition
	1

## Part 2: Technology List
	2.1 Structure Programming


	2.2 Object-Oriented Programming
		2.2.1 Entity
		Our project mainly includes three entity classes that we just simply define their properties and annotate them. However, these classes must implement the Serializable interface, otherwise the object can not be saved to the byte stream for network transmission.

		Owned module: Model in Spring MVC
		Code location: D:\MyProjects\movie-ticket-and-service-website\codes\movie-ticket-and-service-website\src\main\java\com\team\legendary\persistence\entity

		2.2.2 Dao/DaoImpl

	2.3 Aspect-Oriented Programming

	2.4 Service Oriented Architecture

	2.5 Design Patterns

	2.6 High performance Programming
		2.6.1 Nginx
		Configure file location: /codes/movie-ticket-and-service-website/src/main/resources/nginx.conf

		### Sticky
			A nginx module to add a sticky cookie to be always forwarded to the same upstream server.
			When dealing with several backend servers, it's sometimes useful that one client (browser) is always served by the same backend server (for session persistance for example).
			Using a persistance by IP (with the ip_hash upstream module) is maybe not a good idea because there could be situations where a lot of different browsers are coming with the same IP address (behind proxies)and the load balancing system won't be fair.
			Using a cookie to track the upstream server makes each browser unique.
			When the sticky module can't apply, it switchs back to the classic Round Robin Upstream or returns a "Bad Gateway" (depending on the no_fallback flag).
			Sticky module can't apply when cookies are not supported by the browser

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

		

## Part 3: Extensibility and Maintainability Analysis
	