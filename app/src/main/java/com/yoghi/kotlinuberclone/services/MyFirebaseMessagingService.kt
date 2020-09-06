package com.yoghi.kotlinuberclone.services

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import com.yoghi.kotlinuberclone.Common
import com.yoghi.kotlinuberclone.utils.UserUtils
import kotlin.random.Random

class MyFirebaseMessagingService : FirebaseMessagingService() {
    override fun onNewToken(token: String) {
        super.onNewToken(token)
        if (FirebaseAuth.getInstance().currentUser != null)
            UserUtils.updateToken(this, token)
    }

    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        super.onMessageReceived(remoteMessage)
        val data = remoteMessage.data
        if (data != null){
            Common.showNotification(this, Random.nextInt(),
            data[Common.NOTI_TITLE],
            data[Common.NOTI_BODY],
            null)
        }
    }
}