package k6;

import com.github.penfeizhou.animation.gif.io.GifReader;
import java.util.ArrayList;
import java.util.List;

/* renamed from: k6.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3549d extends f {

    /* renamed from: a, reason: collision with root package name */
    private List f36232a = new ArrayList();

    @Override // k6.InterfaceC3547b
    public void a(GifReader gifReader) {
        while (true) {
            C3550e c10 = C3550e.c(gifReader);
            if (c10.b()) {
                return;
            } else {
                this.f36232a.add(c10);
            }
        }
    }
}
