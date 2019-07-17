import hudson.FilePath
import hudson.model.Node
import hudson.model.Slave
import jenkins.model.Jenkins
import groovy.time.*

def nodes = Jenkins.instance.nodes

while(1) {
    for (Node node in nodes) {
        // sleep(1000)

        // Make sure slave is online
        if (!node.getComputer().isOffline()) {           
            
            //Make sure that the slave busy executor number is 0.
            if(node.getComputer().countBusy()==0) {
                println "'$node.nodeName' can take jobs !!!"
                return 0
            } else {
                println "$node.nodeName' is busy !!!"
            }
        } else {
            println "'$node.nodeName' is offline !!!" 
        }
    }
   // sleep(1000)
}
