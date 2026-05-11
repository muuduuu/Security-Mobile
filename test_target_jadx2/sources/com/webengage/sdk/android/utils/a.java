package com.webengage.sdk.android.utils;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes2.dex */
class a {

    /* renamed from: d, reason: collision with root package name */
    static int f30902d = 24;

    /* renamed from: a, reason: collision with root package name */
    JsonReader f30903a;

    /* renamed from: b, reason: collision with root package name */
    Object f30904b;

    /* renamed from: c, reason: collision with root package name */
    boolean f30905c;

    /* renamed from: com.webengage.sdk.android.utils.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0445a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f30906a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f30906a = iArr;
            try {
                iArr[JsonToken.BEGIN_OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30906a[JsonToken.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30906a[JsonToken.END_ARRAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30906a[JsonToken.END_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f30906a[JsonToken.NAME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f30906a[JsonToken.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f30906a[JsonToken.NUMBER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f30906a[JsonToken.NULL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f30906a[JsonToken.BOOLEAN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    a(InputStream inputStream, boolean z10) {
        this.f30903a = null;
        this.f30904b = null;
        this.f30905c = false;
        this.f30903a = new JsonReader(new InputStreamReader(inputStream));
        this.f30905c = z10;
        this.f30904b = c();
        this.f30903a.close();
    }

    private Object a(String str) {
        if (!str.startsWith("~t")) {
            return (!str.startsWith("~") || str.length() <= 1) ? str : str.substring(1);
        }
        try {
            return DataType.convert(str, DataType.DATE, true);
        } catch (Exception unused) {
            return null;
        }
    }

    private Object b(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() != f30902d) {
            return str;
        }
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            return simpleDateFormat.parse(str);
        } catch (Exception unused) {
            return str;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private Object c() {
        switch (C0445a.f30906a[this.f30903a.peek().ordinal()]) {
            case 1:
                this.f30903a.beginObject();
                HashMap hashMap = new HashMap();
                while (this.f30903a.hasNext()) {
                    hashMap.put((String) c(), c());
                }
                c();
                return hashMap;
            case 2:
                this.f30903a.beginArray();
                ArrayList arrayList = new ArrayList();
                while (this.f30903a.hasNext()) {
                    arrayList.add(c());
                }
                c();
                return arrayList;
            case 3:
                this.f30903a.endArray();
                return null;
            case 4:
                this.f30903a.endObject();
                return null;
            case 5:
                String nextName = this.f30903a.nextName();
                return this.f30905c ? a(nextName) : b(nextName);
            case 6:
                String nextString = this.f30903a.nextString();
                return this.f30905c ? a(nextString) : b(nextString);
            case 7:
                String nextString2 = this.f30903a.nextString();
                try {
                    return Long.valueOf(Long.parseLong(nextString2));
                } catch (NumberFormatException unused) {
                    return Double.valueOf(Double.parseDouble(nextString2));
                }
            case 8:
                this.f30903a.nextNull();
                return null;
            case 9:
                return Boolean.valueOf(this.f30903a.nextBoolean());
            default:
                return null;
        }
    }

    List<Object> a() {
        Object obj = this.f30904b;
        if (obj instanceof List) {
            return (List) obj;
        }
        return null;
    }

    Map<String, Object> b() {
        Object obj = this.f30904b;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }
}
