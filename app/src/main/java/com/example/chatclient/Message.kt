package com.example.chatclient

class Message {
    var nickname:String? = null
    var message:String? = null

    constructor()

    constructor(nickname: String?, message: String?) {
        this.nickname = nickname
        this.message = message
    }
}