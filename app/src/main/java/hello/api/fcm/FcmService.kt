package hello.api.fcm

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class FcmService: FirebaseMessagingService() {


    override fun onNewToken(token: String) {
        Log.d(TAG, "Refreshed token: $token")

    }

    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        Log.d(TAG, "from: ${remoteMessage.from}")
        Log.d(TAG, "data: ${remoteMessage.data}")
        Log.d(TAG, "body: ${remoteMessage.notification?.body}")
    }

    companion object {

        private const val TAG = "MyFirebaseMsgService"
    }
}