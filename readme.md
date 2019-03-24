Travel API mock 
===============

[![Build Status](https://drone.io/bitbucket.org/afklmdevnet/simple-travel-api-mock/status.png)](https://drone.io/bitbucket.org/afklmdevnet/simple-travel-api-mock/latest)

Clone this repo and start the mock:

`mvn clean install` for clean and build

Run SimpleTravelApiBootStrap main file to start the application

The mock resources are protected and require authentication through OAuth 2 to gain access. The following credentials can be used to connect to the service:
 
- client-id: travel-api-client
- secret: psw
 
The OAuth2 grant type required to retrieve a token is **'client_credentials'**.
 
The OAuth2 token endpoint after startup is:
 
`http://localhost:8080/oauth/token`
 
Resource endpoints:
-------------------

**Retrieve a list of airports**:

`http://localhost:8080/airports`

Query params:

- size: the size of the result
- page: the page to be selected in the paged response
- lang: the language, supported ones are nl and en
- term: A search term that searches through code, name and description.

**Retrieve a specific airport**:

`http://localhost:8080/airports/{code}`

Query params:

- lang: the language, supported ones are **nl** and **en**

**Retrieve a fare offer**:

`http://localhost:8080/fares/{origin_code}/{destination_code}`

Query params:

- currency: the requested resulting currency, supported ones are EUR and USD
 

