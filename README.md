# CS-320 Software Test, Automation, and QA – Module Eight Journal

## Project Summary  
For this course, I completed two main projects that focused on **software testing, automation, and quality assurance**.  
- **Project One**: Built a Contact management service in Java with classes (`Contact.java`, `ContactService.java`) and full **JUnit tests** (`ContactTest.java`, `ContactServiceTest.java`).  
- **Project Two**: Wrote a **summary and reflections report** analyzing my testing techniques, code quality, and lessons learned.  

Together, these artifacts show that I can create Java applications, apply unit testing to enforce requirements, and reflect on the effectiveness of different testing strategies.  

## What I Did Well  
I did well creating **positive and negative test cases** that validated both valid and invalid inputs. For example, I confirmed that correct contact information worked while invalid inputs (like null or overly long strings) triggered exceptions. I also made sure my tests aligned directly with requirements — such as ensuring appointment dates could not be in the past.  

I am proud of how I kept my testing **organized and requirement-driven**, proving that each business rule was enforced through code and tests. This structure made it clear what the software should do and gave me confidence that it would behave correctly.  

## Challenges and Growth Areas  
Not everything came easy, but I grew from the challenges:  
- **Edge Cases** – I had to remember to test beyond just normal use, including null values, incorrect lengths, and duplicate IDs.  
- **Bias in Testing** – Since I was testing my own code, I learned to be disciplined and strict. Even if I thought a rule was “obvious,” I still wrote a test for it.  
- **Expanding Techniques** – This course focused on unit testing, but I realized how important **integration, system, regression, and performance testing** would be in larger real-world projects.  

## Ensuring Functionality and Security  
To ensure functionality, I relied heavily on **JUnit unit tests**. These tests confirmed that methods behaved correctly and that invalid data was rejected. Writing both positive and negative tests gave me strong coverage and confidence in my work.  

For security, I focused on **input validation**. By enforcing character limits, requiring non-null values, and preventing duplicate IDs, I ensured that bad data could not enter or break the system. While this course didn’t emphasize advanced security tools, I see how practices like **dependency checks** and **static analysis tools** will fit into my workflow in the future.  

## Interpreting User Needs  
I learned to interpret user needs by **translating requirements into rules and tests**. For example, when the requirement said a phone number must be exactly 10 digits, I wrote a test that failed if the input wasn’t exactly that length. This way, requirements directly shaped my code. My customer service background also helped me understand that requirements are about listening carefully and clarifying expectations.  

## Designing Software  
I approached design in **small, testable steps**. First, I outlined the classes and methods. Then, I wrote unit tests to guide development and confirm each rule was applied. This made the process more manageable and kept me focused on meeting requirements instead of guessing.  

## Tools and Practices Used  
- **JUnit 5** for unit testing  
- **Java** for object and service classes  
- **Test-driven approach**: wrote tests alongside development  
- **Validation rules** to enforce requirements  

## What I Can Show Employers  
From this work, I can show that I know how to:  
- Write **JUnit tests** that prove functionality and catch errors.  
- Apply **requirement-driven development** so software meets user expectations.  
- Enforce **input validation** and data rules for secure, reliable programs.  
- Reflect on challenges and identify **areas for growth** in testing.  
- Approach software design in **organized, testable steps**.  

