package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.Log;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public abstract class v {
    /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0089 A[Catch: IOException -> 0x0013, XmlPullParserException -> 0x0016, TryCatch #2 {IOException -> 0x0013, XmlPullParserException -> 0x0016, blocks: (B:3:0x0007, B:5:0x000d, B:8:0x0019, B:13:0x002b, B:15:0x008d, B:18:0x0034, B:22:0x0044, B:24:0x0048, B:30:0x0056, B:38:0x007e, B:40:0x0084, B:42:0x0089, B:44:0x0065, B:47:0x006f), top: B:2:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Map a(Context context, int i10) {
        Resources resources;
        char c10;
        HashMap hashMap = new HashMap();
        try {
            resources = context.getResources();
        } catch (IOException e10) {
            e = e10;
            Log.e("FirebaseRemoteConfig", "Encountered an error while parsing the defaults XML file.", e);
            return hashMap;
        } catch (XmlPullParserException e11) {
            e = e11;
            Log.e("FirebaseRemoteConfig", "Encountered an error while parsing the defaults XML file.", e);
            return hashMap;
        }
        if (resources == null) {
            Log.e("FirebaseRemoteConfig", "Could not find the resources of the current context while trying to set defaults from an XML.");
            return hashMap;
        }
        XmlResourceParser xml = resources.getXml(i10);
        String str = null;
        String str2 = null;
        String str3 = null;
        for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
            if (eventType == 2) {
                str = xml.getName();
            } else if (eventType == 3) {
                if (xml.getName().equals("entry")) {
                    if (str2 == null || str3 == null) {
                        Log.w("FirebaseRemoteConfig", "An entry in the defaults XML has an invalid key and/or value tag.");
                    } else {
                        hashMap.put(str2, str3);
                    }
                    str2 = null;
                    str3 = null;
                }
                str = null;
            } else if (eventType == 4 && str != null) {
                int hashCode = str.hashCode();
                if (hashCode != 106079) {
                    if (hashCode == 111972721 && str.equals("value")) {
                        c10 = 1;
                        if (c10 != 0) {
                            str2 = xml.getText();
                        } else if (c10 != 1) {
                            Log.w("FirebaseRemoteConfig", "Encountered an unexpected tag while parsing the defaults XML.");
                        } else {
                            str3 = xml.getText();
                        }
                    }
                    c10 = 65535;
                    if (c10 != 0) {
                    }
                } else {
                    if (str.equals("key")) {
                        c10 = 0;
                        if (c10 != 0) {
                        }
                    }
                    c10 = 65535;
                    if (c10 != 0) {
                    }
                }
            }
        }
        return hashMap;
    }
}
