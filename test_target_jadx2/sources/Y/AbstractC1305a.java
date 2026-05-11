package Y;

import Y.u;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.conscrypt.BuildConfig;

/* renamed from: Y.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1305a {

    /* renamed from: a, reason: collision with root package name */
    public static final List f11908a = Collections.unmodifiableList(Arrays.asList(48000, 44100, 22050, 11025, 8000, 4800));

    /* renamed from: Y.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0223a {
        AbstractC0223a() {
        }

        abstract AbstractC1305a a();

        public final AbstractC1305a b() {
            AbstractC1305a a10 = a();
            int c10 = a10.c();
            String str = BuildConfig.FLAVOR;
            if (c10 == -1) {
                str = BuildConfig.FLAVOR + " audioSource";
            }
            if (a10.f() <= 0) {
                str = str + " sampleRate";
            }
            if (a10.e() <= 0) {
                str = str + " channelCount";
            }
            if (a10.b() == -1) {
                str = str + " audioFormat";
            }
            if (str.isEmpty()) {
                return a10;
            }
            throw new IllegalArgumentException("Required settings missing or non-positive:" + str);
        }

        public abstract AbstractC0223a c(int i10);

        public abstract AbstractC0223a d(int i10);

        public abstract AbstractC0223a e(int i10);

        public abstract AbstractC0223a f(int i10);
    }

    AbstractC1305a() {
    }

    public static AbstractC0223a a() {
        return new u.b().d(-1).f(-1).e(-1).c(-1);
    }

    public abstract int b();

    public abstract int c();

    public int d() {
        return t.f(b(), e());
    }

    public abstract int e();

    public abstract int f();
}
