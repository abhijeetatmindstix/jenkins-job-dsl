pipelineJob('Project-C/C1/C1.1/pipeline_job_c1_1') {
  definition {
    cpsScmFlowDefinition {
      scm {
        gitSCM {
          userRemoteConfigs {
            userRemoteConfig {
              credentialsId('')
              name('')
              refspec('')
              url('https://github.com/abhijeetatmindstix/jenkins-job-dsl.git')
            }
          }
          branches {
            branchSpec {
              name('*/pipeline-c1.1')
            }
          }
          browser {
            gitWeb {
              repoUrl('')
            }
          }
          gitTool('')
        }
      }
      scriptPath('Jenkinsfile')
      lightweight(true)
    }
  }
}
