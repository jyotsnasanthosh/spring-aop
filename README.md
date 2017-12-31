# spring-aop
A simple java web application created to learn some of the spring aspect oriented concepts

AOP is to achieve modularity. Eliminates direct dependency of cross cutting concerns like logging, security, transaction  and plugging in the same wherever needed.

1) Aspect - A class to implement the cross cutting concerns like logging, transaction etc. (In this case, see package `com.spring.sample.aspects`)

2) JoinPoint - The execution of a method. At any point of time, we will be able to know what advice executed for which method.

3) Advice - Actions taken for each joinpoint. Types : Before, After, AfterReturning, AfterThrowing and Around. 

4) Pointcut - Expressions that is matched with join points to determine whether advice needs to be executed or not. Spring uses AspectJ pointcut expression language.

### prerequisites
1. Java 1.8
2. Maven 3.5.2
3. A proper JavaEE IDE (I'm using Eclipse Luna)

### setup
1. Clone this project
2. Open as maven project
3. Update maven dependencies
4. Run `com.spring.sample.TestApp.java`


### code style formatter
[Spring Boot Java Conventions](https://gist.github.com/jyotsnasanthosh/e2fb456f0ff91aa42ad8203e148bff79)
Save this as xml and import intto eclipse -> window -> preferences -> java -> code style -> formatter