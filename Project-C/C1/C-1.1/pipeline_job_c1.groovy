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
      scriptPath('c.1.1_job.jenkins')
      lightweight(true)
    }
  }
}
