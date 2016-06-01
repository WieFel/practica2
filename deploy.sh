#!/bin/bash
ant clean;
ant;

cp build/lib/UserManagementWS.aar ~/software2015_linux/apache-tomcat-7.0.59/webapps/axis2/WEB-INF/services/

~/software2015_linux/apache-tomcat-7.0.59/bin/shutdown.sh
#~/software2015_linux/apache-tomcat-7.0.59/bin/startup.sh
~/software2015_linux/apache-tomcat-7.0.59/bin/catalina.sh run

