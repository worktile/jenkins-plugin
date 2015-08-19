# lesschat plugin for Jenkins - [![Build Status][jenkins-status]][jenkins-builds] [![lesschat Signup][lesschat-badge]][lesschat-signup]

Started with a fork of the HipChat plugin:

https://github.com/jlewallen/jenkins-hipchat-plugin

Which was, in turn, a fork of the Campfire plugin.

# Jenkins Instructions

1. Get a lesschat account: https://lesschat.com/
2. Configure the Jenkins integration: https://my.lesschat.com/services/new/jenkins-ci
3. Install this plugin on your Jenkins server
4. Configure it in your Jenkins job and **add it as a Post-build action**.

# Developer instructions

Install Maven and JDK.  This was last build with Maven 3.2.5 and OpenJDK
1.7.0\_75 on KUbuntu 14.04.

Run unit tests

    mvn test

Create an HPI file to install in Jenkins (HPI file will be in `target/lesschat.hpi`).

    mvn package

[jenkins-builds]: https://jenkins.ci.cloudbees.com/job/plugins/job/lesschat-plugin/
[jenkins-status]: https://jenkins.ci.cloudbees.com/buildStatus/icon?job=plugins/lesschat-plugin
[lesschat-badge]: https://jenkins-lesschat-testing-signup.herokuapp.com/badge.svg
[lesschat-signup]: https://jenkins-lesschat-testing-signup.herokuapp.com/
