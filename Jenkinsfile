pipeline{
    agent {
        label "jenkins-agent"
    }

    tools{
        jdk 'Java17'
        maven "Maven3"
    }
    environmnent{
        APP_NAME = "Jenkins-Pipeline02-Spring-Boot-project"
        RELEASE = "1.0.0"
        DOCKER_USER = "salindadocker"
        DOCKER_PASS = "dockerhub"
        IMAGE_NAME = "${DOCKER_USER}/${APP_NAME}:${RELEASE}"
        IMAGE_TAG = "${RELEASE} - ${BUILD_NUMBER}"
    }

    stages{

        stage("Clean Workspace"){
            steps{
                cleanWs()
            }
         } 

        stage('Checkout'){
            steps{
                git branch: 'main',credentialsId: 'github', url: 'https://github.com/SalindaGunarathna/Jenkins-Pipeline02-Spring-Boot-project'
            }
        }

        stage('Build'){
            steps{
                sh 'mvn clean package' 
            }
        }

        stage('Test'){
            steps{
                sh 'mvn test' 
            }
        }
        stage('Build & Push Docker Image'){
            
            steps{
                script{
                   docker.withRegistry('', DOCKER_PASS) {
                       docker_image = docker.build("${IMAGE_NAME}")
                   }
                   docker.withRegistry('', DOCKER_PASS) {
                       docker_image.push("${IMAGE_TAG}")
                       docker_image.push("latest")
                   }
                }
            }
        }
    }

}