import hudson.model.*
import hudson.plugins.sonar.*

// For more info: https://github.com/SonarSource/sonar-scanner-jenkins/tree/master/src/main/java/hudson/plugins/sonar

SonarGlobalConfiguration global = Jenkins.instance.getDescriptor(SonarGlobalConfiguration.class)
SonarInstallation[] installs = global.getInstallations()

installs.each {
	println(it.getName() + " ---> " + it.getServerUrl())
}
