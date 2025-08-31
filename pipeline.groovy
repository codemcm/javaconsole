pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
        stage('Clone Repository') {
            steps {
                git branch: 'main', url: 'https://github.com/codemcm/javaconsole.git'
            }
        }
         stage('Compile Java') {
            steps {
                script {
                    bat "javac HelloJava.java" 
                }
                script {
                    bat "java HelloJava" 
                }
            }
        }
    }
}
