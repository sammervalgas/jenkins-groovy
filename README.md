Jenkins groovy
================

Docker Jenkins App
----------------
##### Run docker image jenkins to make the tests.
<span style="font-family:Calibri; font-size:4em; font-color: red;">Doing pull</span>
```bash
docker pull jenkins/jenkins:lts

docker run -d -i -t \ 
--name jenkins-sample \ 
-p 8080:8080 -p 50000:50000 \ 
-v /tmp/jenkins_home:/var/lib/jenkins_home \ 
-e "JAVA_OPTS=-Djenkins.install.runSetupWizard=false" \ 
jenkins/jenkins:lts

```
|  _Name_  |_Description_|
|:--------|:--------|
|  ***-d*** | (--detached) Run container in background and print container ID |
|  ***-i*** | (--interactive) Keep STDIN open even if not attached|
|  ***-t*** | (--tty) Allocate a pseudo-TTY |
| ***--name jenkins-sample***  | Define the name of container  |
| ***-p 8080:8080 -p 50000:50000*** | Container ports - HTTP Port and Slave |
| ***-v /tmp/jenkins_home:/var/lib/jenkins_home*** | Bind mount a volume   |
| ***-e "JAVA_OPTS=-Djenkins.install.runSetupWizard=false"*** | Set Environment container to skip the wizard setup |
-------
