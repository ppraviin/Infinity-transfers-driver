package com.infinitytransfers.driver.utils

import kotlin.toString

object Tracker {

    fun recordApiRequest(targetUrl: String, method: String, headers: String?, body: String?) {
        AppLogger.i("IT_API_REQUEST", "$method: $targetUrl")
        AppLogger.i("IT_API_REQUEST", " Headers: $headers")
        AppLogger.i("IT_API_REQUEST", " Body: $body")
        AppLogger.d("IT_API_REQUEST", "------------------------------------------------------")

    }


    fun recordApiResponse(fromUrl: String, headers: String, body: String) {
        AppLogger.i("IT_API_RESPONSE", "From $fromUrl ")
        AppLogger.i("IT_API_RESPONSE", "Body: $body")
        AppLogger.d("IT_API_RESPONSE", "------------------------------------------------------")
    }


    fun recordApiError(targetUrl: String, method: String, statusCode: Int, body: String? = null) {
        AppLogger.i("IT_API_ERROR", "$method: $targetUrl, Status: $statusCode")
        AppLogger.i("IT_API_ERROR", "Body: $body")
        AppLogger.d("IT_API_ERROR", "------------------------------------------------------")

    }


    fun recordException(e: Throwable) {
        AppLogger.e("IT_Exception", e.message.toString(), e)
        AppLogger.d("IT_Exception", "------------------------------------------------------")
    }


    fun recordCrash(e: Throwable) {
        AppLogger.e("Crash",e.message.toString(),  e)
    }

    fun recordFirebaseException(error: Throwable, msg: String) {
        AppLogger.e("Firebase Exception", error.message.toString(), error)
    }





}