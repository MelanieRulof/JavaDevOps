pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'maven'
            }
        }
        stage('Test') {
            steps {
                sh 'test'
            }
        }
        stage('Archive') {
            steps {
                archiveArtifacts 'target/*.jar'
            }
        }
    }
}
