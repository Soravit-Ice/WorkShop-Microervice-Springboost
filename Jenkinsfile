pipeline {
    agent any
    stages {
        stage('1. Pull code') {
            steps {
               git branch: 'main', url: 'https://github.com/Soravit-Ice/WorkShop-Microservice-Springboost.git'
            }
        }
         stage('2. Compile') {
            steps {
                sh './mvnw compile'
            }
         }
    }
}
