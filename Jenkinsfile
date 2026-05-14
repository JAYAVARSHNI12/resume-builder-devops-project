pipeline {
    agent any

    tools {
        maven 'mvn'
        jdk 'JDK21'
    }

    stages {

        stage('Clone Repository') {
            steps {
                git 'https://github.com/JAYAVARSHNI12/resume-builder-devops-project.git'
            }
        }
        stage('Build Project') {
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Verify Artifact') {
            steps {
                bat 'dir target'
            }
        }

        stage('Build Docker Image') {
            steps {
                bat 'docker build -t resume-builder-app .'
            }
        }

        stage('Run Docker Container') {
            steps {
                bat 'docker run -d -p 8080:8080 --name resume-container resume-builder-app'
            }
        }
    }
}
