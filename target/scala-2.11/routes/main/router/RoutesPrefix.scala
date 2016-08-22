
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/si2chip/herokuapp/conf/routes
// @DATE:Mon Aug 22 11:29:42 IST 2016


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
