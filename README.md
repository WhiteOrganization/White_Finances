# White_Finances
Home Finances Assistance Application


### What is this repository for? ###

* Quick summary.

The application will assist families to Budget Income/Expenses, tranking them, organize accounts, funds and much more in a user frendly interface.


* Version.

0.0.1 - SNAPSHOT
This is still under development and some functionality is being constantly added as needed. Please help us requesting those you need the most or tht documentation you think will be useful to add.

### How do I get set up? ###

* Summary of set up.
The application is not ready as a final product yet - Uder Development status

* Development environment.
- DB:				Oracle
- Java version: 	1.12
- Maven

* Configuration.



* Dependencies.

this library uses 
- lombok to log errors and general logs.
	- Slf4j
- PropertiesManager to obtain the default properties values.
- Google Guava to validate parameters.

* Database configuration

You need to set-up a DataBase for the project to connect to. If you want to use the application default data you need to use this:
**Not defined yet**
 - url=jdbc:oracle:oci:@//localhost:1521/White_Finances
 - username=
 - password=
 
In case of a change the database information that the app will use connect; you must change the properties at:
...\src\main\resources\application.properties


* Deployment instructions
use [maven](https://spring.io/guides/gs/maven/) to compile and run the project.
```
cd Code\White_Finances
mvn package
java -jar ...
```

### Contribution guidelines ###

* Writing tests.

Please do. Only some basic Unit testing is setup at the moment.

* Code review.

Request if needed.

* Other guidelines.

Please ask for the code standard to use as guideline and reflect it in the project.

### Who do I talk to? ###

* Repo owner or admin.

owner 		- current main developer - obed.vazquez@gmail.com
supporting 	- we have supporters with knoledge on the setup process of the project

* Other community or team contact.

Please contact me if you want to help, I'm developing and mantaining and supporting in general this project on my own with no help or support of anyone and any tip, comment, change or help in general is well received.
mail or http://discord.whiteweb.tech

