The following needs to be configured before starting the servers.

- Port Offset: 
 - WSO2 APIM 2.0.0: 0
 - WSO2 ESB 5.0.0: 1
 - WSO2 DSS 3.5.1: 2

- Setup Oracle JDK 1.8.*
- Install mysql in the machine where you are planning to run the above WSO2 products and setup up the "root" user's password as "root".
- Put the compatible mysql jdbc driver in <DSS_HOME>/repository/components/lib folder.
- Copy the brs-airplanes-1.0.0.jar and brs-pilots-1.0.0.jar to <ESB_HOME>/repository/components/lib folder.
- Start the microservice (microservice-1.0.0.jar) with the command: "java -jar microservice-1.0.0.jar". This will start the microservice in port 8080.
- Copy the import/export war file from [1] to <APIM_HOME>/repository/deployment/server/webapps folder.
- Start the WSO2 products, i.e., APIM, ESB, DSS servers.
- Upload the car file (capp_1.0.0.car) to both ESB and DSS servers.
- Import demo-api.zip to APIM as mentioned in [1].
- Ensure that after importing the API, it is in published state (if not, change the state to publish).
- Login to the Store and subscribe to the API.
- Now you can either involve the API using the access token obtained by following [2].

Sample JSON Request:
{
	"response": {
		"sector": "103",
		"pilot-hours": 5
	}
}

And the response for this is:
{
  "msg": "Pilot assigned to flight!",
  "code": "200"
}


[1] - https://docs.wso2.com/display/AM200/Migrating+the+APIs+to+a+Different+Environment
[2] - https://docs.wso2.com/display/AM200/Working+with+Access+Tokens
