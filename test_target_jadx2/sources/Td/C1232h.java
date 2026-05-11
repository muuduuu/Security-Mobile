package Td;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* renamed from: Td.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1232h {

    /* renamed from: a, reason: collision with root package name */
    private final String f10009a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f10010b;

    public C1232h(String scheme, Map authParams) {
        String str;
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(authParams, "authParams");
        this.f10009a = scheme;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : authParams.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            if (str2 != null) {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                str = str2.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
            } else {
                str = null;
            }
            linkedHashMap.put(str, str3);
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap(...)");
        this.f10010b = unmodifiableMap;
    }

    public final Map a() {
        return this.f10010b;
    }

    public final Charset b() {
        String str = (String) this.f10010b.get("charset");
        if (str != null) {
            try {
                Charset forName = Charset.forName(str);
                Intrinsics.checkNotNullExpressionValue(forName, "forName(...)");
                return forName;
            } catch (Exception unused) {
            }
        }
        return Charsets.ISO_8859_1;
    }

    public final String c() {
        return (String) this.f10010b.get("realm");
    }

    public final String d() {
        return this.f10009a;
    }

    public boolean equals(Object obj) {
        return Wd.d.a(this, obj);
    }

    public int hashCode() {
        return Wd.d.b(this);
    }

    public String toString() {
        return Wd.d.c(this);
    }
}
