package com.google.common.collect;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public abstract class l {

    class a extends z {

        /* renamed from: a, reason: collision with root package name */
        boolean f27904a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f27905b;

        a(Object obj) {
            this.f27905b = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f27904a;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f27904a) {
                throw new NoSuchElementException();
            }
            this.f27904a = true;
            return this.f27905b;
        }
    }

    public static boolean a(Iterator it, Iterator it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !g8.f.a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    public static z b(Object obj) {
        return new a(obj);
    }
}
