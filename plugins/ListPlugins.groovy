def pluginList = []
Jenkins.instance.pluginManager.plugins.each{
	plugin -> 
  	pluginList.add("${plugin.getShortName()}:${plugin.getVersion()}")
}

def sorted = pluginList.sort()
sorted.each{
  plugin ->
  println(plugin)
}
