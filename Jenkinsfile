pipeline {
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
        stage('Upload Jar To Nexus'){
            steps{ 
               nexusArtifactUploader artifacts: [
                 [
                   artifactId: 'SpringBootRest-3',
                   classifier: '',
                   file: 'target/SpringBootRest-3-0.0.1-SNAPSHOT.jar',
                   type: 'jar'
                 ]
               ],
                 credentialsId: 'df6ef40d-abef-478d-b773-74d09faa6ed1',
                 groupId: 'com.th',
                 nexusUrl: '3.144.79.51:8081',
                 nexusVersion: 'nexus3',
                 protocol: 'http', 
                 repository: 'Main', 
                 version: '0.0.1-SNAPSHOT'
            }
        }
    }
 }
