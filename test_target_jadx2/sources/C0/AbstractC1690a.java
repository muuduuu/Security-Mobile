package c0;

import android.media.MediaFormat;
import androidx.camera.core.impl.e1;
import c0.C1692c;
import java.util.Objects;

/* renamed from: c0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1690a implements InterfaceC1703n {

    /* renamed from: c0.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0342a {
        AbstractC0342a() {
        }

        abstract AbstractC1690a a();

        public AbstractC1690a b() {
            AbstractC1690a a10 = a();
            if (Objects.equals(a10.c(), "audio/mp4a-latm") && a10.g() == -1) {
                throw new IllegalArgumentException("Encoder mime set to AAC, but no AAC profile was provided.");
            }
            return a10;
        }

        public abstract AbstractC0342a c(int i10);

        public abstract AbstractC0342a d(int i10);

        public abstract AbstractC0342a e(e1 e1Var);

        public abstract AbstractC0342a f(String str);

        public abstract AbstractC0342a g(int i10);

        public abstract AbstractC0342a h(int i10);
    }

    AbstractC1690a() {
    }

    public static AbstractC0342a d() {
        return new C1692c.b().g(-1);
    }

    @Override // c0.InterfaceC1703n
    public MediaFormat a() {
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat(c(), h(), f());
        createAudioFormat.setInteger("bitrate", e());
        if (g() != -1) {
            if (c().equals("audio/mp4a-latm")) {
                createAudioFormat.setInteger("aac-profile", g());
            } else {
                createAudioFormat.setInteger("profile", g());
            }
        }
        return createAudioFormat;
    }

    @Override // c0.InterfaceC1703n
    public abstract e1 b();

    @Override // c0.InterfaceC1703n
    public abstract String c();

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract int h();
}
