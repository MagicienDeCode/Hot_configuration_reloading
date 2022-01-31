package xiang.fr.conf

import org.apache.commons.configuration.PropertiesConfiguration
import org.apache.commons.configuration.reloading.FileChangedReloadingStrategy
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Configuration
import java.io.File

@Configuration
class ExternalConf(
    @Value("\${your.external.file}") path: String
) {
    private final val configuration: PropertiesConfiguration

    init {
        configuration = PropertiesConfiguration(File(path))
        val strategy = FileChangedReloadingStrategy()
        strategy.refreshDelay = 5000
        configuration.reloadingStrategy = strategy
    }

    fun getUpload() = configuration.getBoolean("upload")
}
