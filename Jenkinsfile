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
                 nexusUrl: '18.217.145.84:8081',
                 nexusVersion: 'nexus3',
                 protocol: 'http', 
                 repository: 'Main', 
                 version: '0.0.1-SNAPSHOT'
            }
        }
    }
 }
