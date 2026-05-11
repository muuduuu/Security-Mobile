package k6;

import com.github.penfeizhou.animation.gif.io.GifReader;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class l extends f {

    /* renamed from: a, reason: collision with root package name */
    private List f36259a = new ArrayList();

    @Override // k6.InterfaceC3547b
    public void a(GifReader gifReader) {
        gifReader.peek();
        gifReader.readUInt16();
        gifReader.readUInt16();
        gifReader.readUInt16();
        gifReader.readUInt16();
        gifReader.peek();
        gifReader.peek();
        gifReader.peek();
        gifReader.peek();
        while (true) {
            C3550e c10 = C3550e.c(gifReader);
            if (c10.b()) {
                return;
            } else {
                this.f36259a.add(c10);
            }
        }
    }
}
