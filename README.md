# Chiks Golg's QA Challenge. 

This repository is part of the Chicks Gold QA Challenge, which will showcase the skills to design, implement and document manual and automated tests.

## Test plan

You can see the test plan layout in the "Test plan" file.

## Manual testing

In the "Test cases" file you can see the designed test cases and the results of their execution.
Test sets have been designed with their respective test cases to be implemented manually. They cover the functionalities requested in the Challenge.

## Automation testing

Automation has been implemented in two parts:

* API Automation: A workspace was created where each entity was organized into collections. Each endpoint was added there through a request, including tests through scripts to test the functionalities through Runners. For this, Datasets have been created, which can be obtained in the "Data set for Postman - JSON files" folder.

* Web Automation: Selenium has been used in conjunction with testNG and RestAssured for Web automation, using the POM design pattern.

### Run automation

Before testing in Postman make sure to:
- Run the API locally on your PC (follow the steps indicated in the project repository).
- Download the test data. In the repository you will find a folder called "Data set for Postman - JSON files" where the datasets created to test in each request are located. Search and download the necessary ones.

After opening Postman, you must access the "Chicks Gold" workspace through the 
> ID: 67d5cb95-8e19-4799-abe4-899582519bcb

You will be able to see 3 collections: User, Product and Order. In each of them you will find the corresponding requests to test.

To run Runner for each request you must:

- Access the desired collection.
- Click on the request to test.
- In the bottom bar search and click on "Runner".
- A new section will open, there you will be able to see information about the Runner. In "Data" click on the "Select file" button and find the file corresponding to the request to be tested.
- Find the request to be tested from the collection list, and drag it to "Run order".
- Press the "Start Run" button.
- Wait and see the test results!

![Postman_Runner](https://github.com/user-attachments/assets/6387d524-1bc9-48d8-b598-c06495a6695c)
![Postman_Execution](https://github.com/user-attachments/assets/44a51bba-a547-4bad-88df-642f95af9950)

#### API with Postman


#### Web with Selenium 

