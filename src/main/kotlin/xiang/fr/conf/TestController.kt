package xiang.fr.conf

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController(
    val externalConf: ExternalConf
) {
    @GetMapping("/test")
    fun getUpload(): String = externalConf.getUpload().toString()
}
