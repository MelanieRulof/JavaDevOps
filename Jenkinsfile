pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh '/home/isika/JavaDevOps.git/JavaDevOps/mvnw clean package'
            }
        }
        stage('Test') {
            steps {
                sh '/home/isika/JavaDevOps.git/JavaDevOps/mvnw test'
            }
        }
        stage('Archive') {
            steps {
                archiveArtifacts 'target/*.jar'
            }
        }
    }
}
