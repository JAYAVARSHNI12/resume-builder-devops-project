pipeline {

    agent any

    tools {
        maven 'Maven'
        jdk 'JDK21'
    }

    stages {

        stage('Clone Repository') {

            steps {

                git branch: 'main',
                url: 'https://github.com/JAYAVARSHNI12/resume-builder-devops-project.git'

            }
        }

        stage('Build Application') {

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

                bat 'docker rm -f resume-container || exit 0'
                bat 'docker run -d -p 2024:2024 --name resume-container resume-builder-app'

            }
        }
    }
}
