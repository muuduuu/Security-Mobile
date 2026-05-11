package k6;

import com.github.penfeizhou.animation.gif.io.GifReader;
import k6.h;

/* loaded from: classes2.dex */
public abstract class f implements InterfaceC3547b {
    public static f b(GifReader gifReader) {
        byte peek = gifReader.peek();
        if (peek == -7) {
            return new i();
        }
        if (peek == 1) {
            return new l();
        }
        if (peek == -2) {
            return new C3549d();
        }
        if (peek == -1) {
            return new C3546a();
        }
        throw new h.a();
    }
}
