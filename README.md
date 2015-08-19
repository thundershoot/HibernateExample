# HibernateExample

Original Article Author: Mkyong
Example followed: http://www.mkyong.com/hibernate/quick-start-maven-hibernate-mysql-example/

Tools & technologies used in this article : 
Maven 2.2.1
JDK 1.6.0_13
Hibernate 3.2.3.GA
MySQL 5.0

MySQL Table
DROP TABLE IF EXISTS `stock`;
CREATE TABLE `stock` (
  `STOCK_ID` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `STOCK_CODE` VARCHAR(10) NOT NULL,
  `STOCK_NAME` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`STOCK_ID`) USING BTREE,
  UNIQUE KEY `UNI_STOCK_NAME` (`STOCK_NAME`),
  UNIQUE KEY `UNI_STOCK_ID` (`STOCK_CODE`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

Base Maven Project
mvn archetype:generate -DgroupId=... -DartifactId=HibernateExample 
-DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
