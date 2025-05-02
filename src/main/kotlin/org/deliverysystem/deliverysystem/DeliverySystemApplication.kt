package org.deliverysystem.deliverysystem

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication

@SpringBootApplication
class DeliverySystemApplication

fun main(args: Array<String>) {
    runApplication<DeliverySystemApplication>(*args)
}
