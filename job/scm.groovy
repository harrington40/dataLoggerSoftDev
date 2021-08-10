job('Test-SCM') {
    description 'Build and test the app.'
    scm {
        github 'git@github.com:harrington40/Automation.git'
    }
    steps {
        gradle 'test'
    }
    publishers {
        archiveJunit 'build/test-results/**/*.xml'
    }
}
        