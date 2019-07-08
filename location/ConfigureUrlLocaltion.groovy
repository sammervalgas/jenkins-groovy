import jenkins.model.*

def params = [
  email:  'Devops Jenkins <devops@jenkins.com>',
  url:    'http://my.jenkins.host:8080/'
]

def urlConf = JenkinsLocationConfiguration.get()

urlConf.setUrl(params.url)
urlConf.setAdminAddress(params.email)
urlConf.save()

println("My new Location URL ----> " + Jenkins.instance.getRootUrl())
