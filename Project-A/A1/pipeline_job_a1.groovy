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
              url('https://github.com/SumeetBandgar/Job_DSL.git')
            }
          }
          branches {
            branchSpec {
              name('*/pipeline-a1')
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
