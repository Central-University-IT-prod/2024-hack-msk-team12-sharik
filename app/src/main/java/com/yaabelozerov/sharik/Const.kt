package com.yaabelozerov.sharik

sealed class Const {
    companion object {
        const val BASE_URL = "http://{{sensitive_data}}:8080/api/"
        const val MOCK = false
    }
}