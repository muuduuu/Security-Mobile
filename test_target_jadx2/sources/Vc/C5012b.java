package vc;

/* renamed from: vc.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5012b extends Error {
    public C5012b() {
        super("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    public C5012b(String str) {
        super(str);
    }
}
