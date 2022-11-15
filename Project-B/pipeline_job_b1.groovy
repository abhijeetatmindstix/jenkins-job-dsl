pipelineJob('jobDSL/Project-B/pipeline_job_b1') {
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
              name('*/pipeline-b1')
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
