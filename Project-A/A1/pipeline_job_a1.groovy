pipelineJob('Project-A/A1/pipeline_job_a1') {
  definition {
    cpsScmFlowDefinition {
      scm {
        gitSCM {
          userRemoteConfigs {
            userRemoteConfig {
              credentialsId('')
              name('')
              refspec('')
              url('https://github.com/abhijeetatmindstix/pipelinejob.git')
            }
          }
          branches {
            branchSpec {
              name('*/main')
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
      scriptPath('a1_job.jenkins')
      lightweight(true)
    }
  }
}
