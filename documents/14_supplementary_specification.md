#Supplementary Specification

##Objectives
The purpose of this document is to define requirements of the __movie-ticket system__. This Supplementary Specification lists the requirements that are not readily captured in the use cases of the use-case model. The Supplementary Specifications and the use-case model together capture a complete set of requirements on the system.

##Scope
This Supplementary Specification applies to the movie-ticket system which will enable users to buy movie tickets on-line. This system can recommand excellent movies to users and allow matching them nearby.

This specification defines the non-functional requirements of the system; such as reliability, usability, performance, and supportability as well as functional requirements that are common across a number of use cases. (The functional requirements are defined in the Use Case Specifications.)

##1. Functionality
###&emsp;1.1 System Error Logging
&emsp;All system errors shall be logged. Fatal system errors shall result in an orderly shutdown of the system.

The system error messages shall include a text description of the error, the operating system error code (if applicable), the module detecting the error condition, a data stamp, and a time stamp. All system errors shall be retained in the Error Log Database.

###&emsp;1.2 Remote Access
&emsp;All functionality shall be available remotely through an internet connection. This may require applications or controllers running on the remote computers.

##2. Usability
&emsp;Specify movie release time

&emsp;Specify seat information

&emsp;Specify movie price 

###&emsp;2.1 Windows Compliance
&emsp;The desktop user-interface shall be Windows 95/98 compliant.

###&emsp;2.2 Design for Ease-of-Use
&emsp;The user interface of the movie-ticket system shall be designed for ease-of-use and shall be appropriate for a computer-literate user community with no additional training on the System.

###&emsp;2.3 Online Help
&emsp;Each feature of the movie-ticket system shall have built-in online help for the user. Online Help shall include step by step instructions on using the System. Online Help shall include definitions for terms and acronymns.

##3. Reliability
The reliability softgoal is divided into accuracy, integrity, and availability. Accuracy involves consistency and availability provides protection against DOS attack relays on the firewall. Integrity covers completeness such as data validation, efficiency, and consistency. And availability provides protection against DOS attack relays on the firewall.

###&emsp;3.1 Availability
&emsp;The movie-ticket system shall be available 24 hours a day, 7 days a week. There shall be no more than 4% down time.

###&emsp;3.2 Mean Time Between Failures
&emsp;Mean Time Between Failures shall exceed 300 hours.

##4. Performance
One of the most important nonfunctional requirements customers wants is a system with good  and fast performance rate. Therefore, the performance goal is divided into three subgoals: time, space, and responsive. Time is divided into throughput time and response time (when using indexing). There are two level of indexing multi-level and single-level. Single-level is based on categories and keyword. A claim of response time is that indexing improves responses time when retrieving. Responsive subgoal deals on how fast the system responds to queries, and space subgoal with storage space. Storage space should not be wasted in order to achieve a good performance.

###&emsp;4.1 Simultaneous Users
&emsp;The system shall support up to 2000 simultaneous users against the central database at any given time, and up to 500 simultaneous users against the local servers at any one time.

###&emsp;4.2 Database Access Response Time
&emsp;The system shall provide access to the legacy course catalog database with no more than a 10 second latency.

###&emsp;4.3 Transaction Response Time
&emsp;The system must be able to complete 80% of all transactions within 2 minutes.

##5. Supportability
###&emsp;5.1 Adaptability
&emsp;Enable pluggable business rules
###&emsp;5.2 Configurability
&emsp;Adapt to the users' different network configuration requirements
###&emsp;5.3 New Releases Downloadable
&emsp;Upgrades to the PC client portion of movie-ticket shall be downloadable from the UNIX Server over the internet. This feature enables students to have easy access to system upgrades.

##6 Design Constraints
###&emsp;6.1 Course Catalog Legacy System
&emsp;The system shall integrate with existing legacy system (course catalog database) which operates on the College DEC VAX Main Frame.

###&emsp;6.2 Billing System
&emsp;The system shall interface with the existing Course Billing System which operates on the College DEC VAX Main Frame.

###&emsp;6.3 Platform Requirements
&emsp;The client portion of the movie-ticket system shall operate on any personal computer with a 486 processor or greater. The client portion shall require less than 20 MB disk space and 32 MB RAM.

The server portion of the movie-ticket system shall operate on the Wylie College UNIX server.

###&emsp;6.4 Internet Browsers
&emsp;The web-based interface for the movie-ticket system shall run in Netscape 4.0.4 and Internet Explorer 4.0 browsers.

###&emsp;6.5 Java Compatibility
&emsp;The web-based interface shall be compatible with the Java 1.1 VM runtime environment.