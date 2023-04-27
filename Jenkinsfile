pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh './mvnw'
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
