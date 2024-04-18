def newGit(repo)
{
 git "${repo}"
}
def newMaven()
{
 sh 'mvn package'
}
def newDeploy(ip,appname)
{
deploy adapters: [tomcat9(credentialsId: '441b732f-3d44-4f64-b2d4-bf52559dc36b', path: '', url:"${ip}")], contextPath:"${appname}", war: '**/*.war'
}
def newTesting(jobname)
{
sh "java -jar /home/ubuntu/.jenkins/workspace/${jobname}/testing.jar"
}

