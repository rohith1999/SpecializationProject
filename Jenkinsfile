pipeline {
<<<<<<< HEAD
agent any
tools {
maven 'maven3'
}
stages{
stage('Build'){
steps{
sh script: 'mvn clean package'
}
}
stage('Upload War To Nexus'){
steps{
nexusArtifactUploader artifacts:[
[
artifactId: 'SpringBootRest-3',
classifier: '',
file: "target/SpringBootRest-3-0.0.1-SNAPSHOT.jar",
type: 'jar'
]
],
credentialsId: '623a7bba-d3ad-4186-9ff7-62c633b5722c',
groupId: 'com.th',
nexusUrl: '18.191.187.43:8081',
nexusVersion: 'nexus3',
protocol: 'http',
repository: 'Main',
version: '0.0.1-SNAPSHOT'
}
}
}
}
=======
    agent any
    tools {
         maven 'maven3'
    }
    stages{
        stage('Build'){
            steps{
                  sh script: 'mvn clean package'
            }
        }
        stage('Upload War To Nexus'){
            steps{ 
               nexusArtifactUploader artifacts: [
                 [
                   artifactId: 'SpringBootRest-3',
                   classifier: '',
                   file: 'target/SpringBootRest-3-0.0.1-SNAPSHOT.jar',
                   type: 'jar'
                 ]
               ],
                 credentialsId: '623a7bba-d3ad-4186-9ff7-62c633b5722c',
                 groupId: 'com.th',
                 nexusUrl: '18.218.254.57:8081',
                 nexusVersion: 'nexus3',
                 protocol: 'http', 
                 repository: 'Main', 
                 version: '0.0.1-SNAPSHOT'
            }
        }
    }
 }
>>>>>>> branch 'master' of https://github.com/rohith1999/SpecializationProject.git
