pipeline {
    agent {
        docker {
            image 'maven:3.9.2-eclipse-temurin-20-alpine'
            args '--network=host'
        }
    }
    stages {
        stage('check environment') {
            steps {
                sh 'mvn -version'
                sh 'ls -la'
            }
        }
        stage('check version') {
            steps {
                sh 'mvn -version'
                sh 'java -version'
            }
        }
        stage('mvn clean') {
            steps {
                sh 'mvn -Dmaven.repo.local=./.m2/repository clean -X'
            }
        }
        stage('mvn install') {
            steps {
                sh 'mvn -Dmaven.repo.local=./.m2/repository install -X'
            }
        }
        stage('success') {
            steps {
                sh 'echo success'
            }
        }
        
    }
}
