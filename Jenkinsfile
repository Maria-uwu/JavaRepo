pipeline {
    agent any
    stages {
        stage('Clonar Repositorio') {
            steps {
                git 'https://github.com/Maria-uwu/JavaRepo.git'
            }
        }
        stage('Compilar Aplicación') {
            steps {
                sh 'javac Main.java'
            }
        }
        stage('Ejecutar Aplicación') {
            steps {
                sh 'java Main'
            }
        }
    }
}
