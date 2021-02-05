package com.gv.recycle.data

data class Repository (
    val userNameRepository: String,
    val surNameRepository: String,
    val repositoryNameRepository: String,
    val repositoryTextRepository: String,
    val starIconRepository: Boolean,
    val gitIconRepository: Boolean,
    val numberGitRepository: String,
    val numberStarRepository: String,
    val imageIconRepository: Boolean
        )

class RepositoryBuilder{
    var userNameRepository: String = ""
    var surNameRepository: String =""
    var repositoryNameRepository: String= ""
    var repositoryTextRepository: String=""
    var starIconRepository : Boolean= false
    var gitIconRepository: Boolean= false
    var numberGitRepository: String=""
    var numberStarRepository:String=""
    var imageIconRepository:Boolean= false
    fun build(): Repository= Repository(userNameRepository, surNameRepository, repositoryNameRepository, repositoryTextRepository, starIconRepository, gitIconRepository, numberGitRepository, numberStarRepository, imageIconRepository)

}
fun repository(block: RepositoryBuilder.()-> Unit): Repository = RepositoryBuilder().apply(block).build()

fun fakeRepository() :MutableList<Repository> = mutableListOf(
repository {
    userNameRepository="victor"
    surNameRepository="andrade"
    repositoryNameRepository="batata"
    repositoryTextRepository="batata é bom com uqwerhwqguiegbqw qweuoiwqgueigqw quwegbwq ue"
    starIconRepository = true
    starIconRepository=true
    numberGitRepository="55"
    numberStarRepository="6587"
    imageIconRepository=true
},
    repository {
        userNameRepository="amanda"
        surNameRepository="andrade"
        repositoryNameRepository="batata"
        repositoryTextRepository="batata é bom com uqwerhwqguiegbqw qweuoiwqgueigqw quwegbwq ue"
        starIconRepository = true
        starIconRepository=true
        numberGitRepository="55"
        numberStarRepository="6587"
        imageIconRepository=true
    }

)