package com.kaiqkt.ktresourceserverapi.application.exceptions

class InvalidRequestException(
    val errors: Map<String, Any>,
) : Exception()
