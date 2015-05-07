# rultor-example
[Rultor is a merging bot by teamed.io](http://www.yegor256.com/2014/07/24/rultor-automated-merging.html) that automates testing, merging, deploying and releasing of software on GitHub.
Where typical CI systems like Travis or Jenkins run tests after commits, Rultor will validate your pull-request in a separate container before it ever even reaches the master branch.
By doing this, you can guarantee your master branch will always build, rather than know it's broken after the fact.

It's incredibly simple to get started with, but the official docs can be a little confusing, so this repository provides a clean example of how to use Rultor in various situations.

## Getting started
First up, and very importantly: Make sure [@rultor](https://github.com/rultor) is a collaborator on your repository!
This seems obvious, but is easy to miss.
Collaborators can be found in your repo's settings, like so:
![](https://raw.githubusercontent.com/Winwardo/rultor-example/master/resources/collaborator.png)

Next up, add a [.rultor.yml](https://raw.githubusercontent.com/Winwardo/rultor-example/50ad68589cfc7bc305b0329b076c8a0175c49901/.rultor.yml) file.
Add the main project owner as an architect - this is a group of GitHub users who may confirm merges / deploys / releases made by Rultor. 
Without their permission, Rultor will not perform any actions.

If you're using Java with Maven, or any other widely used language and build system, Rultor is usually clever enough to figure out from there how to build your system.
Check out the Merge section of the [official basic documentation](http://doc.rultor.com/basics.html) for more information.

Once added, find a [pull request](https://help.github.com/articles/using-pull-requests/) you'd like to have merged by Rultor.
Simply write 
> @rultor merge

as a new comment, and that's it: you're done!

## Examples

Look at https://github.com/Winwardo/rultor-example/pull/5 to see a typical usage of Rultor.  
Notice how, since we said "Closes #4" in the PR description, [issue #4 was automatically closed](https://github.com/Winwardo/rultor-example/issues/4) after merge. (This is actually a [feature of GitHub](https://help.github.com/articles/closing-issues-via-commit-messages/), not Rultor!)

In https://github.com/Winwardo/rultor-example/pull/3, see how our original commit actually broke a test.  

Travis wouldn't have caught this until afterwards, but here, Rultor has stopped the faulty code ever reaching `master` until it was proven fixed.

## More

Check out http://doc.rultor.com/ for the official documentation, as well as the recommended blog posts inside.
