package com.gsmNetworking.chat.global.error.exception

import com.gsmNetworking.chat.global.error.model.ErrorCode
import org.springframework.http.HttpStatus

open class ExpectedException(
    val status: HttpStatus,
    val code: ErrorCode = ErrorCode.NOT_SPECIAL,
    override val message: String
): RuntimeException(message)