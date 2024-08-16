pipeline {
    agent any

    stages {
        stage('git checkout') {
            steps {git branch: 'main', url: 'https://github.com/yashighokar1412/Task-Master-Pro.git'
                
            }
        }
        stage('maven validate') {
            steps {withMaven(globalMavenSettingsConfig: '', jdk: '', maven: 'MAVEN_HOME', mavenSettingsConfig: '', traceability: true) {
                sh 'mvn validate'
             }
         }
              stage('maven compile') {
            steps {withMaven(globalMavenSettingsConfig: '', jdk: '', maven: 'MAVEN_HOME', mavenSettingsConfig: '', traceability: true) {
                sh 'mvn compile'
        }
                  }
              }
            
        }}}
