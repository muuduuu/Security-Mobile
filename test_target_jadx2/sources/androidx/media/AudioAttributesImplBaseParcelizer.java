package androidx.media;

import androidx.versionedparcelable.a;

/* loaded from: classes.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f17198a = aVar.p(audioAttributesImplBase.f17198a, 1);
        audioAttributesImplBase.f17199b = aVar.p(audioAttributesImplBase.f17199b, 2);
        audioAttributesImplBase.f17200c = aVar.p(audioAttributesImplBase.f17200c, 3);
        audioAttributesImplBase.f17201d = aVar.p(audioAttributesImplBase.f17201d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, a aVar) {
        aVar.x(false, false);
        aVar.F(audioAttributesImplBase.f17198a, 1);
        aVar.F(audioAttributesImplBase.f17199b, 2);
        aVar.F(audioAttributesImplBase.f17200c, 3);
        aVar.F(audioAttributesImplBase.f17201d, 4);
    }
}
