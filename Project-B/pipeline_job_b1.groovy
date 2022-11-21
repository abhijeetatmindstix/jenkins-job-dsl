pipelineJob('JobDSL/Project-B/pipeline_job_b1') {
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
      scriptPath('b1_job.jenkins')
      lightweight(true)
    }
  }
}
