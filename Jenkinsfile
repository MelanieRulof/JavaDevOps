pipeline {
    agent any

    tools {
        // Install the Maven version configured as "maven" and add it to the path.
        maven "maven"
    }

  stages {
        stage('Build, Test and Package') {
            steps {
                // Run Maven on a Unix agent.
                sh "mvn -Dmaven.test.failure.ignore=true clean package"
            }
            post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                always {
                    junit (
                        allowEmptyResults:true,
                        testResults: '*test-reports/.xml'
                    )
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
        stage('Build Docker image') {
            steps {
                sh 'docker build -f Dockerfile-java-v2 -t demonshrous/docker-java-devops:pipeline .'
            }
        }
        stage('Push image on Docker registry') {
            steps {
                sh 'docker login -u demonshrous -p IsikaAL21'
                sh 'docker push demonshrous/docker-java-devops:pipeline'
            }
        }
    }
}
