# Chiks Golg's QA Challenge. 

This repository is part of the Chicks Gold QA Challenge, which will showcase the skills to design, implement and document manual and automated tests.

## Test plan

You can see the test plan layout in the "_Test plan_" file.

## Manual testing

In the "_Test cases_" file you can see the designed test cases and the results of their execution.
Test sets have been designed with their respective test cases to be implemented manually. They cover the functionalities requested in the Challenge.

## Automation testing

Automation has been implemented in two parts:

* __API Automation__: A workspace was created where each entity was organized into collections. Each endpoint was added there through a request, including tests through scripts to test the functionalities through Runners. For this, Datasets have been created, which can be obtained in the "_Data set for Postman - JSON files_" folder.

* __Web Automation__: Selenium has been used in conjunction with testNG and RestAssured for Web automation, using the POM design pattern.

### Run automation

#### API with Postman 

Before testing in Postman make sure to:
- Run the API locally on your PC (follow the steps indicated in the project repository).
- Download the test data. In the repository you will find a folder called "_Data set for Postman - JSON files_" where the datasets created to test in each request are located. Search and download the necessary ones.

After opening Postman, you must access the _Chicks Gold_ workspace through the 

      `ID: 67d5cb95-8e19-4799-abe4-899582519bcb`

You will be able to see 3 collections: User, Product and Order. In each of them you will find the corresponding requests to test.

To run Runner for each request you must:

- Access the desired collection.
- Click on the request to test.
- In the bottom bar search and click on "_Runner_".
- A new section will open, there you will be able to see information about the Runner. In "_Data_" click on the "_Select file_" button and find the file corresponding to the request to be tested.
- Find the request to be tested from the collection list, and drag it to "_Run order_".
- Press the "_Start Run_" button.
- Wait and see the test results!

![Postman_Runner](https://github.com/user-attachments/assets/6387d524-1bc9-48d8-b598-c06495a6695c)


![Postman_Execution](https://github.com/user-attachments/assets/44a51bba-a547-4bad-88df-642f95af9950)

To view already performed runs and their results, click on a collection name and select the "_Run_" tab.
![Postman_ViewRuns](https://github.com/user-attachments/assets/4134c4c7-535e-4558-98a1-b56c1727a725)


#### Web with Selenium 
Before running automated tests make sure to:
- Run the Web and API locally on your PC (follow the steps indicated in the project repository).
- Have Java 17 and Maven installed in your IDE.

Now, you must open the project in your preferred IDE and go to the folder:

    `cd qa-challenge`

Open the console and run the following command, where maven will run the tests created:

    `mvn test`

Wait while the tests are executed and as a result you will be able to see a summary of them in the console.

![TestExecution_Console_MavenTest](https://github.com/user-attachments/assets/2aced230-2584-495c-90cc-804f56d5238c)



## Project repository corresponding to the implemented tests
> https://github.com/SAMO-Technologies/qa-challenge

