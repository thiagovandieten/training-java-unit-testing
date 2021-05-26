pipeline {
    agent {
        docker {
            image 'maven:3.8-openjdk-17'
        }
    }
    parameters {
        string defaultValue: '', description: 'IP of local machine', name: 'ip'
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
        stage('SonarQube analysis') {
            steps {
                withSonarQubeEnv('SonarQube') {
                    sh "mvn sonar:sonar -X -Dsonar.host.url=http://192.168.1.105:9000"
                }
            }
        }
        stage("Quality gate") {
            steps {
                waitForQualityGate abortPipeline: true
            }
        }
    }
}