pipeline {
    agent {
        docker {
            image 'maven:3.9.2-eclipse-temurin-20-alpine'
//            args '-v $HOME/.jenkins/workspace/maven-3.9.2-20-alpine/template-springboot/:/root/app/:rw  -w /root/app'
//            args '-v $HOME/.jenkins/workspace/JAVA-MAVEN-BUILD/:/root/app/:rw'
        }
    }
    
    stages {
        stage('check environment') {
            steps {
                sh 'mvn -version'
//                sh 'cd $(pwd)/template-springboot/'
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
                sh 'mvn clean'
            }
        }

        stage('mvn install') {
            steps {
                sh 'mvn install'
            }
        }

        stage('success') {
            steps {
                sh 'echo success'
            }
        }
        
    }
}
