package io.sentry.internal.gestures;

import io.sentry.util.n;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    final WeakReference f35159a;

    /* renamed from: b, reason: collision with root package name */
    final String f35160b;

    /* renamed from: c, reason: collision with root package name */
    final String f35161c;

    /* renamed from: d, reason: collision with root package name */
    final String f35162d;

    /* renamed from: e, reason: collision with root package name */
    final String f35163e;

    public enum a {
        CLICKABLE,
        SCROLLABLE
    }

    public b(Object obj, String str, String str2, String str3, String str4) {
        this.f35159a = new WeakReference(obj);
        this.f35160b = str;
        this.f35161c = str2;
        this.f35162d = str3;
        this.f35163e = str4;
    }

    public String a() {
        return this.f35160b;
    }

    public String b() {
        String str = this.f35161c;
        return str != null ? str : (String) n.c(this.f35162d, "UiElement.tag can't be null");
    }

    public String c() {
        return this.f35163e;
    }

    public String d() {
        return this.f35161c;
    }

    public String e() {
        return this.f35162d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return n.a(this.f35160b, bVar.f35160b) && n.a(this.f35161c, bVar.f35161c) && n.a(this.f35162d, bVar.f35162d);
    }

    public Object f() {
        return this.f35159a.get();
    }

    public int hashCode() {
        return n.b(this.f35159a, this.f35161c, this.f35162d);
    }
}
