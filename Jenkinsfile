pipeline {
    agent any

    stages {
        stage('Clone repository') {
            steps {
                checkout([
                    $class: 'GitSCM',
                    branches: [[name: '*/main']],
                    userRemoteConfigs: [[
                        credentialsId: 'MACLEOHSECOURS',
                        url: 'https://github.com/BlitzcriegGGH/jenkins.git'
                    ]]
                ])
                echo 'Cloning repository...'
            }
        }

        stage('Readfile and print its content') {
            steps {
                echo 'Reading file... and Ready to print its content'
                def lines = Readfile('servers.csv')
                lines.each { line ->
                    echo line
                }
            }
        }

        stage('Build') {
            steps {
                echo 'Building...'
            }
        }

        stage('Test') {
            steps {
                echo 'Testing...'
                sh 'cat servers.csv'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying...'
            }
        }
    }
}