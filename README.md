I use java spring boot for this project

for run this code you i have to make some changes in code
1. Go to application.properties file in src/main/resurces
2.change data spurce url as per your database
3.Change dialect as per your system(in my case i use mariaDB)
4.Change user name and password of databse

How to run
1.Project accept only post request so use POSTMAN or Advanced REST client for Run project
2.Link of project: http://localhost:8080/data_loader
3. parameter: countryCode, indicatorCode, startYear, endYear, format.

Note:
Due to lack of time i design the code only for json format.
