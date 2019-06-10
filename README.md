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

