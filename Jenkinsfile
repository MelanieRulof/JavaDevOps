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
				sh "mvn test"
            }
            post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                
				success {
					echo 'Success !'
				}
                failure {
					echo 'Failure !'
                    mail bcc: '', body: "<b>Test fail</b><br>\n<br>Project: ${env.JOB_NAME} <br>Build Number: ${env.BUILD_NUMBER} <br> URL de build: ${env.BUILD_URL}", cc: '', charset: 'UTF-8', from: '', mimeType: 'text/html', replyTo: '', subject: "ERROR TEST: Project name -> ${env.JOB_NAME}", to: "bancelin.melanie@gmail.com";
                }
            }
        }
        stage('Build Docker image') {
            steps {
                sh 'docker build -f Dockerfile-java-v2 -t melanierulof2/javadocker:pipeline .'
            }
        }
        stage('Push image on Docker registry') {
            steps {
                sh 'docker login -u melanierulof2 -p IsikaAL21'
                sh 'docker push melanierulof2/javadocker:pipeline'
            }
        }
	 stage('Trigger childjob'){
		  steps {
		  buildjob: "JavaDeploy", wait : true
    }
}
