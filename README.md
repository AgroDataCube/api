# API-V1
Application Programming Interface for the AgroDataCube

Version 1 of the AgroDataCube provides crop field oriented data for the Netherlands through a REST API that returns information in GeoJSON format.

This version was created using the following tools
- netbeans 8.0.2 (any ide supporting maven will do)
- maven version as supplied with netbeans
- java 8
- postgres 9.2 db

In order to use the project in your own environment:
- get the code from git
- optionally change the path in web.xml
- build in e.g. netbeans (v8 was used)
- deploy (in tomcat)
- add agrodatacube.properties file in root of tomcat, see #47 template in agrodatacube.zip
- get a database, see #38 Sample database (aka Duckburg) is available (adctest.dmp.txt). **Ask us!**

Steps to use db (_verified with postgres 9.4_):
- create database adctest with encoding='UTF8';
- create extension postgis;
- create user adctest with password _password_;
- restore: psql --host localhost --port 5432 --username "postgres" --dbname "adctest" -v ON_ERROR_STOP=1 < adctest.dmp.txt (_use settings that apply to your situation_)
