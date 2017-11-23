# <code>jersey_rest_framework</code>  - embedded Jetty container

This project demonstrates how to deploy and publish a REST service using an embedded lightweight http container or java based server (like Jetty) that can be configured and started programatically using Jersey RESTful Webservices framework

The project contains build and deployment settings and certain container configuration that should make it very easy to check out and modify for to your specific needs..

The app itself contains a minimalist <code>HelloResource</code> that exposes a 'greeting' interface. A Junit test is also included to test the service.

## Getting started

To get you started simply clone or download this repository. You will need to get git from <a href="https://git-scm.com/">here</a>

## Prerequisites

You will need to put together a <a href="https://gradle.org/">gradle</a> build pipeline and set your IDE to use JDK 1.8

## Run the project

To run the project enter any of the following commands from the project root

$gradle build <br>
$gradle test

## Publish the project

You can publish your project onto your embedded Jetty server using the following command

$gradle appRun

You server should start up promptly. You can browse to your service - http://localhost:8080/jersey_rest_framework

For more on Jersey RESTful WebServices framework, please visit <a href="https://jersey.github.io/">Project Jersey</a>
