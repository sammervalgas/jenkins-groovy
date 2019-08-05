import jenkins.model.*
import hudson.plugins.sonar.*
import hudson.plugins.sonar.model.*
import hudson.model.*

def instance = Jenkins.getInstance()
SonarGlobalConfiguration global = instance.getDescriptorByType(SonarGlobalConfiguration.class)
//SonarGlobalConfiguration global = Hudson.instance.getDescriptorByType(SonarGlobalConfiguration.class)

//GlobalConfiguration.all().each{
//	println(it.getId())
//}

def sonarInstall = new SonarInstallation(
  "Sonar Corp",
  "http://localhost:9000/",
  null, // CredentialsId
  "3.2", //  Version of sonar-maven-plugin
  "", // Server authentication token
  new TriggersConfig(),
  ""
)
global.setInstallations(sonarInstall)
global.save()
