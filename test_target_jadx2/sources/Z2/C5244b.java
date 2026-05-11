package z2;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* renamed from: z2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5244b {

    /* renamed from: a, reason: collision with root package name */
    private final List f45681a = new ArrayList();

    public synchronized void a(ImageHeaderParser imageHeaderParser) {
        this.f45681a.add(imageHeaderParser);
    }

    public synchronized List b() {
        return this.f45681a;
    }
}
