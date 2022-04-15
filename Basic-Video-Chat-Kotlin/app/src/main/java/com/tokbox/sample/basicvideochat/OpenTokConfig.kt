package com.tokbox.sample.basicvideochat

import android.text.TextUtils

object OpenTokConfig {
    /*
    Fill the following variables using your own Project info from the OpenTok dashboard
    https://dashboard.tokbox.com/projects

    Note that this application will ignore credentials in the `OpenTokConfig` file when `CHAT_SERVER_URL` contains a
    valid URL.
    */
    /*
    Fill the following variables using your own Project info from the OpenTok dashboard
    https://dashboard.tokbox.com/projects

    Note that this application will ignore credentials in the `OpenTokConfig` file when `CHAT_SERVER_URL` contains a
    valid URL.
    */

    // Replace with a API key
    const val API_KEY = "46269242"

    // Replace with a generated Session ID
    const val SESSION_ID = "1_MX40NjI2OTI0Mn5-MTYyNjY5NzkwNTkxMn5PVW9Jd2N0OFkrZ0RGR2kyQ0hOdTRzZmZ-fg"

    // Replace with a generated token (from the dashboard or using an OpenTok server SDK)
    const val TOKEN = "T1==cGFydG5lcl9pZD00NjI2OTI0MiZzaWc9NmQ3ZmZlMGE5NWJjMTdlZjFmOGQ2M2NkZTJjNmRlMjhlOTZjZmY1MjpzZXNzaW9uX2lkPTFfTVg0ME5qSTJPVEkwTW41LU1UWXlOalk1Tnprd05Ua3hNbjVQVlc5SmQyTjBPRmtyWjBSR1Iya3lRMGhPZFRSelptWi1mZyZjcmVhdGVfdGltZT0xNjQ5MDY4NjcxJm5vbmNlPTAuMzQ4NzA1MjUzMzI1MTMyMjUmcm9sZT1wdWJsaXNoZXImZXhwaXJlX3RpbWU9MTY1MTY2MDY3MCZpbml0aWFsX2xheW91dF9jbGFzc19saXN0PQ=="


    // *** The code below is to validate this configuration file. You do not need to modify it  ***
    val isValid: Boolean
        get() = !(TextUtils.isEmpty(API_KEY) || TextUtils.isEmpty(SESSION_ID) || TextUtils.isEmpty(TOKEN))

    val description: String
        get() = """
               OpenTokConfig:
               API_KEY: $API_KEY
               SESSION_ID: $SESSION_ID
               TOKEN: $TOKEN
               """.trimIndent()
}