pipeline {
    agent {
        node {
            label 'maven'
        }
    }

    stages {
        stage('clone-code') {
            steps {
                git branch: 'main', url: 'https://github.com/vishalkumar392392/ci-cd-2.git'
            }
        }
    }
}
