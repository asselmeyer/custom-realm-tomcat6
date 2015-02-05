# Custom realm
This project contains the actual implementation of the custom realm and the required descriptor file `mbeans-descriptors.xml` that is needed so that Tomcat can manage the custom realm.

Note the difference between the `className` and `type` attribute in the `mbeans-descriptors.xml`:

* the `className` is the class of the JMX MBean. The MBean will probably be an `org.apache.catalina.mbeans.ClassNameMBean` for most custom realm implementations
* the `type` is the class of the objects that are managed by the MBean. That is the class of the custom realm