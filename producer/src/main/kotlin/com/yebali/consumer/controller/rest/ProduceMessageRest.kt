package com.yebali.consumer.controller.rest

interface ProduceMessageRest {
    data class Request(
        val topic: String,
    )

    data class Response(
        val topic: String,
        val message: String,
    )
}
