# ATF
automation test framework



#Selenium Grid

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


within 1 hour

  webservice(spring)
 , UI(vue.js)
  ,deployment()
  ,selelenium automation
  ,api automation 
  ,dockerize application
  ,jenkins with docker deployment 
  ,swarm mode delopyment with load balancer
