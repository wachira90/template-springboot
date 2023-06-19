pipeline {
    agent { 
        docker { 
            image 'maven:3.9.2-eclipse-temurin-8-alpine' 
        } 
    }
    stages {
        
        stage('show version') {
            steps {
                sh 'mvn --version'
            }
        }

        stage('maven clean') {
            steps {
                sh 'mvn clean'
            }
        }
        
        stage('show current directory') {
            steps {
                sh 'pwd'
            }
        }
        
        stage('show list dir') {
            steps {
                sh 'ls -la'
            }
        }
        
    }
}
