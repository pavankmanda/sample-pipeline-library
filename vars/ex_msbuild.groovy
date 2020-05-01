import org.sample.build.MsBuild
import org.sample.ioc.ContextRegistry

def call(String solutionPath) {
    ContextRegistry.registerDefaultContext(this)

    def msbuild = new MsBuild(solutionPath)
    msbuild.build()
}
