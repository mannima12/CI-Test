pipeline {
  agent any
  stages {
    stage('compile') {
      steps {
        sh 'gradle compilejava'
      }
    }

    stage('test') {
      steps {
        sh 'gradle test'
      }
    }

    stage('build') {
      steps {
        sh 'gradle --build-cache build'
      }
    }

  }
}