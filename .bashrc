alias git="hub"
alias gin="git init"
hub config --global user.email "maderkse@gmail.com"
hub config --global user.name "maderkse"
export GITHUB_TOKEN=`cat ../usr/share/git-core/github.pat`
eval "$(ssh-agent -s)"
