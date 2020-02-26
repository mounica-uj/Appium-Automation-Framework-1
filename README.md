Project Description:

Direct store delivery (DSD) is the term used to describe a method of delivering product from a supplier/distributor direct to a retail store, thereby bypassing a retailer's distribution center.A direct store delivery effectively eliminates this “middle man” and allows products to more quickly reach retail locations and customers.
DSD Customers are the customers that shop our stores. The DSD products that DSD vendors bring in are everyday used or consumed products that are customers seek to purchase each time they visit our stores. 
The top problems that we are trying to solve by DSD Receiver would include:
Not having enough product for customers (Out of Stocks, Fill Rates)
Not having the right product for customers (Sales Visibility, POG Visibility)
Having the vendors in our store at the right time for deliveries, ordering, and replenishment (Business Process Adjustments) 

Mobile-Automation quick start:

This is a Data Driven Framework to achieve functional testing and UI cases with Locators, Literals and commonly used page/screen level methods organized in to separate packages in which further segrigated to relevant class files and Test scripts are managed in to screen level packages.
Locators - com.krogerqa.appium.OR
Reusable methods - com.krogerqa.appium.common
Literals strings - com.krogerqa.appium.constants
Login screen scripts - com.krogerqa.appium.cases.login
Home screen scripts - com.krogerqa.appium.cases.homescreen

Tools used:

TestNg 
Maven
Apache POI
Appium
Selenium WebDriver
MS Excel

Utilities: com.krogerqa.appium.utilities
ReadExcel - To read test data stored in MS Excel (.xls) file with given sheet name and row name to rerun test with multiple test data
ConfigUtil - To read key-value pairs from the .properties file where one time configuration data is stored

Points to be noticed for script development:
1. Every test script extends ActionHelper
2. All the Appium action events are wrapped in to customized methods in ActionHelper, hence new events to be added here

Usage:

To run all modules, navigate to dsdreceiverandroid-qa directory and run:

mvn clean install
or 
mvn test

Reports:

dsdreceiverandroid-qa > test-output > emailable-report.html has detailed test execution report
dsdreceiverandroid-qa > test-output > testng-failed.xml has failed test only that an be used to rerun failed only test




