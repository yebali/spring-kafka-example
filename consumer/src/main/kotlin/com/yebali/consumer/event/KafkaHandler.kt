package com.yebali.consumer.event

import com.yebali.consumer.util.Logger
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class KafkaHandler {
    @KafkaListener(topics = ["random-uuid"], groupId = "consumerGroup-1")
    fun handleRandomUuidMessage(message: String) {
        logger.info { "Consumed message: $message" }
    }

    companion object : Logger()
}
