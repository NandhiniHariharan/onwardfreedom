2024-05-19 13:01:12.699 [info] Log level: Info
2024-05-19 13:01:12.699 [info] Validating found git in: "C:\Program Files\Git\cmd\git.exe"
2024-05-19 13:01:13.648 [info] Using git "2.45.1.windows.1" from "C:\Program Files\Git\cmd\git.exe"
2024-05-19 13:02:14.103 [info] > git clone https://github.com/NandhiniHariharan/onwardfreedom.git d:\coding\onwardfreedom --progress [9117ms]
2024-05-19 13:02:14.103 [info] Cloning into 'd:\coding\onwardfreedom'...
remote: Enumerating objects: 3, done.        
remote: Counting objects:  33% (1/3)        
remote: Counting objects:  66% (2/3)        
remote: Counting objects: 100% (3/3)        
remote: Counting objects: 100% (3/3), done.        
remote: Compressing objects:  50% (1/2)        
remote: Compressing objects: 100% (2/2)        
remote: Compressing objects: 100% (2/2), done.        
remote: Total 3 (delta 0), reused 0 (delta 0), pack-reused 0        
Receiving objects:  33% (1/3)
Receiving objects:  66% (2/3)
Receiving objects: 100% (3/3)
Receiving objects: 100% (3/3), done.
2024-05-19 13:02:45.748 [info] Log level: Info
2024-05-19 13:02:45.750 [info] Validating found git in: "C:\Program Files\Git\cmd\git.exe"
2024-05-19 13:02:46.144 [info] Using git "2.45.1.windows.1" from "C:\Program Files\Git\cmd\git.exe"
2024-05-19 13:02:50.513 [info] > git rev-parse --show-toplevel [1918ms]
2024-05-19 13:02:52.176 [info] > git rev-parse --git-dir --git-common-dir [1556ms]
2024-05-19 13:02:52.538 [info] Open repository: d:\coding\onwardfreedom
2024-05-19 13:02:55.996 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [2537ms]
2024-05-19 13:02:56.010 [warning] ENOENT: no such file or directory, open 'd:\coding\onwardfreedom\.git\refs\remotes\origin\main'
2024-05-19 13:02:56.064 [info] > git check-ignore -v -z --stdin [2289ms]
2024-05-19 13:02:56.072 [info] > git config --get commit.template [3229ms]
2024-05-19 13:02:56.074 [info] > git show --textconv :README.md [2986ms]
2024-05-19 13:02:56.150 [info] > git ls-files --stage -- D:\coding\onwardfreedom\README.md [3005ms]
2024-05-19 13:02:56.418 [info] > git cat-file -s 8faefa67c6736b1e6be2a7345547772cb471df68 [258ms]
2024-05-19 13:02:56.525 [info] > git rev-parse refs/remotes/origin/main [515ms]
2024-05-19 13:02:56.732 [info] > git status -z -uall [193ms]
2024-05-19 13:02:58.965 [info] > git merge-base refs/heads/main refs/remotes/origin/main [2177ms]
2024-05-19 13:02:59.024 [info] > git config --get commit.template [2110ms]
2024-05-19 13:02:59.070 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [1547ms]
2024-05-19 13:02:59.091 [warning] ENOENT: no such file or directory, open 'd:\coding\onwardfreedom\.git\refs\remotes\origin\main'
2024-05-19 13:02:59.236 [info] > git config --local branch.main.github-pr-owner-number [930ms]
2024-05-19 13:02:59.237 [warning] git config failed: Failed to execute git
2024-05-19 13:02:59.526 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [503ms]
2024-05-19 13:02:59.637 [info] > git rev-parse refs/remotes/origin/main [546ms]
2024-05-19 13:03:00.180 [info] > git diff --name-status -z --diff-filter=ADMR 9db623660233bfb1d842b43edf0b04c389aa8fa9...refs/remotes/origin/main [628ms]
2024-05-19 13:03:00.192 [info] > git status -z -uall [536ms]
2024-05-19 13:03:46.003 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [451ms]
2024-05-19 13:03:46.012 [warning] ENOENT: no such file or directory, open 'd:\coding\onwardfreedom\.git\refs\remotes\origin\main'
2024-05-19 13:03:46.058 [info] > git config --get commit.template [530ms]
2024-05-19 13:03:46.246 [info] > git rev-parse refs/remotes/origin/main [233ms]
2024-05-19 13:03:46.540 [info] > git status -z -uall [280ms]
2024-05-19 13:06:40.807 [info] > git merge-base refs/heads/main refs/remotes/origin/main [658ms]
2024-05-19 13:06:41.257 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [427ms]
2024-05-19 13:07:53.028 [info] > git config --local branch.main.github-pr-owner-number [447ms]
2024-05-19 13:07:53.028 [warning] git config failed: Failed to execute git
2024-05-19 13:08:03.442 [info] > git add -A -- . [671ms]
2024-05-19 13:08:03.822 [info] > git config --get commit.template [369ms]
2024-05-19 13:08:03.861 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [398ms]
2024-05-19 13:08:03.871 [warning] ENOENT: no such file or directory, open 'd:\coding\onwardfreedom\.git\refs\remotes\origin\main'
2024-05-19 13:08:04.056 [info] > git rev-parse refs/remotes/origin/main [185ms]
2024-05-19 13:08:04.269 [info] > git status -z -uall [204ms]
2024-05-19 13:08:05.469 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [1135ms]
2024-05-19 13:08:05.469 [info] Author identity unknown

*** Please tell me who you are.

Run

  git config --global user.email "hariharannandi@gmail.com"
  git config --global user.name "NandhiniHariharan"

to set your account's default identity.
Omit --global to set the identity only in this repository.

fatal: no email was given and auto-detection is disabled
2024-05-19 13:08:05.489 [info] > git ls-files --stage -- D:\coding\onwardfreedom\README.md [640ms]
2024-05-19 13:08:06.277 [info] > git config --get-all user.name [788ms]
2024-05-19 13:08:06.356 [info] > git cat-file -s 4a102cb8528f8c342d9b3a2f92a58a293acc1f55 [830ms]
2024-05-19 13:08:07.273 [info] > git config --get commit.template [963ms]
2024-05-19 13:08:07.352 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [1008ms]
2024-05-19 13:08:07.372 [warning] ENOENT: no such file or directory, open 'd:\coding\onwardfreedom\.git\refs\remotes\origin\main'
2024-05-19 13:08:07.410 [info] > git show --textconv :README.md [1025ms]
2024-05-19 13:08:08.176 [info] > git rev-parse refs/remotes/origin/main [804ms]
2024-05-19 13:08:08.302 [info] > git ls-files --stage -- D:\coding\onwardfreedom\README.md [842ms]
2024-05-19 13:08:08.922 [info] > git status -z -uall [731ms]
2024-05-19 13:08:09.666 [info] > git cat-file -s 4a102cb8528f8c342d9b3a2f92a58a293acc1f55 [1354ms]
2024-05-19 13:08:09.903 [info] > git show --textconv :README.md [213ms]
2024-05-19 13:09:43.705 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [684ms]
2024-05-19 13:09:43.705 [info] Author identity unknown

*** Please tell me who you are.

Run

  git config --global user.email "you@example.com"
  git config --global user.name "Your Name"

to set your account's default identity.
Omit --global to set the identity only in this repository.

fatal: no email was given and auto-detection is disabled
2024-05-19 13:09:44.153 [info] > git config --get-all user.name [423ms]
2024-05-19 13:09:44.797 [info] > git config --get commit.template [619ms]
2024-05-19 13:09:44.820 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [632ms]
2024-05-19 13:09:44.834 [warning] ENOENT: no such file or directory, open 'd:\coding\onwardfreedom\.git\refs\remotes\origin\main'
2024-05-19 13:09:45.250 [info] > git rev-parse refs/remotes/origin/main [417ms]
2024-05-19 13:09:45.601 [info] > git status -z -uall [337ms]
