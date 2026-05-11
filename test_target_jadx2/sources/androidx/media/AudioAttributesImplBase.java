package androidx.media;

import java.util.Arrays;

/* loaded from: classes.dex */
class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    int f17198a = 0;

    /* renamed from: b, reason: collision with root package name */
    int f17199b = 0;

    /* renamed from: c, reason: collision with root package name */
    int f17200c = 0;

    /* renamed from: d, reason: collision with root package name */
    int f17201d = -1;

    AudioAttributesImplBase() {
    }

    public int a() {
        return this.f17199b;
    }

    public int b() {
        int i10 = this.f17200c;
        int c10 = c();
        if (c10 == 6) {
            i10 |= 4;
        } else if (c10 == 7) {
            i10 |= 1;
        }
        return i10 & 273;
    }

    public int c() {
        int i10 = this.f17201d;
        return i10 != -1 ? i10 : AudioAttributesCompat.a(false, this.f17200c, this.f17198a);
    }

    public int d() {
        return this.f17198a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        return this.f17199b == audioAttributesImplBase.a() && this.f17200c == audioAttributesImplBase.b() && this.f17198a == audioAttributesImplBase.d() && this.f17201d == audioAttributesImplBase.f17201d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f17199b), Integer.valueOf(this.f17200c), Integer.valueOf(this.f17198a), Integer.valueOf(this.f17201d)});
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f17201d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f17201d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        sb2.append(AudioAttributesCompat.b(this.f17198a));
        sb2.append(" content=");
        sb2.append(this.f17199b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f17200c).toUpperCase());
        return sb2.toString();
    }
}
