pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/raviteja4G/Maven_Selenium.git'
            }
        }
        stage('Build') {
            steps {
        sh '''
        pkill chrome || true
        pkill chromedriver || true
        mvn clean test
        '''
    }
        }
        stage('Test') {
            steps {
        sh '''
        mvn clean test -Dheadless=true
        '''
    }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying...'
            }
        }
    }
    post {
        always {
            junit '**/target/surefire-reports/*.xml'
        }
    }
}
