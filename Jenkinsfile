pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                checkout({
                    $class: 'GitSCM',
                    branches: [[name: '*/main']],
                    doGenerateSubmoduleConfigurations: false,
                    extensions: [],
                    submoduleCfg: [],
                    userRemoteConfigs: [[
                        credentialsId: 'MACLEOHSECOURS',
                        url: 'https://github.com/BlitzcriegGGH/jenkins.git'
                    ]]
                })
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