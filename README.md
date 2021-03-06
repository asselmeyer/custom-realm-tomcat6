# A custom realm for Apache Tomcat 6

## Introduction 
Implementing a custom security realm for Apache Tomcat is not too hard, but the documentation is rather sparse. The best example I could find is the one by Mikkel Flindt Heisterberg on [lekkimworld.com](http://lekkimworld.com/2005/07/29/writing_a_custom_tomcat_login_module_realm.html)

In the projects here I try to provide a complete and working example. The focus lies on the necessary steps to build a custom realm. To add some "real" functionality not provided by the standard realm implementations in Tomcat 6, the custom realm uses salted and iterated password hashes.

### Why Tomcat 6?
Basically because writing a custom realm for Tomcat 6 was part of a project at work. I figured that Tomcat 6 is an old Tomcat version that still might be in use here and there and that the lack of support for salted and iterated hashes in the standard realm implementations might be an actual reason to write a custom realm.

### What about newer Tomcat versions?

Examples for later Tomcat versions might follow, but the steps are pretty much the same. Note that as of Tomcat 8, the standard realm implementations support [salted and iterated password hashes](http://tomcat.apache.org/tomcat-8.0-doc/realm-howto.html#Digested_Passwords).

## Overview
To implement and use a custom realm with Tomcat 6 one has basically to go through these steps:

1. Implement the custom realm. In this example this is done in the `custom-realm` project
   1. Write the realm class that implements the `org.apache.catalina.Realm` interface. It might be sensible to extend one of the standard realms in the `org.apache.catalina.realm`package such as `RealmBase`
   2. Write a `mbeans-descriptors.xml` descriptor file for the custom realm in the same package
2. Introduce the realm (or rather the descriptor) in `$CATALINA_HOME/conf/server.xml`  
   See `conf-snipplets` for details
3. Configure your web app to use the custom realm. In the example `realm-test-webapp` this is done by configuring security in the `WEB-INF/web.xml` and specifying the realm in `META-INF/context.xml`

## How to run the examples
The projects use maven to build and run them. A detailed description will follow.