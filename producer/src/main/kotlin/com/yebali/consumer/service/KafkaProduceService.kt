package com.yebali.consumer.service

import com.yebali.consumer.service.command.ProduceMessage
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class KafkaProduceService(
    private val kafkaTemplate: KafkaTemplate<String, String>,
) {
    fun produceRandomUUID(command: ProduceMessage.Command): ProduceMessage.Result {
        val message = UUID.randomUUID().toString()
        kafkaTemplate.send(command.topic, message)

        return ProduceMessage.Result(
            topic = command.topic,
            message = message,
        )
    }
}
