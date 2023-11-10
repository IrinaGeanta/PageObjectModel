package tests;

public class GitResetTutorial {

    /*
    1. Cum mutam un fisier din stagin area in working directory

    git reset

    2. Cum sterg ultimul commit facut pe local repository

    git reset HEAD^

    3. Cum sterg mai multe commituri din local repository

    git reset HEAD~2

    4. Care sunt optiunile cand stergem pentru fisiere
    soft --> sterge commitul si muta fisierele in staging area

    git reset --soft commit_id

    mixed --> sterge commitul si muta fisierele in workind directory // dc nu specificam nicio optiune git ruleaza cu optiunea mixed

    git reset --mixed commit_id

    hard --> sterge commitul si fisierele // se foloseste la stergerea unui merge de obicei

    git reset --hard commit_id

    5. Cum sterg un merge(merge-ul este un commit)

    git reset --hard commit_id // dc nu vreau sa tin fisierele pe master, ele raman pe branch-ul de unde au  venit
    //dc vreau ca fisierele sa ramana si pe master execut cu --soft sau --mixed

    6. Cum sterg un commit de pe remote repository?

 -- sterg doar de pe remote si pastrez pe local
 git push origin +HEAD^:master

--sterg si de pe local si de pe remote
git reset HEAD^
git push origin +HEAD





     */
}
