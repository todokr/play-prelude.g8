# Play in Harness
A PlayFramework Template for Startup & Indie Developer

## Usage
Run `sbt new todokr/play-in-harness.g8`

## Architecture Decision

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

