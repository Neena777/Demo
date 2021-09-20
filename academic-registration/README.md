# ACADEMIC REGISTRATION API

This project include everything needed for the academic registration.

## Getting started

This is a spring boot application, which has hosted in the AWS using the Elastic Bean stalk and using RDS mysql database for persistence. 

## Usage Local

1. Build the project

   ```mvn clean install```

2. Run the application from the AcademicRegistrationApplication Spring root file.


### Api Endpoints

    Post Method "/course" with 
        request : {"id":100,"courseName":"English Pre-K","courseYear":"2021"}
        response : {httpCode: 200, "Course created successfully"}

    Post Method "/user" with PROFESSOR
        request : {"userId":1,"firstName":"Jack","lastName":"Jill","role":"PROFESSOR"}
        response : {httpCode: 200, "User created successfully"}

    Post Method "/user" with STUDENT
        request : {"userId":2,"firstName":"Tim","lastName":"John","role":"STUDENT"}
        response : {httpCode: 200, "User created successfully"}

    Post Method "/register" with 
        request : {"userId":1,"courseId":"100"}
        response : {httpCode: 200, "User registration completed successfully"}

### Future enhancements to this project

1. Add more test cases and coverage for the functionality.
2. Implement Spring security.
3. Implement the rest of the CRUD features.
4. Add the concept of a Class for a Professor and Students, so that we have fine grain control on professor-student 
   relationship with a class.  
5. Implement JVM Level Caching for the Course details while fetching the data using EH Cache to enhance the performance.
