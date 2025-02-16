import org.gradle.api.Project
import org.gradle.api.plugins.JavaPluginExtension
import org.gradle.kotlin.dsl.configure

internal class JavaAppyxPublishPlugin : ProjectPlugin() {
    override fun configureDocAndSources(project: Project) {
        project.configure<JavaPluginExtension> {
            withJavadocJar()
            withSourcesJar()
        }
    }

    override fun getComponentName(): String = "java"
}
