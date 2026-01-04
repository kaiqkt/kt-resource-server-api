package com.kaiqkt.ktresourceserverapi.domain.exceptions

class DomainException(
    val type: ErrorType,
) : Exception(type.message)
