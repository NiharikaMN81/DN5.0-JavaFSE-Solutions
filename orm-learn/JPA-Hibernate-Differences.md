# Difference between JPA, Hibernate and Spring Data JPA

## JPA (Java Persistence API)
- JSR 338 Specification for persisting, reading and managing data
- Does NOT contain concrete implementation
- Just a set of rules/interfaces
- Hibernate is one implementation of JPA

## Hibernate
- ORM Tool that implements JPA
- Does the actual work of mapping Java objects to DB tables
- Generates SQL automatically

## Spring Data JPA
- Does NOT have its own JPA implementation
- Another level of abstraction OVER JPA providers like Hibernate
- Reduces boilerplate code significantly
- Manages transactions automatically

## Code Comparison

### Hibernate way (verbose):
- Need to manage Session, Transaction manually
- Lots of boilerplate code
- Need try-catch-finally blocks

### Spring Data JPA way (clean):
- Just extend JpaRepository
- Call save(), findAll(), deleteById() directly
- No boilerplate — Spring handles everything!

## Summary
JPA (spec) → implemented by → Hibernate → abstracted by → Spring Data JPA