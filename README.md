# github_to_jenkins
In this repository I practice on CI/CD pipelines using Jenkins, integrated with a GitHub repository.
I am using my personal laptop and not a remote server accessible via the Internet, therefore I used smee.io as a proxy to redirect the requests from GitHub to my localhost's Jenkins server. The source was this article: https://dev.to/cwprogram/github-webhooks-to-local-jenkins-instance-with-smee-ca3

## Installing and running the SMEE client
```
# npm install -g smee-client
# smee -u https://smee.io/k4vlleYXy80iNtR4 (or smee -u https://smee.io/k4vlleYXy80iNtR4 --path /github-webhook/ --port 8080)
```
