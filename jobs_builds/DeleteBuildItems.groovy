def jobName = "JOB_NAME"  
def job = Jenkins.instance.getItem(jobName)  
job.getBuilds().each { it.delete() }  
job.nextBuildNumber = 1   
job.save()

// MULTI BRANCH PIPELINE
def branchName = 'BRANCH_NAME'
def job = Jenkins.instance.getItemByFullName(jobName).getBranch(branchName)
job.getBuilds().each { it.delete() }  
job.nextBuildNumber = 1   
job.save()

// Abort
Jenkins.instance
.getItemByFullName("<JOB NAME>")
.getBranch("<BRANCH NAME>")
.getBuildByNumber(<BUILD NUMBER>)
.finish(hudson.model.Result.ABORTED, new java.io.IOException("Aborting build"));
