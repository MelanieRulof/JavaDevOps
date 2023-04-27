pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh './mvn'
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
