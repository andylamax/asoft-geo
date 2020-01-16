package tz.co.asoft.platform.core

object Manifest {
    object permission_group {
        const val CALENDAR = "android.permission-group.CALENDAR"
        const val CALL_LOG = "android.permission-group.CALL_LOG"
        const val CAMERA = "android.permission-group.CAMERA"
        const val CONTACTS = "android.permission-group.CONTACTS"
        const val LOCATION = "android.permission-group.LOCATION"
        const val MICROPHONE = "android.permission-group.MICROPHONE"
        const val PHONE = "android.permission-group.PHONE"
        const val SENSORS = "android.permission-group.SENSORS"
        const val SMS = "android.permission-group.SMS"
        const val STORAGE = "android.permission-group.STORAGE"
    }

    object permission {
        const val ACCEPT_HANDOVER = "android.permission.ACCEPT_HANDOVER"
        const val ACCESS_CHECKIN_PROPERTIES = "android.permission.ACCESS_CHECKIN_PROPERTIES"
        const val ACCESS_COARSE_LOCATION = "android.permission.ACCESS_COARSE_LOCATION"
        const val ACCESS_FINE_LOCATION = "android.permission.ACCESS_FINE_LOCATION"
        const val ACCESS_LOCATION_EXTRA_COMMANDS = "android.permission.ACCESS_LOCATION_EXTRA_COMMANDS"
        const val ACCESS_NETWORK_STATE = "android.permission.ACCESS_NETWORK_STATE"
        const val ACCESS_NOTIFICATION_POLICY = "android.permission.ACCESS_NOTIFICATION_POLICY"
        const val ACCESS_WIFI_STATE = "android.permission.ACCESS_WIFI_STATE"
        const val ACCOUNT_MANAGER = "android.permission.ACCOUNT_MANAGER"
        const val ADD_VOICEMAIL = "com.android.voicemail.permission.ADD_VOICEMAIL"
        const val ANSWER_PHONE_CALLS = "android.permission.ANSWER_PHONE_CALLS"
        const val BATTERY_STATS = "android.permission.BATTERY_STATS"
        const val BIND_ACCESSIBILITY_SERVICE = "android.permission.BIND_ACCESSIBILITY_SERVICE"
        const val BIND_APPWIDGET = "android.permission.BIND_APPWIDGET"
        const val BIND_AUTOFILL_SERVICE = "android.permission.BIND_AUTOFILL_SERVICE"

        @Deprecated("")
        const val BIND_CARRIER_MESSAGING_SERVICE = "android.permission.BIND_CARRIER_MESSAGING_SERVICE"
        const val BIND_CARRIER_SERVICES = "android.permission.BIND_CARRIER_SERVICES"
        const val BIND_CHOOSER_TARGET_SERVICE = "android.permission.BIND_CHOOSER_TARGET_SERVICE"
        const val BIND_CONDITION_PROVIDER_SERVICE = "android.permission.BIND_CONDITION_PROVIDER_SERVICE"
        const val BIND_DEVICE_ADMIN = "android.permission.BIND_DEVICE_ADMIN"
        const val BIND_DREAM_SERVICE = "android.permission.BIND_DREAM_SERVICE"
        const val BIND_INCALL_SERVICE = "android.permission.BIND_INCALL_SERVICE"
        const val BIND_INPUT_METHOD = "android.permission.BIND_INPUT_METHOD"
        const val BIND_MIDI_DEVICE_SERVICE = "android.permission.BIND_MIDI_DEVICE_SERVICE"
        const val BIND_NFC_SERVICE = "android.permission.BIND_NFC_SERVICE"
        const val BIND_NOTIFICATION_LISTENER_SERVICE = "android.permission.BIND_NOTIFICATION_LISTENER_SERVICE"
        const val BIND_PRINT_SERVICE = "android.permission.BIND_PRINT_SERVICE"
        const val BIND_QUICK_SETTINGS_TILE = "android.permission.BIND_QUICK_SETTINGS_TILE"
        const val BIND_REMOTEVIEWS = "android.permission.BIND_REMOTEVIEWS"
        const val BIND_SCREENING_SERVICE = "android.permission.BIND_SCREENING_SERVICE"
        const val BIND_TELECOM_CONNECTION_SERVICE = "android.permission.BIND_TELECOM_CONNECTION_SERVICE"
        const val BIND_TEXT_SERVICE = "android.permission.BIND_TEXT_SERVICE"
        const val BIND_TV_INPUT = "android.permission.BIND_TV_INPUT"
        const val BIND_VISUAL_VOICEMAIL_SERVICE = "android.permission.BIND_VISUAL_VOICEMAIL_SERVICE"
        const val BIND_VOICE_INTERACTION = "android.permission.BIND_VOICE_INTERACTION"
        const val BIND_VPN_SERVICE = "android.permission.BIND_VPN_SERVICE"
        const val BIND_VR_LISTENER_SERVICE = "android.permission.BIND_VR_LISTENER_SERVICE"
        const val BIND_WALLPAPER = "android.permission.BIND_WALLPAPER"
        const val BLUETOOTH = "android.permission.BLUETOOTH"
        const val BLUETOOTH_ADMIN = "android.permission.BLUETOOTH_ADMIN"
        const val BLUETOOTH_PRIVILEGED = "android.permission.BLUETOOTH_PRIVILEGED"
        const val BODY_SENSORS = "android.permission.BODY_SENSORS"
        const val BROADCAST_PACKAGE_REMOVED = "android.permission.BROADCAST_PACKAGE_REMOVED"
        const val BROADCAST_SMS = "android.permission.BROADCAST_SMS"
        const val BROADCAST_STICKY = "android.permission.BROADCAST_STICKY"
        const val BROADCAST_WAP_PUSH = "android.permission.BROADCAST_WAP_PUSH"
        const val CALL_PHONE = "android.permission.CALL_PHONE"
        const val CALL_PRIVILEGED = "android.permission.CALL_PRIVILEGED"
        const val CAMERA = "android.permission.CAMERA"
        const val CAPTURE_AUDIO_OUTPUT = "android.permission.CAPTURE_AUDIO_OUTPUT"
        const val CAPTURE_SECURE_VIDEO_OUTPUT = "android.permission.CAPTURE_SECURE_VIDEO_OUTPUT"
        const val CAPTURE_VIDEO_OUTPUT = "android.permission.CAPTURE_VIDEO_OUTPUT"
        const val CHANGE_COMPONENT_ENABLED_STATE = "android.permission.CHANGE_COMPONENT_ENABLED_STATE"
        const val CHANGE_CONFIGURATION = "android.permission.CHANGE_CONFIGURATION"
        const val CHANGE_NETWORK_STATE = "android.permission.CHANGE_NETWORK_STATE"
        const val CHANGE_WIFI_MULTICAST_STATE = "android.permission.CHANGE_WIFI_MULTICAST_STATE"
        const val CHANGE_WIFI_STATE = "android.permission.CHANGE_WIFI_STATE"
        const val CLEAR_APP_CACHE = "android.permission.CLEAR_APP_CACHE"
        const val CONTROL_LOCATION_UPDATES = "android.permission.CONTROL_LOCATION_UPDATES"
        const val DELETE_CACHE_FILES = "android.permission.DELETE_CACHE_FILES"
        const val DELETE_PACKAGES = "android.permission.DELETE_PACKAGES"
        const val DIAGNOSTIC = "android.permission.DIAGNOSTIC"
        const val DISABLE_KEYGUARD = "android.permission.DISABLE_KEYGUARD"
        const val DUMP = "android.permission.DUMP"
        const val EXPAND_STATUS_BAR = "android.permission.EXPAND_STATUS_BAR"
        const val FACTORY_TEST = "android.permission.FACTORY_TEST"
        const val FOREGROUND_SERVICE = "android.permission.FOREGROUND_SERVICE"
        const val GET_ACCOUNTS = "android.permission.GET_ACCOUNTS"
        const val GET_ACCOUNTS_PRIVILEGED = "android.permission.GET_ACCOUNTS_PRIVILEGED"
        const val GET_PACKAGE_SIZE = "android.permission.GET_PACKAGE_SIZE"

        @Deprecated("")
        const val GET_TASKS = "android.permission.GET_TASKS"
        const val GLOBAL_SEARCH = "android.permission.GLOBAL_SEARCH"
        const val INSTALL_LOCATION_PROVIDER = "android.permission.INSTALL_LOCATION_PROVIDER"
        const val INSTALL_PACKAGES = "android.permission.INSTALL_PACKAGES"
        const val INSTALL_SHORTCUT = "com.android.launcher.permission.INSTALL_SHORTCUT"
        const val INSTANT_APP_FOREGROUND_SERVICE = "android.permission.INSTANT_APP_FOREGROUND_SERVICE"
        const val INTERNET = "android.permission.INTERNET"
        const val KILL_BACKGROUND_PROCESSES = "android.permission.KILL_BACKGROUND_PROCESSES"
        const val LOCATION_HARDWARE = "android.permission.LOCATION_HARDWARE"
        const val MANAGE_DOCUMENTS = "android.permission.MANAGE_DOCUMENTS"
        const val MANAGE_OWN_CALLS = "android.permission.MANAGE_OWN_CALLS"
        const val MASTER_CLEAR = "android.permission.MASTER_CLEAR"
        const val MEDIA_CONTENT_CONTROL = "android.permission.MEDIA_CONTENT_CONTROL"
        const val MODIFY_AUDIO_SETTINGS = "android.permission.MODIFY_AUDIO_SETTINGS"
        const val MODIFY_PHONE_STATE = "android.permission.MODIFY_PHONE_STATE"
        const val MOUNT_FORMAT_FILESYSTEMS = "android.permission.MOUNT_FORMAT_FILESYSTEMS"
        const val MOUNT_UNMOUNT_FILESYSTEMS = "android.permission.MOUNT_UNMOUNT_FILESYSTEMS"
        const val NFC = "android.permission.NFC"
        const val NFC_TRANSACTION_EVENT = "android.permission.NFC_TRANSACTION_EVENT"
        const val PACKAGE_USAGE_STATS = "android.permission.PACKAGE_USAGE_STATS"

        @Deprecated("")
        const val PERSISTENT_ACTIVITY = "android.permission.PERSISTENT_ACTIVITY"
        const val PROCESS_OUTGOING_CALLS = "android.permission.PROCESS_OUTGOING_CALLS"
        const val READ_CALENDAR = "android.permission.READ_CALENDAR"
        const val READ_CALL_LOG = "android.permission.READ_CALL_LOG"
        const val READ_CONTACTS = "android.permission.READ_CONTACTS"
        const val READ_EXTERNAL_STORAGE = "android.permission.READ_EXTERNAL_STORAGE"
        const val READ_FRAME_BUFFER = "android.permission.READ_FRAME_BUFFER"

        @Deprecated("")
        const val READ_INPUT_STATE = "android.permission.READ_INPUT_STATE"
        const val READ_LOGS = "android.permission.READ_LOGS"
        const val READ_PHONE_NUMBERS = "android.permission.READ_PHONE_NUMBERS"
        const val READ_PHONE_STATE = "android.permission.READ_PHONE_STATE"
        const val READ_SMS = "android.permission.READ_SMS"
        const val READ_SYNC_SETTINGS = "android.permission.READ_SYNC_SETTINGS"
        const val READ_SYNC_STATS = "android.permission.READ_SYNC_STATS"
        const val READ_VOICEMAIL = "com.android.voicemail.permission.READ_VOICEMAIL"
        const val REBOOT = "android.permission.REBOOT"
        const val RECEIVE_BOOT_COMPLETED = "android.permission.RECEIVE_BOOT_COMPLETED"
        const val RECEIVE_MMS = "android.permission.RECEIVE_MMS"
        const val RECEIVE_SMS = "android.permission.RECEIVE_SMS"
        const val RECEIVE_WAP_PUSH = "android.permission.RECEIVE_WAP_PUSH"
        const val RECORD_AUDIO = "android.permission.RECORD_AUDIO"
        const val REORDER_TASKS = "android.permission.REORDER_TASKS"
        const val REQUEST_COMPANION_RUN_IN_BACKGROUND = "android.permission.REQUEST_COMPANION_RUN_IN_BACKGROUND"
        const val REQUEST_COMPANION_USE_DATA_IN_BACKGROUND = "android.permission.REQUEST_COMPANION_USE_DATA_IN_BACKGROUND"
        const val REQUEST_DELETE_PACKAGES = "android.permission.REQUEST_DELETE_PACKAGES"
        const val REQUEST_IGNORE_BATTERY_OPTIMIZATIONS = "android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS"
        const val REQUEST_INSTALL_PACKAGES = "android.permission.REQUEST_INSTALL_PACKAGES"

        @Deprecated("")
        const val RESTART_PACKAGES = "android.permission.RESTART_PACKAGES"
        const val SEND_RESPOND_VIA_MESSAGE = "android.permission.SEND_RESPOND_VIA_MESSAGE"
        const val SEND_SMS = "android.permission.SEND_SMS"
        const val SET_ALARM = "com.android.alarm.permission.SET_ALARM"
        const val SET_ALWAYS_FINISH = "android.permission.SET_ALWAYS_FINISH"
        const val SET_ANIMATION_SCALE = "android.permission.SET_ANIMATION_SCALE"
        const val SET_DEBUG_APP = "android.permission.SET_DEBUG_APP"

        @Deprecated("")
        const val SET_PREFERRED_APPLICATIONS = "android.permission.SET_PREFERRED_APPLICATIONS"
        const val SET_PROCESS_LIMIT = "android.permission.SET_PROCESS_LIMIT"
        const val SET_TIME = "android.permission.SET_TIME"
        const val SET_TIME_ZONE = "android.permission.SET_TIME_ZONE"
        const val SET_WALLPAPER = "android.permission.SET_WALLPAPER"
        const val SET_WALLPAPER_HINTS = "android.permission.SET_WALLPAPER_HINTS"
        const val SIGNAL_PERSISTENT_PROCESSES = "android.permission.SIGNAL_PERSISTENT_PROCESSES"
        const val STATUS_BAR = "android.permission.STATUS_BAR"
        const val SYSTEM_ALERT_WINDOW = "android.permission.SYSTEM_ALERT_WINDOW"
        const val TRANSMIT_IR = "android.permission.TRANSMIT_IR"
        const val UNINSTALL_SHORTCUT = "com.android.launcher.permission.UNINSTALL_SHORTCUT"
        const val UPDATE_DEVICE_STATS = "android.permission.UPDATE_DEVICE_STATS"
        const val USE_BIOMETRIC = "android.permission.USE_BIOMETRIC"

        @Deprecated("")
        const val USE_FINGERPRINT = "android.permission.USE_FINGERPRINT"
        const val USE_SIP = "android.permission.USE_SIP"
        const val VIBRATE = "android.permission.VIBRATE"
        const val WAKE_LOCK = "android.permission.WAKE_LOCK"
        const val WRITE_APN_SETTINGS = "android.permission.WRITE_APN_SETTINGS"
        const val WRITE_CALENDAR = "android.permission.WRITE_CALENDAR"
        const val WRITE_CALL_LOG = "android.permission.WRITE_CALL_LOG"
        const val WRITE_CONTACTS = "android.permission.WRITE_CONTACTS"
        const val WRITE_EXTERNAL_STORAGE = "android.permission.WRITE_EXTERNAL_STORAGE"
        const val WRITE_GSERVICES = "android.permission.WRITE_GSERVICES"
        const val WRITE_SECURE_SETTINGS = "android.permission.WRITE_SECURE_SETTINGS"
        const val WRITE_SETTINGS = "android.permission.WRITE_SETTINGS"
        const val WRITE_SYNC_SETTINGS = "android.permission.WRITE_SYNC_SETTINGS"
        const val WRITE_VOICEMAIL = "com.android.voicemail.permission.WRITE_VOICEMAIL"
    }
}