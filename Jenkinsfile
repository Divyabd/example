pipeline{
   agent {
    docker {
      image 'maven:3.6.3-jdk-11'
      args '-v /root/.m2:/root/.m2'
    }
  }
  stages {
          stage("build & SonarQube analysis") {
  
            steps {
              withSonarQubeEnv('sonarcloud') {
                sh 'java -version'
                sh 'mvn clean package sonar:sonar'
              }
            }
          }
    }
}
