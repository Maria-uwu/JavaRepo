pipeline {
    agent any


    /*triggers {
        cron('* * * * *')  // Ejecuta el pipeline cada minuto
    }*/

    environment {
        NUM_FILE = "/tmp/number.txt"
    }




    stages {

        stage('Imprimir Número') {
            steps {
                script {
                    def num = 1

                    // Si el archivo existe, leer el número actual
                    if (fileExists(env.NUM_FILE)) {
                        num = readFile(env.NUM_FILE).trim().toInteger() + 1
                    }

                    // Imprimir número en la consola
                    echo "Número actual: ${num}"

                    // Guardar el nuevo número para la próxima ejecución
                    writeFile(file: env.NUM_FILE, text: "${num}")
                }
            }
        }

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
        stage('Run Tests') {
            steps {
                sh 'mvn test'
    }
}

    } // Cierra "stages"
} // Cierra "pipeline"
