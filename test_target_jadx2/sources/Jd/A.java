package Jd;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import wc.InterfaceC5068n;

/* loaded from: classes3.dex */
final class A {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4968a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0893l f4969b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC5068n f4970c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f4971d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f4972e;

    public A(Object obj, InterfaceC0893l interfaceC0893l, InterfaceC5068n interfaceC5068n, Object obj2, Throwable th) {
        this.f4968a = obj;
        this.f4969b = interfaceC0893l;
        this.f4970c = interfaceC5068n;
        this.f4971d = obj2;
        this.f4972e = th;
    }

    public static /* synthetic */ A b(A a10, Object obj, InterfaceC0893l interfaceC0893l, InterfaceC5068n interfaceC5068n, Object obj2, Throwable th, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = a10.f4968a;
        }
        if ((i10 & 2) != 0) {
            interfaceC0893l = a10.f4969b;
        }
        InterfaceC0893l interfaceC0893l2 = interfaceC0893l;
        if ((i10 & 4) != 0) {
            interfaceC5068n = a10.f4970c;
        }
        InterfaceC5068n interfaceC5068n2 = interfaceC5068n;
        if ((i10 & 8) != 0) {
            obj2 = a10.f4971d;
        }
        Object obj4 = obj2;
        if ((i10 & 16) != 0) {
            th = a10.f4972e;
        }
        return a10.a(obj, interfaceC0893l2, interfaceC5068n2, obj4, th);
    }

    public final A a(Object obj, InterfaceC0893l interfaceC0893l, InterfaceC5068n interfaceC5068n, Object obj2, Throwable th) {
        return new A(obj, interfaceC0893l, interfaceC5068n, obj2, th);
    }

    public final boolean c() {
        return this.f4972e != null;
    }

    public final void d(C0899o c0899o, Throwable th) {
        InterfaceC0893l interfaceC0893l = this.f4969b;
        if (interfaceC0893l != null) {
            c0899o.m(interfaceC0893l, th);
        }
        InterfaceC5068n interfaceC5068n = this.f4970c;
        if (interfaceC5068n != null) {
            c0899o.n(interfaceC5068n, th, this.f4968a);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a10 = (A) obj;
        return Intrinsics.b(this.f4968a, a10.f4968a) && Intrinsics.b(this.f4969b, a10.f4969b) && Intrinsics.b(this.f4970c, a10.f4970c) && Intrinsics.b(this.f4971d, a10.f4971d) && Intrinsics.b(this.f4972e, a10.f4972e);
    }

    public int hashCode() {
        Object obj = this.f4968a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        InterfaceC0893l interfaceC0893l = this.f4969b;
        int hashCode2 = (hashCode + (interfaceC0893l == null ? 0 : interfaceC0893l.hashCode())) * 31;
        InterfaceC5068n interfaceC5068n = this.f4970c;
        int hashCode3 = (hashCode2 + (interfaceC5068n == null ? 0 : interfaceC5068n.hashCode())) * 31;
        Object obj2 = this.f4971d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f4972e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f4968a + ", cancelHandler=" + this.f4969b + ", onCancellation=" + this.f4970c + ", idempotentResume=" + this.f4971d + ", cancelCause=" + this.f4972e + ')';
    }

    public /* synthetic */ A(Object obj, InterfaceC0893l interfaceC0893l, InterfaceC5068n interfaceC5068n, Object obj2, Throwable th, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i10 & 2) != 0 ? null : interfaceC0893l, (i10 & 4) != 0 ? null : interfaceC5068n, (i10 & 8) != 0 ? null : obj2, (i10 & 16) != 0 ? null : th);
    }
}
