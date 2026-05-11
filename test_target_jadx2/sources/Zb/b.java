package Zb;

import ac.InterfaceC1373a;
import com.facebook.react.bridge.WritableMap;

/* loaded from: classes2.dex */
public class b implements InterfaceC1373a {

    /* renamed from: a, reason: collision with root package name */
    private String f12485a;

    /* renamed from: b, reason: collision with root package name */
    private WritableMap f12486b;

    /* renamed from: c, reason: collision with root package name */
    private String f12487c;

    public b(String str, WritableMap writableMap) {
        this.f12485a = str;
        this.f12486b = writableMap;
    }

    @Override // ac.InterfaceC1373a
    public WritableMap a() {
        return this.f12486b;
    }

    @Override // ac.InterfaceC1373a
    public String b() {
        return this.f12485a;
    }

    public b(String str, WritableMap writableMap, String str2) {
        this.f12485a = str;
        this.f12486b = writableMap;
        this.f12487c = str2;
    }
}
