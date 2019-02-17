<<<<<<< HEAD
PS1='${PWD/*\//}$'
alias gbr="git branch"
alias gch="git checkout"
alias ll="ls -altr"
alias jc="ecj"
alias gst="git status"
alias gad="git add"
alias gad.="git add ."
alias gco="git commit"
alias gcm="git commit -m"
alias gin="git init"
alias gre="git reset"
alias gcl="git clean"
alias git="hub"
export PATH=$PATH:~/scripts
=======
alias git="hub"
alias gin="git init"
hub config --global user.email "maderkse@gmail.com"
hub config --global user.name "maderkse"
export GITHUB_TOKEN=`cat ../usr/share/git-core/github.pat`
eval "$(ssh-agent -s)"
>>>>>>> 7a4eea5b2ca95e66be28c9c0483bb94a3e4c2a82
