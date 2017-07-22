# Full Stack Application
##Application_Server
1.It is spring application developed by springboot 

##Application_UI
1.It is developed by vue.js and bootstrap 

##Application_API_TEST
1.it is developed by using rest assured job 

##Application_UI_TEST
1.It is developed by selenium automation framework 
##Application_CI
1.It is developed by groovy through jenkinFile 
##Application_CLOUD
-it is developed by docker 


//****************************************************

Selenium Grid

On Server machine run command 

java -jar seleniumstandalone**.jar -role hub -port 4444

-it will run server on 4444 port 

On Client machine 

java -jar seleniumstandalone.jar -role node -hub http://serverip:4444/grid/register -port 5555

-it will run client on this port 5555


parallel need to done by testng xml 


classes
methods
tests



step to start jenkin 
-download updated jenkin.war file 
 
 
 java -Dhudson.util.ProcessTree.disable=true -jar jenkins.war --httpPort=8090 


within 1 hour

  webservice(spring)
 , UI(vue.js)
  ,deployment()
  ,selelenium automation
  ,api automation 
  ,dockerize application
  ,jenkins with docker deployment 
  ,swarm mode delopyment with load balancer
