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
                sh 'ls -la'  // Para ver los archivos disponibles en Jenkins
                sh 'javac Calculator.java' // Asegura que el archivo se compila correctamente
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
    } // Cierra "stages"
} // Cierra "pipeline"
