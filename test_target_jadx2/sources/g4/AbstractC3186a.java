package g4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: g4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3186a implements InterfaceC3190e {

    /* renamed from: c, reason: collision with root package name */
    private static final Set f33522c = new HashSet(Arrays.asList("encoded_size", "encoded_width", "encoded_height", "uri_source", "image_format", "bitmap_config", "is_rounded", "non_fatal_decode_error", "modified_url", "image_color_space"));

    /* renamed from: a, reason: collision with root package name */
    private Map f33523a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private k f33524b;

    @Override // g4.InterfaceC3190e
    public k G() {
        if (this.f33524b == null) {
            this.f33524b = new l(getWidth(), getHeight(), M(), c1(), getExtras());
        }
        return this.f33524b;
    }

    @Override // g4.InterfaceC3190e
    public boolean Y1() {
        return false;
    }

    @Override // g4.InterfaceC3190e
    public n c1() {
        return m.f33552d;
    }

    @Override // N3.a
    public void g(Map map) {
        if (map == null) {
            return;
        }
        for (String str : f33522c) {
            Object obj = map.get(str);
            if (obj != null) {
                this.f33523a.put(str, obj);
            }
        }
    }

    @Override // g4.j, N3.a
    public Map getExtras() {
        return this.f33523a;
    }

    @Override // N3.a
    public void n(String str, Object obj) {
        if (f33522c.contains(str)) {
            this.f33523a.put(str, obj);
        }
    }
}
