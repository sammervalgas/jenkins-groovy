// MultiBranch
Jenkins.instance
.getItemByFullName("<JOB NAME>")
.getBranch("<BRANCH NAME>")
.getBuildByNumber(<BUILD NUMBER>)
.finish(hudson.model.Result.ABORTED, new java.io.IOException("Aborting build"));

// Simple
Jenkins.instance
.getItemByFullName("JobName")
.getBuildByNumber(JobNumber)
.finish(hudson.model.Result.ABORTED,new java.io.IOException("Aborting build"));
