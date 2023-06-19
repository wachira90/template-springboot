pipeline {
    agent {
        docker {
            image 'maven:3.9.2-eclipse-temurin-20-alpine'
//            args '-v $HOME/.jenkins/workspace/maven-3.9.2-20-alpine/template-springboot/:/root/app/:rw  -w /root/app'
//            args '-v $HOME/.jenkins/workspace/JAVA-MAVEN-BUILD/:/root/app/:rw'
        }
    }
    
    stages {
        stage('list') {
            steps {
                sh 'mvn -version'
//                sh 'cd $(pwd)/template-springboot/'
                sh 'ls -la'
            }
        }
        
        stage('Build') {
            steps {
                sh 'mvn -version'
            }
        }

    }
}
