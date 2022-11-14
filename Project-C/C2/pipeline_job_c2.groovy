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
              url('https://github.com/SumeetBandgar/Job_DSL.git')
            }
          }
          branches {
            branchSpec {
              name('*/pipeline-c2')
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
