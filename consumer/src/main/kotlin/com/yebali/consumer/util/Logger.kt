package com.yebali.consumer.util

import mu.KotlinLogging

abstract class Logger {
    val logger = KotlinLogging.logger(this.javaClass.name)
}
