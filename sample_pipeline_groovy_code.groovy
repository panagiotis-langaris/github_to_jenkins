pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building the project...'
                // Add build commands here
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
                // Add test commands here
            }
        }

        // You can add more stages as needed
    }

    post {
        success {
            echo 'Build and tests passed! Deploying...'
            // Add deployment commands here
        }

        failure {
            echo 'Build or tests failed! Not deploying.'
            // Add cleanup or notification commands here
        }
    }
}
