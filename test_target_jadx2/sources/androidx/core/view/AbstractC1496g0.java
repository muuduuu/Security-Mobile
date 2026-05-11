package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
import yc.InterfaceC5191a;

/* renamed from: androidx.core.view.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1496g0 {

    /* renamed from: androidx.core.view.g0$a */
    public static final class a implements Sequence {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f16127a;

        a(ViewGroup viewGroup) {
            this.f16127a = viewGroup;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator iterator() {
            return AbstractC1496g0.c(this.f16127a);
        }
    }

    /* renamed from: androidx.core.view.g0$b */
    static final class b extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f16128a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator invoke(View view) {
            Sequence a10;
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup == null || (a10 = AbstractC1496g0.a(viewGroup)) == null) {
                return null;
            }
            return a10.iterator();
        }
    }

    /* renamed from: androidx.core.view.g0$c */
    public static final class c implements Iterator, InterfaceC5191a {

        /* renamed from: a, reason: collision with root package name */
        private int f16129a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f16130b;

        c(ViewGroup viewGroup) {
            this.f16130b = viewGroup;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public View next() {
            ViewGroup viewGroup = this.f16130b;
            int i10 = this.f16129a;
            this.f16129a = i10 + 1;
            View childAt = viewGroup.getChildAt(i10);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f16129a < this.f16130b.getChildCount();
        }

        @Override // java.util.Iterator
        public void remove() {
            ViewGroup viewGroup = this.f16130b;
            int i10 = this.f16129a - 1;
            this.f16129a = i10;
            viewGroup.removeViewAt(i10);
        }
    }

    /* renamed from: androidx.core.view.g0$d */
    public static final class d implements Sequence {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f16131a;

        public d(ViewGroup viewGroup) {
            this.f16131a = viewGroup;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator iterator() {
            return new W(AbstractC1496g0.a(this.f16131a).iterator(), b.f16128a);
        }
    }

    public static final Sequence a(ViewGroup viewGroup) {
        return new a(viewGroup);
    }

    public static final Sequence b(ViewGroup viewGroup) {
        return new d(viewGroup);
    }

    public static final Iterator c(ViewGroup viewGroup) {
        return new c(viewGroup);
    }
}
