package ze;

import java.util.Stack;

/* renamed from: ze.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C5281f {

    /* renamed from: a, reason: collision with root package name */
    Stack f45919a = new Stack();

    /* renamed from: b, reason: collision with root package name */
    private Stack f45920b = new Stack();

    C5281f() {
    }

    public void a(E e10, E e11) {
        this.f45919a.add(e10);
        this.f45920b.add(e11);
    }

    public String b() {
        return ((E) this.f45920b.peek()).f45900b;
    }

    public int c() {
        if (this.f45920b.isEmpty()) {
            return -1;
        }
        return ((E) this.f45920b.peek()).f45899a;
    }

    public boolean d() {
        return this.f45919a.isEmpty();
    }

    public E e() {
        this.f45920b.pop();
        return (E) this.f45919a.pop();
    }
}
