package androidx.media;

import android.media.AudioAttributes;

/* loaded from: classes.dex */
class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    AudioAttributes f17196a;

    /* renamed from: b, reason: collision with root package name */
    int f17197b = -1;

    AudioAttributesImplApi21() {
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f17196a.equals(((AudioAttributesImplApi21) obj).f17196a);
        }
        return false;
    }

    public int hashCode() {
        return this.f17196a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f17196a;
    }
}
