pipeline {
    agent any
    environment {
        // Set environment variables for sample Docker Hub credentials
        DOCKERHUB_USER = 'deepakwaghmare'
        DOCKERHUB_PASSWORD = 'Deep@2580'
    }
    stages {
        stage('Checkout code') {
            steps {
                // Checkout code from GitHub repository
                git 'https://github.com/DeepakWaghmare2580/bookappv1.git'
            }
        }
        stage('Build Spring Boot application') {
            steps {
                // Build the Spring Boot application using Maven
                sh 'mvn clean package'
            }
        }
        stage('Build Docker image') {
            steps {
                // Build the Docker image using the existing Dockerfile
                sh 'docker build -t deepakwaghmare/bookappv1:latest .'
            }
        }
        stage('Push Docker image') {
            steps {
                // Login to Docker Hub using sample credentials
                sh 'echo "${DOCKERHUB_PASSWORD}" | docker login -u "${DOCKERHUB_USER}" --password-stdin'
                // Push the Docker image to Docker Hub
                sh 'docker push deepakwaghmare/bookappv1:latest'
            }
        }
    }
}

