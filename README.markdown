# Scala + Spark Template
A [Giter8][g8] template for Scala with Spark. This template is done mainly for small spark jobs and trying out concepts. This template does not encapsulate everything needed for a full and deployable spark project.

Main class creates a bogus DataFrame with two columns and runs count, just to display everything is working.

# Usage (Giter)

1. Get [Giter8][g8]
2. Run command `g8 Zejnilovic/scala-spark-template.g8`
3. Fill in properties or keep defaults
4. `cd <project name>`
5. `sbt assembly`
6. `spark-sumbit target/scala-<scala version>/<project name>-assembly-<project version>.jar`

# Usage (SBT)

1. Run command `sbt new Zejnilovic/scala-spark-template.g8`
2. Fill in properties or keep defaults
3. `cd <project name>`
4. `sbt assembly`
5. `spark-sumbit target/scala-<scala version>/<project name>-assembly-<project version>.jar`



# Properties (and their defaults)
```
name = MyRandomProject
package = com.example
organization = com.example
version = 0.0.1-SNAPSHOT
scala_version = 2.11.12
spark_version = 2.4.4
sbt_version = 1.3.8
sbt_assembly_version = 0.14.10
scalatest_version = 3.0.5
```

Licensed under Creative Commons Zero v1.0 Universal

[g8]: http://www.foundweekends.org/giter8/

