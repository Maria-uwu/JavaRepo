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
                sh 'javac Calculator/*.java' // Compila todas las clases dentro de Calculator
            }
        }
        stage('Ejecutar Aplicación') {
            steps {
                sh 'java Calculator' // Ejecuta la clase principal
            }
        }
    }
}
