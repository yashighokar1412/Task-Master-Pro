pipeline {
    agent any
tools {
    maven 'MAVEN_HOME'
}
    stages {
        stage('git checkout') {
            steps {git branch: 'main', url: 'https://github.com/yashighokar1412/Task-Master-Pro.git'
                
            }
        }
        stage('maven validate') {
            steps {
                sh 'mvn validate'
             }
         }
              stage('maven compile') {
            steps {
                sh 'mvn compile'
        }
              }
              stage('maven test') {
                steps {
                    sh 'mvn test'
              }
        }
         stage('maven package') {
                steps {
                    sh 'mvn package'
              }
        }
         stage('sonar scan') {
                steps {withSonarQubeEnv(credentialsId: 'sonar',installationName:'sonar') {
                    sh 'mvn package sonar:sonar'
        
    }}}}}
