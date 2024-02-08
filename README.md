# github_to_jenkins
In this repository I practice on CI/CD pipelines using Jenkins, integrated with a GitHub repository.
I am using my personal laptop and not a remote server accessible via the Internet, therefore I used smee.io as a proxy to redirect the requests from GitHub to my localhost's Jenkins server. The source was this article: https://dev.to/cwprogram/github-webhooks-to-local-jenkins-instance-with-smee-ca3

## Installing and running the SMEE client

SMEE is a webhook payload delivery service. It receives payloads then sends them to your locally running application.
![smee](https://github.com/panagiotis-langaris/github_to_jenkins/assets/16323614/e485c577-9e22-46a4-a4a8-8e4b08f08ffd)

```
# npm install -g smee-client
# smee -u https://smee.io/k4vlleYXy80iNtR4 (or smee -u https://smee.io/k4vlleYXy80iNtR4 --path /github-webhook/ --port 8080)
```
# Notes on Jenkins
You can see the local workspaces in folder `C:\ProgramData\Jenkins\.jenkins\workspace`

## Sources
https://dev.to/cwprogram/github-webhooks-to-local-jenkins-instance-with-smee-ca3
https://dilpreetj.medium.com/jenkins-github-integration-with-selenium-python-fe5f677fa4c3
