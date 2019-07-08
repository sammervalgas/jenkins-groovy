<style>
table {
    width:100%;
}
</style>

# jenkins-groovy

Start docker like a sample sample.

docker pull jenkins/jenkins:lts
docker run -d -i -t --name jenkins-sample -p 8080:8080 -p 50000:50000 -v /tmp/jenkins_home:/var/lib/jenkins_home -e "JAVA_OPTS=-Djenkins.install.runSetupWizard=false" jenkins/jenkins:lts

|  _NAME_  |_Description_|
|:--------:|:--------|
|  ***-d*** | Run container in background and print container ID |
|  ***-i*** | (--interactive) Keep STDIN open even if not attached|
|  ***-t*** | (--tty) Allocate a pseudo-TTY |
| ***--name jenkins-sample***  | Define the name of container  |
| ***-p 8080:8080 -p 50000:50000*** | Container ports - HTTP Port and Slave |
| ***-v /tmp/jenkins_home:/var/lib/jenkins_home*** | Bind mount a volume   |
| ***-e "JAVA_OPTS=-Djenkins.install.runSetupWizard=false"*** | Set Environment container to skip the wizard setup |



  ***-d*** = Detached

  ***-i*** = interactive
  
  ***-t*** = tty
  
  ***--name jenkins-sample*** = Name of jenkins container 
  
  ***-p 8080:8080 -p 50000:50000*** = HTTP Port and Slave Port definitions
  
  ***-v /tmp/jenkins_home:/var/lib/jenkins_home*** = Volume
  
  ***-e "JAVA_OPTS=-Djenkins.install.runSetupWizard=false"*** This will skip the wizard setup 
