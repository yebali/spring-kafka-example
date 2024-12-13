package com.yebali.consumer.service.command

interface ProduceMessage {
    data class Command(
        val topic: String,
    )

    data class Result(
        val topic: String,
        val message: String,
    )
}
