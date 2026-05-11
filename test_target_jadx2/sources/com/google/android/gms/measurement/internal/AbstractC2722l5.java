package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* renamed from: com.google.android.gms.measurement.internal.l5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2722l5 {
    public static String a(Context context, String str, String str2) {
        AbstractC1287s.m(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str2)) {
            str2 = AbstractC2664e3.a(context);
        }
        return AbstractC2664e3.b("google_app_id", resources, str2);
    }

    public static Object b(Object obj) {
        Throwable th;
        ObjectInputStream objectInputStream;
        ObjectOutputStream objectOutputStream;
        try {
            if (obj != null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    try {
                        objectOutputStream.writeObject(obj);
                        objectOutputStream.flush();
                        objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                        try {
                            Object readObject = objectInputStream.readObject();
                            objectOutputStream.close();
                            objectInputStream.close();
                            return readObject;
                        } catch (Throwable th2) {
                            th = th2;
                            if (objectOutputStream != null) {
                                objectOutputStream.close();
                            }
                            if (objectInputStream == null) {
                                throw th;
                            }
                            objectInputStream.close();
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        objectInputStream = null;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    objectInputStream = null;
                    objectOutputStream = null;
                }
            }
        } catch (IOException | ClassNotFoundException unused) {
        }
        return null;
    }

    public static String c(String str, String[] strArr, String[] strArr2) {
        AbstractC1287s.m(strArr);
        AbstractC1287s.m(strArr2);
        int min = Math.min(strArr.length, strArr2.length);
        for (int i10 = 0; i10 < min; i10++) {
            String str2 = strArr[i10];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i10];
            }
        }
        return null;
    }
}
