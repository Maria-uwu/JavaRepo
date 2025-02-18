pipeline {
    agent any
    stages {
        stage('Clonar Repositorio') {
            steps {
                git branch: 'main', url: 'https://github.com/Maria-uwu/JavaRepo.git'
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
        stage('Configurar Git') {
            steps {
                script {
                    env.PATH = "/usr/bin:/usr/local/bin:$PATH"
        }
    }
}
    }
}
