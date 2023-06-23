import mill._, scalalib._

object demo extends  ScalaModule {
  def scalaVersion = "3.3.0"

  def scalacOptions = T {
    Seq("-explain", "-explain-types", "-no-indent", "-deprecation")
  }

  object test extends ScalaTests {
    def testFramework = "utest.runner.Framework"
  }
}
