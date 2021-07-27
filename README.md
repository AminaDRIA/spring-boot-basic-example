# spring-boot-basic-example
Basic spring boot command line Hello world app.

___
Working on this example from my Eclipse IDE. I installed the STS -Spring Tool Suite- from the Eclipse marketplace, will see which benefits it adds as I usually work without it.

I had to install Java 11 for this example. I used the command 


` which java `


to know where my current installation is (it was in a hidden ProgramData folder).
___

To run the Hello world example, you can pass the command line argument through spring-boot.run.arguments 

``mvn spring-boot:run -Dspring-boot.run.arguments=WORLD!``

NB:You can actually use the command line arguments to configure your application if you retrieve them before your SpringApplication run call in the @SpringBootApplication annotated class.