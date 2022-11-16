pipelineJob('Project-C/C2/pipeline_job_c2') {
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
      scriptPath('c2_job.jenkins')
      lightweight(true)
    }
  }
}
