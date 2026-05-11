package C5;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class i implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final char f912a;

    /* renamed from: b, reason: collision with root package name */
    private final char f913b;

    /* renamed from: c, reason: collision with root package name */
    private final char f914c;

    public i() {
        this(':', ',', ',');
    }

    public static i a() {
        return new i();
    }

    public char b() {
        return this.f914c;
    }

    public char c() {
        return this.f913b;
    }

    public char d() {
        return this.f912a;
    }

    public i(char c10, char c11, char c12) {
        this.f912a = c10;
        this.f913b = c11;
        this.f914c = c12;
    }
}
