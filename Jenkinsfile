pipeline {
    agent any

    tools {
        maven 'Maven'
        jdk 'JDK17'
    }

    stages {

        stage('Clone Repository') {
            steps {
                git 'YOUR_GITHUB_REPOSITORY_LINK'
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
