# lesschat plugin for Jenkins 

# Developer instructions

Install Maven and JDK.  This was last build with Maven 3.2.5 and OpenJDK
1.7.0\_75 on KUbuntu 14.04.

    mvn compile

Create an HPI file to install in Jenkins (HPI file will be in `target/lesschat.hpi`).

    mvn package

