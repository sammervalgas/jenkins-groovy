import jenkins.model.*

def instance = Jenkins.getInstance()

// Proxy settings have been added to environment variables
def env = System.getenv()

final String name = env['proxy_host']
final int port = env['proxy_port'] as Integer
final String userName = env['proxy_user']
final String password = env['proxy_pass']
final String noProxyHost = env['no_proxy']

final def pc = new hudson.ProxyConfiguration(name, port, userName, password, noProxyHost)
instance.proxy = pc
pc.save()
println "Proxy settings updated!"
