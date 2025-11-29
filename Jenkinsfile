pipeline {
    agent any

    tools {
        jdk 'Java17'
        maven 'Maven3'
    }

    environment {
        SONAR_PROJECT_KEY = 'ci-cd-demo'
        SONAR_URL = 'http://localhost:9000'
        SONAR_TOKEN = credentials('jenkins-token')
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/umar009-farooq/ci-cd-demo.git'
            }
        }

        stage('Build') {
            steps {
                sh "mvn clean package -DskipTests=false"
            }
        }

        stage('SonarQube Analysis') {
            steps {
                sh """
                mvn sonar:sonar \
                    -Dsonar.projectKey=$SONAR_PROJECT_KEY \
                    -Dsonar.host.url=$SONAR_URL \
                    -Dsonar.token=$JENKINS_TOKEN
                """
            }
        }
    }
}
