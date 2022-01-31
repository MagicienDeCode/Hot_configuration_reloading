package xiang.fr.conf

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ConfApplication

fun main(args: Array<String>) {
    runApplication<ConfApplication>(*args)
}
