pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo 'Pulling latest code from repository...'
                git url: 'https://github.com/neerajk555/Declarative-Pipeline-Lab.git', branch: 'main'
            }
        }
        stage('Build') {
            steps {
                echo 'Building the project...'
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
                sh 'mvn test'
            }
        }

        stage('Success') {
            steps {
                echo '✓ Build and tests completed successfully!'
            }
        }
    }
}
