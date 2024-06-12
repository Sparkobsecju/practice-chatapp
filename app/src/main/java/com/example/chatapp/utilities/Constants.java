package com.example.chatapp.utilities;

import java.util.HashMap;

public class Constants {
// user information
    public static final String KEY_COLLECTION_USERS = "users";
    public static final String KEY_NAME = "name";
    public static final String KEY_EMAIL = "email";
    public static final String KEY_PASSWORD = "password";
    public static final String KEY_PREFERENCE_NAME = "chatAppPreference";
    public static final String KEY_IS_SIGNED_IN = "isSignedIn";
    public static final String KEY_USER_ID = "userId";
    public static final String KEY_IMAGE = "image";
    public static final String KEY_FCM_TOKEN = "fcmToken";
    public static final String KEY_USER = "user";

// chatting room
    public static final String KEY_COLLECTION_CHAT = "chat";
    public static final String KEY_SENDER_ID = "senderId";
    public static final String KEY_RECEIVER_ID = "receiverId";
    public static final String KEY_MESSAGE = "message";
    public static final String KEY_TIMESTAMP = "timestamp";

// handle recent conversations
    public static final String KEY_COLLECTION_CONVERSATIONS = "conversations";
    public static final String KEY_SENDER_NAME = "senderName";
    public static final String KEY_RECEIVER_NAME = "receiverName";
    public static final String KEY_SENDER_IMAGE = "senderImage";
    public static final String KEY_RECEIVER_IMAGE = "receiverImage";
    public static final String KEY_LAST_MESSAGE = "lastMessage";

// handle user availability
    public static final String KEY_AVAILABILITY = "availability";

// push notifications
    public static final String REMOTE_MSG_AUTHORIZATION = "Authorization";  // Authorization
    public static final String REMOTE_MSG_CONTENT_TYPE = "Content-Type";    // Content-Type
    public static final String REMOTE_MSG_DATA = "data";                    // data
    public static final String REMOTE_MSG_REGISTRATION_IDS = "registration_ids";     // registration_ids

// cloud key notification
    public static HashMap<String, String> remoteMsgHeaders = null;
    public static HashMap<String, String> getRemoteMsgHeaders() {
        if (remoteMsgHeaders == null) {
            remoteMsgHeaders = new HashMap<>();
            remoteMsgHeaders.put(
                    REMOTE_MSG_AUTHORIZATION,
                    "key=BOURBw8leASvt3OpcBC3B_nhu8E8aV6OQthjRL6fEAB23sI3GF-jYkRTjg11JOtHa7AJwfLDbK9DwpLweSdNwFY"
            );
            // Paste the server key which we have copied from the firebase console. Make sure you write "key=" prefix before the server key.

            remoteMsgHeaders.put(
                    REMOTE_MSG_CONTENT_TYPE,
                    "application/json"
            );
        }
        return remoteMsgHeaders;
    }



}
