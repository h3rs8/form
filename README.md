## <p align="center"><strong>Assignment for Flexmoney Internship</strong></p>

* Frontend is hosted at: https://yoga.harshg.live & https://fantastic-melba-869e5b.netlify.app/ 

* README.md file and Backend Code (SpringBoot) is available at: https://github.com/h3rs8/form

* Backend is hosted at: https://form-k3s2.onrender.com

* Frontend Code (Angular) is available at: https://github.com/h3rs8/form-front

* MySQL Database is hosted with Azure.

#### Technology Stack
    Frontend: Angular Framework
    Backend: SpringBoot
    Database: MySQL
  
I’ve assumed:
1. Each applicant has a unique phone number.
2. There will always be 4 batches in a month at their respective times as provided in the problem statement.
3. One person can enroll in only one slot in a month.
4. The application accepts applications for the current month only.


### Explanation for Database Design 
    @OneToMany Relationship between Year and Month since each year has 12 months.
    @OneToMany Relationship between Month and Batch since each month has 4 batches.
    @OneToMany Relationship between Batch and User since each Batch has multiple customers/users.

    Primary Key for Year is the year itself.
    Primary Key for all other entities is the unique @GeneratedValue Id.
    
   

### EER Diagram: 


![EER Diagram1](https://github.com/h3rs8/form/assets/77108746/d1e3d033-1315-4957-8eb1-e3a72181fcff)



    




