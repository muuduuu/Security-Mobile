package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.f;
import androidx.emoji2.text.n;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
final class i {

    /* renamed from: a, reason: collision with root package name */
    private final f.j f16531a;

    /* renamed from: b, reason: collision with root package name */
    private final n f16532b;

    /* renamed from: c, reason: collision with root package name */
    private f.e f16533c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f16534d;

    /* renamed from: e, reason: collision with root package name */
    private final int[] f16535e;

    private static final class a {
        static int a(CharSequence charSequence, int i10, int i11) {
            int length = charSequence.length();
            if (i10 < 0 || length < i10 || i11 < 0) {
                return -1;
            }
            while (true) {
                boolean z10 = false;
                while (i11 != 0) {
                    i10--;
                    if (i10 < 0) {
                        return z10 ? -1 : 0;
                    }
                    char charAt = charSequence.charAt(i10);
                    if (z10) {
                        if (!Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        i11--;
                    } else if (!Character.isSurrogate(charAt)) {
                        i11--;
                    } else {
                        if (Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        z10 = true;
                    }
                }
                return i10;
            }
        }

        static int b(CharSequence charSequence, int i10, int i11) {
            int length = charSequence.length();
            if (i10 < 0 || length < i10 || i11 < 0) {
                return -1;
            }
            while (true) {
                boolean z10 = false;
                while (i11 != 0) {
                    if (i10 >= length) {
                        if (z10) {
                            return -1;
                        }
                        return length;
                    }
                    char charAt = charSequence.charAt(i10);
                    if (z10) {
                        if (!Character.isLowSurrogate(charAt)) {
                            return -1;
                        }
                        i11--;
                        i10++;
                    } else if (!Character.isSurrogate(charAt)) {
                        i11--;
                        i10++;
                    } else {
                        if (Character.isLowSurrogate(charAt)) {
                            return -1;
                        }
                        i10++;
                        z10 = true;
                    }
                }
                return i10;
            }
        }
    }

    private static class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public r f16536a;

        /* renamed from: b, reason: collision with root package name */
        private final f.j f16537b;

        b(r rVar, f.j jVar) {
            this.f16536a = rVar;
            this.f16537b = jVar;
        }

        @Override // androidx.emoji2.text.i.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public r b() {
            return this.f16536a;
        }

        @Override // androidx.emoji2.text.i.c
        public boolean c(CharSequence charSequence, int i10, int i11, p pVar) {
            if (pVar.k()) {
                return true;
            }
            if (this.f16536a == null) {
                this.f16536a = new r(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
            }
            this.f16536a.setSpan(this.f16537b.a(pVar), i10, i11, 33);
            return true;
        }
    }

    private interface c {
        Object b();

        boolean c(CharSequence charSequence, int i10, int i11, p pVar);
    }

    private static class d implements c {

        /* renamed from: a, reason: collision with root package name */
        private final String f16538a;

        d(String str) {
            this.f16538a = str;
        }

        @Override // androidx.emoji2.text.i.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d b() {
            return this;
        }

        @Override // androidx.emoji2.text.i.c
        public boolean c(CharSequence charSequence, int i10, int i11, p pVar) {
            if (!TextUtils.equals(charSequence.subSequence(i10, i11), this.f16538a)) {
                return true;
            }
            pVar.l(true);
            return false;
        }
    }

    static final class e {

        /* renamed from: a, reason: collision with root package name */
        private int f16539a = 1;

        /* renamed from: b, reason: collision with root package name */
        private final n.a f16540b;

        /* renamed from: c, reason: collision with root package name */
        private n.a f16541c;

        /* renamed from: d, reason: collision with root package name */
        private n.a f16542d;

        /* renamed from: e, reason: collision with root package name */
        private int f16543e;

        /* renamed from: f, reason: collision with root package name */
        private int f16544f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f16545g;

        /* renamed from: h, reason: collision with root package name */
        private final int[] f16546h;

        e(n.a aVar, boolean z10, int[] iArr) {
            this.f16540b = aVar;
            this.f16541c = aVar;
            this.f16545g = z10;
            this.f16546h = iArr;
        }

        private static boolean d(int i10) {
            return i10 == 65039;
        }

        private static boolean f(int i10) {
            return i10 == 65038;
        }

        private int g() {
            this.f16539a = 1;
            this.f16541c = this.f16540b;
            this.f16544f = 0;
            return 1;
        }

        private boolean h() {
            if (this.f16541c.b().j() || d(this.f16543e)) {
                return true;
            }
            if (this.f16545g) {
                if (this.f16546h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f16546h, this.f16541c.b().b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        int a(int i10) {
            n.a a10 = this.f16541c.a(i10);
            int i11 = 2;
            if (this.f16539a != 2) {
                if (a10 == null) {
                    i11 = g();
                } else {
                    this.f16539a = 2;
                    this.f16541c = a10;
                    this.f16544f = 1;
                }
            } else if (a10 != null) {
                this.f16541c = a10;
                this.f16544f++;
            } else if (f(i10)) {
                i11 = g();
            } else if (!d(i10)) {
                if (this.f16541c.b() != null) {
                    i11 = 3;
                    if (this.f16544f != 1) {
                        this.f16542d = this.f16541c;
                        g();
                    } else if (h()) {
                        this.f16542d = this.f16541c;
                        g();
                    } else {
                        i11 = g();
                    }
                } else {
                    i11 = g();
                }
            }
            this.f16543e = i10;
            return i11;
        }

        p b() {
            return this.f16541c.b();
        }

        p c() {
            return this.f16542d.b();
        }

        boolean e() {
            return this.f16539a == 2 && this.f16541c.b() != null && (this.f16544f > 1 || h());
        }
    }

    i(n nVar, f.j jVar, f.e eVar, boolean z10, int[] iArr, Set set) {
        this.f16531a = jVar;
        this.f16532b = nVar;
        this.f16533c = eVar;
        this.f16534d = z10;
        this.f16535e = iArr;
        g(set);
    }

    private static boolean a(Editable editable, KeyEvent keyEvent, boolean z10) {
        j[] jVarArr;
        if (f(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!e(selectionStart, selectionEnd) && (jVarArr = (j[]) editable.getSpans(selectionStart, selectionEnd, j.class)) != null && jVarArr.length > 0) {
            for (j jVar : jVarArr) {
                int spanStart = editable.getSpanStart(jVar);
                int spanEnd = editable.getSpanEnd(jVar);
                if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    static boolean b(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z10) {
        int max;
        int min;
        if (editable != null && inputConnection != null && i10 >= 0 && i11 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (e(selectionStart, selectionEnd)) {
                return false;
            }
            if (z10) {
                max = a.a(editable, selectionStart, Math.max(i10, 0));
                min = a.b(editable, selectionEnd, Math.max(i11, 0));
                if (max == -1 || min == -1) {
                    return false;
                }
            } else {
                max = Math.max(selectionStart - i10, 0);
                min = Math.min(selectionEnd + i11, editable.length());
            }
            j[] jVarArr = (j[]) editable.getSpans(max, min, j.class);
            if (jVarArr != null && jVarArr.length > 0) {
                for (j jVar : jVarArr) {
                    int spanStart = editable.getSpanStart(jVar);
                    int spanEnd = editable.getSpanEnd(jVar);
                    max = Math.min(spanStart, max);
                    min = Math.max(spanEnd, min);
                }
                int max2 = Math.max(max, 0);
                int min2 = Math.min(min, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(max2, min2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    static boolean c(Editable editable, int i10, KeyEvent keyEvent) {
        if (!(i10 != 67 ? i10 != 112 ? false : a(editable, keyEvent, true) : a(editable, keyEvent, false))) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    private boolean d(CharSequence charSequence, int i10, int i11, p pVar) {
        if (pVar.d() == 0) {
            pVar.m(this.f16533c.a(charSequence, i10, i11, pVar.h()));
        }
        return pVar.d() == 2;
    }

    private static boolean e(int i10, int i11) {
        return i10 == -1 || i11 == -1 || i10 != i11;
    }

    private static boolean f(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    private void g(Set set) {
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            i(str, 0, str.length(), 1, true, new d(str));
        }
    }

    private Object i(CharSequence charSequence, int i10, int i11, int i12, boolean z10, c cVar) {
        int i13;
        e eVar = new e(this.f16532b.f(), this.f16534d, this.f16535e);
        int i14 = 0;
        boolean z11 = true;
        int codePointAt = Character.codePointAt(charSequence, i10);
        loop0: while (true) {
            i13 = i10;
            while (i10 < i11 && i14 < i12 && z11) {
                int a10 = eVar.a(codePointAt);
                if (a10 == 1) {
                    i13 += Character.charCount(Character.codePointAt(charSequence, i13));
                    if (i13 < i11) {
                        codePointAt = Character.codePointAt(charSequence, i13);
                    }
                    i10 = i13;
                } else if (a10 == 2) {
                    i10 += Character.charCount(codePointAt);
                    if (i10 < i11) {
                        codePointAt = Character.codePointAt(charSequence, i10);
                    }
                } else if (a10 == 3) {
                    if (z10 || !d(charSequence, i13, i10, eVar.c())) {
                        z11 = cVar.c(charSequence, i13, i10, eVar.c());
                        i14++;
                    }
                }
            }
        }
        if (eVar.e() && i14 < i12 && z11 && (z10 || !d(charSequence, i13, i10, eVar.b()))) {
            cVar.c(charSequence, i13, i10, eVar.b());
        }
        return cVar.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0049 A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:51:0x000e, B:54:0x0013, B:56:0x0017, B:58:0x0024, B:9:0x003a, B:11:0x0042, B:13:0x0045, B:15:0x0049, B:17:0x0055, B:19:0x0058, B:24:0x0066, B:30:0x0074, B:31:0x0080, B:33:0x0094, B:6:0x002f), top: B:50:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094 A[Catch: all -> 0x002a, TRY_LEAVE, TryCatch #0 {all -> 0x002a, blocks: (B:51:0x000e, B:54:0x0013, B:56:0x0017, B:58:0x0024, B:9:0x003a, B:11:0x0042, B:13:0x0045, B:15:0x0049, B:17:0x0055, B:19:0x0058, B:24:0x0066, B:30:0x0074, B:31:0x0080, B:33:0x0094, B:6:0x002f), top: B:50:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    CharSequence h(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
        r rVar;
        int i13;
        r rVar2;
        j[] jVarArr;
        boolean z11 = charSequence instanceof o;
        if (z11) {
            ((o) charSequence).a();
        }
        if (!z11) {
            try {
                if (!(charSequence instanceof Spannable)) {
                    rVar = (!(charSequence instanceof Spanned) || ((Spanned) charSequence).nextSpanTransition(i10 + (-1), i11 + 1, j.class) > i11) ? null : new r(charSequence);
                    if (rVar != null && (jVarArr = (j[]) rVar.getSpans(i10, i11, j.class)) != null && jVarArr.length > 0) {
                        for (j jVar : jVarArr) {
                            int spanStart = rVar.getSpanStart(jVar);
                            int spanEnd = rVar.getSpanEnd(jVar);
                            if (spanStart != i11) {
                                rVar.removeSpan(jVar);
                            }
                            i10 = Math.min(spanStart, i10);
                            i11 = Math.max(spanEnd, i11);
                        }
                    }
                    i13 = i11;
                    if (i10 != i13 && i10 < charSequence.length()) {
                        if (i12 != Integer.MAX_VALUE && rVar != null) {
                            i12 -= ((j[]) rVar.getSpans(0, rVar.length(), j.class)).length;
                        }
                        rVar2 = (r) i(charSequence, i10, i13, i12, z10, new b(rVar, this.f16531a));
                        if (rVar2 != null) {
                            if (z11) {
                                ((o) charSequence).d();
                            }
                            return charSequence;
                        }
                        Spannable b10 = rVar2.b();
                        if (z11) {
                            ((o) charSequence).d();
                        }
                        return b10;
                    }
                    return charSequence;
                }
            } finally {
                if (z11) {
                    ((o) charSequence).d();
                }
            }
        }
        rVar = new r((Spannable) charSequence);
        if (rVar != null) {
            while (r6 < r5) {
            }
        }
        i13 = i11;
        if (i10 != i13) {
            if (i12 != Integer.MAX_VALUE) {
                i12 -= ((j[]) rVar.getSpans(0, rVar.length(), j.class)).length;
            }
            rVar2 = (r) i(charSequence, i10, i13, i12, z10, new b(rVar, this.f16531a));
            if (rVar2 != null) {
            }
        }
        return charSequence;
    }
}
