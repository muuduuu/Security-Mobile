package x1;

import android.app.Notification;

/* renamed from: x1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5104h {

    /* renamed from: a, reason: collision with root package name */
    private final int f44698a;

    /* renamed from: b, reason: collision with root package name */
    private final int f44699b;

    /* renamed from: c, reason: collision with root package name */
    private final Notification f44700c;

    public C5104h(int i10, Notification notification, int i11) {
        this.f44698a = i10;
        this.f44700c = notification;
        this.f44699b = i11;
    }

    public int a() {
        return this.f44699b;
    }

    public Notification b() {
        return this.f44700c;
    }

    public int c() {
        return this.f44698a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5104h.class != obj.getClass()) {
            return false;
        }
        C5104h c5104h = (C5104h) obj;
        if (this.f44698a == c5104h.f44698a && this.f44699b == c5104h.f44699b) {
            return this.f44700c.equals(c5104h.f44700c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f44698a * 31) + this.f44699b) * 31) + this.f44700c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f44698a + ", mForegroundServiceType=" + this.f44699b + ", mNotification=" + this.f44700c + '}';
    }
}
