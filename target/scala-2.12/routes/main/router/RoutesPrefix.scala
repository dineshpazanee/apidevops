
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/dinesh/Documents/devlopment/apidevops/apidevops-git/apidevops/conf/routes
// @DATE:Sun Oct 15 22:10:20 IST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
