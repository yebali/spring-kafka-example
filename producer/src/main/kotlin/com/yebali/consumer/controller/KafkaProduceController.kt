package com.yebali.consumer.controller

import com.yebali.consumer.controller.rest.ProduceMessageRest
import com.yebali.consumer.service.KafkaProduceService
import com.yebali.consumer.service.command.ProduceMessage
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class KafkaProduceController(
    private val kafkaProduceService: KafkaProduceService,
) {
    @PostMapping("/produce")
    fun produceMessage(
        @RequestBody request: ProduceMessageRest.Request,
    ): ProduceMessageRest.Response {
        val result = kafkaProduceService.produceRandomUUID(
            command = ProduceMessage.Command(
                topic = request.topic,
            ),
        )

        return ProduceMessageRest.Response(
            topic = result.topic,
            message = result.message,
        )
    }
}
