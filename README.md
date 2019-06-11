# Prelude
A PlayFramework Template for Startup & Indie Developer.

## Usage
Just run `sbt new todokr/play-prelude.g8`.  

Then move to generated project directory.   
Executing `sbt run` will start 

- Running PostgreSQL on Docker
- Installing frontend dependencies
- Running Play application
- Opening browser

So you can start development snappy!

## Requirements
- docker-compose
- node >= 10.14.2

## About Architecture Decision

### Backend

#### Scala
TODO

#### Playframework
TODO

### Frontend

#### Typescript
TODO

#### Angular
TODO

#### Build both frontend and backend in same project

We use Play's static routes to serve frontend code. Reasons is,

- No more CORS hassle
- Easy CI/CD integration
- Painless development experience with run hook and sbt tasks

When the bussines grows, it's time to separate and serve frontend with CDN ;)

### Database

#### PostgreSQL
TODO

#### Write DDL by hand

Because database lives longer than application, its schema need to be designed carefully.  
This is why we doesn't provide the way to generate DDL as a CLI task. It's easy to use but what matters is the incidental complexity of DB schema they yield.  
Thus, we expect the development flow that write DDL by hand first, then migrate database and generate repository code from schema.  
Designing schema with simplicity is hard work, but it pays well to focus on ;)
