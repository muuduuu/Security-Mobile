package Dc;

import Ec.AbstractC0831j;
import Ec.L;
import Fc.e;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.g;
import kotlin.reflect.h;
import kotlin.reflect.k;

/* loaded from: classes3.dex */
public abstract class a {
    public static final boolean a(kotlin.reflect.c cVar) {
        e N10;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        if (cVar instanceof h) {
            k kVar = (k) cVar;
            Field b10 = c.b(kVar);
            if (!(b10 != null ? b10.isAccessible() : true)) {
                return false;
            }
            Method c10 = c.c(kVar);
            if (!(c10 != null ? c10.isAccessible() : true)) {
                return false;
            }
            Method e10 = c.e((h) cVar);
            if (!(e10 != null ? e10.isAccessible() : true)) {
                return false;
            }
        } else if (cVar instanceof k) {
            k kVar2 = (k) cVar;
            Field b11 = c.b(kVar2);
            if (!(b11 != null ? b11.isAccessible() : true)) {
                return false;
            }
            Method c11 = c.c(kVar2);
            if (!(c11 != null ? c11.isAccessible() : true)) {
                return false;
            }
        } else if (cVar instanceof k.b) {
            Field b12 = c.b(((k.b) cVar).u());
            if (!(b12 != null ? b12.isAccessible() : true)) {
                return false;
            }
            Method d10 = c.d((g) cVar);
            if (!(d10 != null ? d10.isAccessible() : true)) {
                return false;
            }
        } else if (cVar instanceof h.a) {
            Field b13 = c.b(((h.a) cVar).u());
            if (!(b13 != null ? b13.isAccessible() : true)) {
                return false;
            }
            Method d11 = c.d((g) cVar);
            if (!(d11 != null ? d11.isAccessible() : true)) {
                return false;
            }
        } else {
            if (!(cVar instanceof g)) {
                throw new UnsupportedOperationException("Unknown callable: " + cVar + " (" + cVar.getClass() + ')');
            }
            g gVar = (g) cVar;
            Method d12 = c.d(gVar);
            if (!(d12 != null ? d12.isAccessible() : true)) {
                return false;
            }
            AbstractC0831j b14 = L.b(cVar);
            Member a10 = (b14 == null || (N10 = b14.N()) == null) ? null : N10.a();
            AccessibleObject accessibleObject = a10 instanceof AccessibleObject ? (AccessibleObject) a10 : null;
            if (!(accessibleObject != null ? accessibleObject.isAccessible() : true)) {
                return false;
            }
            Constructor a11 = c.a(gVar);
            if (!(a11 != null ? a11.isAccessible() : true)) {
                return false;
            }
        }
        return true;
    }

    public static final void b(kotlin.reflect.c cVar, boolean z10) {
        e N10;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        if (cVar instanceof h) {
            k kVar = (k) cVar;
            Field b10 = c.b(kVar);
            if (b10 != null) {
                b10.setAccessible(z10);
            }
            Method c10 = c.c(kVar);
            if (c10 != null) {
                c10.setAccessible(z10);
            }
            Method e10 = c.e((h) cVar);
            if (e10 == null) {
                return;
            }
            e10.setAccessible(z10);
            return;
        }
        if (cVar instanceof k) {
            k kVar2 = (k) cVar;
            Field b11 = c.b(kVar2);
            if (b11 != null) {
                b11.setAccessible(z10);
            }
            Method c11 = c.c(kVar2);
            if (c11 == null) {
                return;
            }
            c11.setAccessible(z10);
            return;
        }
        if (cVar instanceof k.b) {
            Field b12 = c.b(((k.b) cVar).u());
            if (b12 != null) {
                b12.setAccessible(z10);
            }
            Method d10 = c.d((g) cVar);
            if (d10 == null) {
                return;
            }
            d10.setAccessible(z10);
            return;
        }
        if (cVar instanceof h.a) {
            Field b13 = c.b(((h.a) cVar).u());
            if (b13 != null) {
                b13.setAccessible(z10);
            }
            Method d11 = c.d((g) cVar);
            if (d11 == null) {
                return;
            }
            d11.setAccessible(z10);
            return;
        }
        if (!(cVar instanceof g)) {
            throw new UnsupportedOperationException("Unknown callable: " + cVar + " (" + cVar.getClass() + ')');
        }
        g gVar = (g) cVar;
        Method d12 = c.d(gVar);
        if (d12 != null) {
            d12.setAccessible(z10);
        }
        AbstractC0831j b14 = L.b(cVar);
        Member a10 = (b14 == null || (N10 = b14.N()) == null) ? null : N10.a();
        AccessibleObject accessibleObject = a10 instanceof AccessibleObject ? (AccessibleObject) a10 : null;
        if (accessibleObject != null) {
            accessibleObject.setAccessible(true);
        }
        Constructor a11 = c.a(gVar);
        if (a11 == null) {
            return;
        }
        a11.setAccessible(z10);
    }
}
