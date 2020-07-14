pipeline {
  agent any
  stages {
    stage('compile') {
      steps {
          try {
              sh './gradlew compileJava'
          } 
      }
    }

  }
}