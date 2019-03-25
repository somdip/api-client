# api-client
The front end client is located under the folder "frontend".

#Installation
- Step 1: You can use any HTTP server for running the front end , for example go to Chrome and install the extension 200 OK. https://chrome.google.com/webstore/detail/web-server-for-chrome/ofhbbkphhbklhfoeikjpcbhemlocgigb

- Step 2: Run the HTTP 200 OK server from chrome extension app page and point the "frontend" folder from the project using the choose folder option.
![image](https://user-images.githubusercontent.com/4983375/54885824-ad319900-4e80-11e9-9c71-06be1db3af24.png)

- Step 3: Complie the spring boot project using mvn clean install and run the server. Once the spring boot server is up and running you can access the client page using http://127.0.0.1:8887(as shown in yellow) This is the client URL. 
![image](https://user-images.githubusercontent.com/4983375/54885901-fd5d2b00-4e81-11e9-8edf-b50c9692a3b7.png)
- Step 4: Hit the login button to generate the access token which is later stored in a local storage and used for every request to authenticate.
- Step 5: Search for the preffered origin and destination as shown in the screenshot .
![image](https://user-images.githubusercontent.com/4983375/54885942-8c6a4300-4e82-11e9-8e5d-2fac2262aa93.png)
- Step 6: Once the preffered source and destination is filled in hit the search option to get the mock fare and airport information
![image](https://user-images.githubusercontent.com/4983375/54885980-d9e6b000-4e82-11e9-8575-0835683062f5.png)

CORS Filter:
-------------------
The following Web Security Configuration and CORS filter has been added under existing package <b>com.afkl.exercises.spring.oauth</b> to allow CORS origin preflight OPTIONS request:-
- CORSConfiguration.java
- CORSFilter.java
- WebSecurityConfiguration.java

Client Development:
-------------------
Vue Js has been used as the client framework . Axios also has been used to send parallel request while requesting for fare and airport information as seperate XHR call to the REST API.

TODO Implementations:
-------------------
- Currently the client does not check for token expiry. This has not been implemented as the 401 unauthorized request must have a Access-Control-Allow-Origin header to allow XHR request to fail with a resonse code(401 in this case) . 
Alternatively you can clear the token from the local storage using chrome browser once the authentication fails for token expiry. Once cleared it will again promt for the login window.
![image](https://user-images.githubusercontent.com/4983375/54886049-dacc1180-4e83-11e9-8544-fa5143eb503f.png)



