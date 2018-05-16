# CustomTest

1. download and install postgress 
2. run postgres 
3. change application.properties user/pass if needed 
4. open intelliJ / run demoAplication config  or go to DemoApplication and run the main method
5. it will run on http://localhost:8080 

Sample : 

Add customer 

POST  http://localhost:8080/api/add 
<p>
  Payload : 
        {
            "name": "test",
            "lastName": "test3",
            "zipcode": 3433,
            "email":"costin.pahontu@gmail.com"
        }
  </p>
  List All customers 
  <p>
  GET  http://localhost:8080/api/list
  </p>
