# Iteration 1: Front End
Yupan Huang, 2017/5/22
![demo gif](https://github.com/HYPJUDY/movie-ticket-and-service-website/blob/master/assets/demo/demo1.gif)

## Tech
Building a Spring Boot Web Application. Focus on front end.
* Spring
* Spring MVC for the web part (without database currently)
* Thymeleaf for the template engine
* Tomcat server

## How to run
* [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/index.html) or later
* [Maven 3.0+](https://maven.apache.org/download.cgi) or [Gradle 2.3+](http://www.gradle.org/downloads)
* Import the code straight into your IDE:
    - [IntelliJ IDEA](https://spring.io/guides/gs/intellij-idea/)
    - Eclipse

## Approach
1. Initialize a Spring Boot project with IntelliJ. Be sure to check "Web" and "Thymeleaf". (Please refer to [2: Part 1])
2. Download web templates [3] and [4].
3. Serving web content with Spring MVC -- write htmls and controllers (no database now). Also need to combine two web templates. (Please refer to [1] and [2: Part 2&4])
4. Including Thymeleaf fragments to make code neat and compact. (Please refer to [2: Part 4])

## Update
### Log in & Sign up
Yupan Huang, 2017/5/28
Add log in/sign up buttons and pages. Remove Contact button and page.
![log in demo](https://github.com/HYPJUDY/movie-ticket-and-service-website/blob/master/assets/demo/login-demo.jpg)
![sign up demo](https://github.com/HYPJUDY/movie-ticket-and-service-website/blob/master/assets/demo/signup-demo.jpg)


## Reference
1. [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
2. Tutorial series -- SPRING BOOT WEB APPLICATION: [PART 1 - Spring Initializer](https://springframework.guru/spring-boot-web-application-part-1-spring-initializr/), [PART 2 - Using Thymeleaf](https://springframework.guru/spring-boot-web-application-part-2-using-thymeleaf/), [PART 3 - Spring Data JPA](https://springframework.guru/spring-boot-web-application-part-3-spring-data-jpa/), [PART 4 - Spring MVC](https://springframework.guru/spring-boot-web-application-part-4-spring-mvc/) and [PART 5 - Spring Security](https://springframework.guru/spring-boot-web-application-part-5-spring-security/).
3. [Cinema a Entertainment Category Flat Bootstrap Responsive Web Template](https://w3layouts.com/cinema-a-entertainment-category-flat-bootstrap-responsive-web-template/)
4. [Movie Ticket Booking Widget Flat Responsive Widget Template](https://w3layouts.com/movie-ticket-booking-widget-flat-responsive-widget-template/)