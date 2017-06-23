# Software Design Report

## Part 1: Overview

### 1.1 Reason for technical selection of our framework
1. The Spring framework provides a full-featured MVC module for building Web applications.
2. Spring MVC separates the roles of controllers, model objects, dispatchers, and handler objects, making it easier to customize.
3. Spring as a framework, provides some basic functions, such as transaction management, persistence layer integration, etc, so that developers are more focused on the development of application logic.
4. Spring provides a good integrated support for many popular frameworks, such as hibernate, Struts2, JPA and so on.

### 1.2 Architecture Design


### 1.3 Module Partition

## Part 2: Technology List
### 2.1 Structure Programming
In,fact, the main language of our project is java, so the project is mainly object-oriented programming while structured programming is relatively rare.However, the modules of our project are clearly divided and fully exploited the advantages of object-oriented programming.

### 2.2 Object-Oriented Programming
#### Entity
Our project mainly includes three entity classes that we just simply define their properties and annotate them. However, these classes must implement the Serializable interface, otherwise the object can not be saved to the byte stream for network transmission.

Owned module: Model in Spring MVC
Code location: codes\movie-ticket-and-service-website\src\main\java\com\team\legendary\persistence\entity

#### Dao/DaoImpl
In our project, we encapsulate the corresponding database access classes for each entity class. These classes are implemented in an interface-implementation model. Each class encapsulates various methods of accessing database objects, which makes it easy for service classes to be called.

Owned module: Model in Spring MVC
Code location: codes\movie-ticket-and-service-website\src\main\java\com\team\legendary\persistence\dao

### 2.3 Aspect-Oriented Programming
Spring AOP module provides an implementation of AOP (Aspect Oriented Programming). The Spring AOP is a proxy-based framework implemented in Java and it is developed based on AOP Alliance API, which enables us to use the advise developed under Spring AOP to be used with other AOP implementations, meaning it allows us to migrate the components implemented using Spring AOP to some other AOP implementation or to integrate any existing AOP alliance complaint component to work with Spring.

Location: /codes/movie-ticket-and-service-website/src/main/webapp/WEB-INF/applicationContext.xml

### 2.4 Service Oriented Architecture
The spring framework is a lightweight container that makes it easy to use different types of services. Lightweight containers can accept any JavaBean, instead of specific types of components.
WebLogic SCA enables you to use the spring framework to create Java applications using plain old Java objects (POJOs) and expose components as SCA services and references. In SCA terms, a WebLogic spring framework SCA application is a collection of POJOs plus a spring SCA context file that wires the classes with SCA services and references.
You can use the spring framework to create service components and wire them within a SOA composite application using its dependency injection capabilities. SCA can extend spring framework capabilities as follows:
Publish spring beans as SCA component services that can be accessed by other SCA components or by remote clients
Provide spring beans for service references wired to services of other components
Like all service components, spring components have a componentType file. The interfaces defined in the componentType file use the interface.java definition to identify their service and reference interfaces.
Services are implemented by beans and are targeted in the spring context file. References are supplied by the runtime as implicit (or virtual) beans in the spring context file.

Location: /codes/movie-ticket-and-service-website/src/main/java/com/team/legendary/persistence/service

### 2.5 Design Patterns
#### MVC Pattern
In our project, mvc (model-view-controller) is our most important design pattern. It can be seen from the architecture design that it plays an important role in the project. Each part has a corresponding code implementation. The model layer mainly includes entity, dao, and service classes. The view layer is mainly implemented by the front end, including js, html and css. The controller layer and its associated controller classes are placed in the controller folder.

Code location:
codes\movie-ticket-and-service-website\src\main\java\com\team\legendary
codes\movie-ticket-and-service-website\src\main\webapp\WEB-INF\templates
codes\movie-ticket-and-service-website\src\main\webapp\static

#### Data Access Object Pattern
Data access objects must implement a specific persistence policy (eg, JDBC or Hibernate-based persistence logic), thus extracting the DAO layer. DAO interface: Define the specific method of operation required. DAOlmpl class: the completion of data access to the real theme of the business logic processing, the end users want to get the data information.

Owned module: Model in Spring MVC
Code location: codes\movie-ticket-and-service-website\src\main\java\com\team\legendary\persistence\dao

### 2.6 High performance Programming
#### Nginx
Configure file location: /codes/movie-ticket-and-service-website/src/main/resources/nginx.conf

#### Sticky
A nginx module to add a sticky cookie to be always forwarded to the same upstream server.
When dealing with several backend servers, it's sometimes useful that one client (browser) is always served by the same backend server (for session persistance for example).
Using a persistance by IP (with the ip_hash upstream module) is maybe not a good idea because there could be situations where a lot of different browsers are coming with the same IP address (behind proxies)and the load balancing system won't be fair.
Using a cookie to track the upstream server makes each browser unique.
When the sticky module can't apply, it switchs back to the classic Round Robin Upstream or returns a "Bad Gateway" (depending on the no_fallback flag).
Sticky module can't apply when cookies are not supported by the browser

#### Advantages:
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
### Extensibility
The extensibility of our project is excellent. For example, if we want to add an entity class to the project, just add a new class in the entity folder, and then add the corresponding database access class to the dao folder. Finally, in the service class to achieve the realization of the entity class access or add a corresponding service class to complete the expansion of the project. But as we all know, the extensibility of the front end is not very good.
score: 95

### Maintainability
Project maintenance can mainly consider the following aspects, the project architecture design, module division, programming specifications and server fault tolerance. In general, our project architecture design is quite reasonable, the module division and programming style is also very standardized, due to load balancing, the server fault tolerance has improved.
score: 95



	
