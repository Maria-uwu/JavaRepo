pipeline {
    agent any
    stages {
        stage('Clonar Repositorio') {
            steps {
                git 'https://github.com/Maria-uwu/JavaRepo'
            }
        }
        stage('Compilar Aplicación') {
            steps {
                sh 'javac Calculator.java'
            }
        }
        stage('Ejecutar Aplicación') {
            steps {
                sh 'java Calculator'
            }
        }
    }
}
