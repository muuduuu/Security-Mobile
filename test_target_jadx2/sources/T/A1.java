package t;

import androidx.camera.core.impl.b1;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class A1 {
    public static List a(int i10, boolean z10, boolean z11) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(f());
        if (i10 == 0 || i10 == 1 || i10 == 3) {
            arrayList.addAll(h());
        }
        if (i10 == 1 || i10 == 3) {
            arrayList.addAll(e());
        }
        if (z10) {
            arrayList.addAll(j());
        }
        if (z11 && i10 == 0) {
            arrayList.addAll(c());
        }
        if (i10 == 3) {
            arrayList.addAll(g());
        }
        return arrayList;
    }

    public static List b() {
        ArrayList arrayList = new ArrayList();
        androidx.camera.core.impl.a1 a1Var = new androidx.camera.core.impl.a1();
        b1.b bVar = b1.b.PRIV;
        b1.a aVar = b1.a.MAXIMUM;
        a1Var.a(androidx.camera.core.impl.b1.a(bVar, aVar));
        arrayList.add(a1Var);
        androidx.camera.core.impl.a1 a1Var2 = new androidx.camera.core.impl.a1();
        b1.b bVar2 = b1.b.YUV;
        a1Var2.a(androidx.camera.core.impl.b1.a(bVar2, aVar));
        arrayList.add(a1Var2);
        androidx.camera.core.impl.a1 a1Var3 = new androidx.camera.core.impl.a1();
        b1.a aVar2 = b1.a.PREVIEW;
        a1Var3.a(androidx.camera.core.impl.b1.a(bVar, aVar2));
        b1.b bVar3 = b1.b.JPEG;
        a1Var3.a(androidx.camera.core.impl.b1.a(bVar3, aVar));
        arrayList.add(a1Var3);
        androidx.camera.core.impl.a1 a1Var4 = new androidx.camera.core.impl.a1();
        a1Var4.a(androidx.camera.core.impl.b1.a(bVar, aVar2));
        a1Var4.a(androidx.camera.core.impl.b1.a(bVar2, aVar));
        arrayList.add(a1Var4);
        androidx.camera.core.impl.a1 a1Var5 = new androidx.camera.core.impl.a1();
        a1Var5.a(androidx.camera.core.impl.b1.a(bVar2, aVar2));
        a1Var5.a(androidx.camera.core.impl.b1.a(bVar2, aVar));
        arrayList.add(a1Var5);
        androidx.camera.core.impl.a1 a1Var6 = new androidx.camera.core.impl.a1();
        a1Var6.a(androidx.camera.core.impl.b1.a(bVar, aVar2));
        b1.a aVar3 = b1.a.RECORD;
        a1Var6.a(androidx.camera.core.impl.b1.a(bVar, aVar3));
        arrayList.add(a1Var6);
        androidx.camera.core.impl.a1 a1Var7 = new androidx.camera.core.impl.a1();
        a1Var7.a(androidx.camera.core.impl.b1.a(bVar, aVar2));
        a1Var7.a(androidx.camera.core.impl.b1.a(bVar, aVar3));
        a1Var7.a(androidx.camera.core.impl.b1.a(bVar2, aVar3));
        arrayList.add(a1Var7);
        androidx.camera.core.impl.a1 a1Var8 = new androidx.camera.core.impl.a1();
        a1Var8.a(androidx.camera.core.impl.b1.a(bVar, aVar2));
        a1Var8.a(androidx.camera.core.impl.b1.a(bVar, aVar3));
        a1Var8.a(androidx.camera.core.impl.b1.a(bVar3, aVar3));
        arrayList.add(a1Var8);
        return arrayList;
    }

    public static List c() {
        ArrayList arrayList = new ArrayList();
        androidx.camera.core.impl.a1 a1Var = new androidx.camera.core.impl.a1();
        b1.b bVar = b1.b.PRIV;
        b1.a aVar = b1.a.PREVIEW;
        a1Var.a(androidx.camera.core.impl.b1.a(bVar, aVar));
        b1.a aVar2 = b1.a.MAXIMUM;
        a1Var.a(androidx.camera.core.impl.b1.a(bVar, aVar2));
        arrayList.add(a1Var);
        androidx.camera.core.impl.a1 a1Var2 = new androidx.camera.core.impl.a1();
        a1Var2.a(androidx.camera.core.impl.b1.a(bVar, aVar));
        b1.b bVar2 = b1.b.YUV;
        a1Var2.a(androidx.camera.core.impl.b1.a(bVar2, aVar2));
        arrayList.add(a1Var2);
        androidx.camera.core.impl.a1 a1Var3 = new androidx.camera.core.impl.a1();
        a1Var3.a(androidx.camera.core.impl.b1.a(bVar2, aVar));
        a1Var3.a(androidx.camera.core.impl.b1.a(bVar2, aVar2));
        arrayList.add(a1Var3);
        return arrayList;
    }

    public static List d() {
        ArrayList arrayList = new ArrayList();
        androidx.camera.core.impl.a1 a1Var = new androidx.camera.core.impl.a1();
        b1.b bVar = b1.b.YUV;
        b1.a aVar = b1.a.s1440p;
        a1Var.a(androidx.camera.core.impl.b1.a(bVar, aVar));
        arrayList.add(a1Var);
        androidx.camera.core.impl.a1 a1Var2 = new androidx.camera.core.impl.a1();
        b1.b bVar2 = b1.b.PRIV;
        a1Var2.a(androidx.camera.core.impl.b1.a(bVar2, aVar));
        arrayList.add(a1Var2);
        androidx.camera.core.impl.a1 a1Var3 = new androidx.camera.core.impl.a1();
        b1.b bVar3 = b1.b.JPEG;
        a1Var3.a(androidx.camera.core.impl.b1.a(bVar3, aVar));
        arrayList.add(a1Var3);
        androidx.camera.core.impl.a1 a1Var4 = new androidx.camera.core.impl.a1();
        b1.a aVar2 = b1.a.s720p;
        a1Var4.a(androidx.camera.core.impl.b1.a(bVar, aVar2));
        a1Var4.a(androidx.camera.core.impl.b1.a(bVar3, aVar));
        arrayList.add(a1Var4);
        androidx.camera.core.impl.a1 a1Var5 = new androidx.camera.core.impl.a1();
        a1Var5.a(androidx.camera.core.impl.b1.a(bVar2, aVar2));
        a1Var5.a(androidx.camera.core.impl.b1.a(bVar3, aVar));
        arrayList.add(a1Var5);
        androidx.camera.core.impl.a1 a1Var6 = new androidx.camera.core.impl.a1();
        a1Var6.a(androidx.camera.core.impl.b1.a(bVar, aVar2));
        a1Var6.a(androidx.camera.core.impl.b1.a(bVar, aVar));
        arrayList.add(a1Var6);
        androidx.camera.core.impl.a1 a1Var7 = new androidx.camera.core.impl.a1();
        a1Var7.a(androidx.camera.core.impl.b1.a(bVar, aVar2));
        a1Var7.a(androidx.camera.core.impl.b1.a(bVar2, aVar));
        arrayList.add(a1Var7);
        androidx.camera.core.impl.a1 a1Var8 = new androidx.camera.core.impl.a1();
        a1Var8.a(androidx.camera.core.impl.b1.a(bVar2, aVar2));
        a1Var8.a(androidx.camera.core.impl.b1.a(bVar, aVar));
        arrayList.add(a1Var8);
        androidx.camera.core.impl.a1 a1Var9 = new androidx.camera.core.impl.a1();
        a1Var9.a(androidx.camera.core.impl.b1.a(bVar2, aVar2));
        a1Var9.a(androidx.camera.core.impl.b1.a(bVar2, aVar));
        arrayList.add(a1Var9);
        return arrayList;
    }

    public static List e() {
        ArrayList arrayList = new ArrayList();
        androidx.camera.core.impl.a1 a1Var = new androidx.camera.core.impl.a1();
        b1.b bVar = b1.b.PRIV;
        b1.a aVar = b1.a.PREVIEW;
        a1Var.a(androidx.camera.core.impl.b1.a(bVar, aVar));
        b1.a aVar2 = b1.a.MAXIMUM;
        a1Var.a(androidx.camera.core.impl.b1.a(bVar, aVar2));
        arrayList.add(a1Var);
        androidx.camera.core.impl.a1 a1Var2 = new androidx.camera.core.impl.a1();
        a1Var2.a(androidx.camera.core.impl.b1.a(bVar, aVar));
        b1.b bVar2 = b1.b.YUV;
        a1Var2.a(androidx.camera.core.impl.b1.a(bVar2, aVar2));
        arrayList.add(a1Var2);
        androidx.camera.core.impl.a1 a1Var3 = new androidx.camera.core.impl.a1();
        a1Var3.a(androidx.camera.core.impl.b1.a(bVar2, aVar));
        a1Var3.a(androidx.camera.core.impl.b1.a(bVar2, aVar2));
        arrayList.add(a1Var3);
        androidx.camera.core.impl.a1 a1Var4 = new androidx.camera.core.impl.a1();
        a1Var4.a(androidx.camera.core.impl.b1.a(bVar, aVar));
        a1Var4.a(androidx.camera.core.impl.b1.a(bVar, aVar));
        a1Var4.a(androidx.camera.core.impl.b1.a(b1.b.JPEG, aVar2));
        arrayList.add(a1Var4);
        androidx.camera.core.impl.a1 a1Var5 = new androidx.camera.core.impl.a1();
        b1.a aVar3 = b1.a.VGA;
        a1Var5.a(androidx.camera.core.impl.b1.a(bVar2, aVar3));
        a1Var5.a(androidx.camera.core.impl.b1.a(bVar, aVar));
        a1Var5.a(androidx.camera.core.impl.b1.a(bVar2, aVar2));
        arrayList.add(a1Var5);
        androidx.camera.core.impl.a1 a1Var6 = new androidx.camera.core.impl.a1();
        a1Var6.a(androidx.camera.core.impl.b1.a(bVar2, aVar3));
        a1Var6.a(androidx.camera.core.impl.b1.a(bVar2, aVar));
        a1Var6.a(androidx.camera.core.impl.b1.a(bVar2, aVar2));
        arrayList.add(a1Var6);
        return arrayList;
    }

    public static List f() {
        ArrayList arrayList = new ArrayList();
        androidx.camera.core.impl.a1 a1Var = new androidx.camera.core.impl.a1();
        b1.b bVar = b1.b.PRIV;
        b1.a aVar = b1.a.MAXIMUM;
        a1Var.a(androidx.camera.core.impl.b1.a(bVar, aVar));
        arrayList.add(a1Var);
        androidx.camera.core.impl.a1 a1Var2 = new androidx.camera.core.impl.a1();
        b1.b bVar2 = b1.b.JPEG;
        a1Var2.a(androidx.camera.core.impl.b1.a(bVar2, aVar));
        arrayList.add(a1Var2);
        androidx.camera.core.impl.a1 a1Var3 = new androidx.camera.core.impl.a1();
        b1.b bVar3 = b1.b.YUV;
        a1Var3.a(androidx.camera.core.impl.b1.a(bVar3, aVar));
        arrayList.add(a1Var3);
        androidx.camera.core.impl.a1 a1Var4 = new androidx.camera.core.impl.a1();
        b1.a aVar2 = b1.a.PREVIEW;
        a1Var4.a(androidx.camera.core.impl.b1.a(bVar, aVar2));
        a1Var4.a(androidx.camera.core.impl.b1.a(bVar2, aVar));
        arrayList.add(a1Var4);
        androidx.camera.core.impl.a1 a1Var5 = new androidx.camera.core.impl.a1();
        a1Var5.a(androidx.camera.core.impl.b1.a(bVar3, aVar2));
        a1Var5.a(androidx.camera.core.impl.b1.a(bVar2, aVar));
        arrayList.add(a1Var5);
        androidx.camera.core.impl.a1 a1Var6 = new androidx.camera.core.impl.a1();
        a1Var6.a(androidx.camera.core.impl.b1.a(bVar, aVar2));
        a1Var6.a(androidx.camera.core.impl.b1.a(bVar, aVar2));
        arrayList.add(a1Var6);
        androidx.camera.core.impl.a1 a1Var7 = new androidx.camera.core.impl.a1();
        a1Var7.a(androidx.camera.core.impl.b1.a(bVar, aVar2));
        a1Var7.a(androidx.camera.core.impl.b1.a(bVar3, aVar2));
        arrayList.add(a1Var7);
        androidx.camera.core.impl.a1 a1Var8 = new androidx.camera.core.impl.a1();
        a1Var8.a(androidx.camera.core.impl.b1.a(bVar, aVar2));
        a1Var8.a(androidx.camera.core.impl.b1.a(bVar3, aVar2));
        a1Var8.a(androidx.camera.core.impl.b1.a(bVar2, aVar));
        arrayList.add(a1Var8);
        return arrayList;
    }

    public static List g() {
        ArrayList arrayList = new ArrayList();
        androidx.camera.core.impl.a1 a1Var = new androidx.camera.core.impl.a1();
        b1.b bVar = b1.b.PRIV;
        b1.a aVar = b1.a.PREVIEW;
        a1Var.a(androidx.camera.core.impl.b1.a(bVar, aVar));
        b1.a aVar2 = b1.a.VGA;
        a1Var.a(androidx.camera.core.impl.b1.a(bVar, aVar2));
        b1.b bVar2 = b1.b.YUV;
        b1.a aVar3 = b1.a.MAXIMUM;
        a1Var.a(androidx.camera.core.impl.b1.a(bVar2, aVar3));
        b1.b bVar3 = b1.b.RAW;
        a1Var.a(androidx.camera.core.impl.b1.a(bVar3, aVar3));
        arrayList.add(a1Var);
        androidx.camera.core.impl.a1 a1Var2 = new androidx.camera.core.impl.a1();
        a1Var2.a(androidx.camera.core.impl.b1.a(bVar, aVar));
        a1Var2.a(androidx.camera.core.impl.b1.a(bVar, aVar2));
        a1Var2.a(androidx.camera.core.impl.b1.a(b1.b.JPEG, aVar3));
        a1Var2.a(androidx.camera.core.impl.b1.a(bVar3, aVar3));
        arrayList.add(a1Var2);
        return arrayList;
    }

    public static List h() {
        ArrayList arrayList = new ArrayList();
        androidx.camera.core.impl.a1 a1Var = new androidx.camera.core.impl.a1();
        b1.b bVar = b1.b.PRIV;
        b1.a aVar = b1.a.PREVIEW;
        a1Var.a(androidx.camera.core.impl.b1.a(bVar, aVar));
        b1.a aVar2 = b1.a.RECORD;
        a1Var.a(androidx.camera.core.impl.b1.a(bVar, aVar2));
        arrayList.add(a1Var);
        androidx.camera.core.impl.a1 a1Var2 = new androidx.camera.core.impl.a1();
        a1Var2.a(androidx.camera.core.impl.b1.a(bVar, aVar));
        b1.b bVar2 = b1.b.YUV;
        a1Var2.a(androidx.camera.core.impl.b1.a(bVar2, aVar2));
        arrayList.add(a1Var2);
        androidx.camera.core.impl.a1 a1Var3 = new androidx.camera.core.impl.a1();
        a1Var3.a(androidx.camera.core.impl.b1.a(bVar2, aVar));
        a1Var3.a(androidx.camera.core.impl.b1.a(bVar2, aVar2));
        arrayList.add(a1Var3);
        androidx.camera.core.impl.a1 a1Var4 = new androidx.camera.core.impl.a1();
        a1Var4.a(androidx.camera.core.impl.b1.a(bVar, aVar));
        a1Var4.a(androidx.camera.core.impl.b1.a(bVar, aVar2));
        b1.b bVar3 = b1.b.JPEG;
        a1Var4.a(androidx.camera.core.impl.b1.a(bVar3, aVar2));
        arrayList.add(a1Var4);
        androidx.camera.core.impl.a1 a1Var5 = new androidx.camera.core.impl.a1();
        a1Var5.a(androidx.camera.core.impl.b1.a(bVar, aVar));
        a1Var5.a(androidx.camera.core.impl.b1.a(bVar2, aVar2));
        a1Var5.a(androidx.camera.core.impl.b1.a(bVar3, aVar2));
        arrayList.add(a1Var5);
        androidx.camera.core.impl.a1 a1Var6 = new androidx.camera.core.impl.a1();
        a1Var6.a(androidx.camera.core.impl.b1.a(bVar2, aVar));
        a1Var6.a(androidx.camera.core.impl.b1.a(bVar2, aVar));
        a1Var6.a(androidx.camera.core.impl.b1.a(bVar3, b1.a.MAXIMUM));
        arrayList.add(a1Var6);
        return arrayList;
    }

    public static List i() {
        ArrayList arrayList = new ArrayList();
        androidx.camera.core.impl.a1 a1Var = new androidx.camera.core.impl.a1();
        b1.b bVar = b1.b.PRIV;
        b1.a aVar = b1.a.s1440p;
        a1Var.a(androidx.camera.core.impl.b1.a(bVar, aVar));
        arrayList.add(a1Var);
        androidx.camera.core.impl.a1 a1Var2 = new androidx.camera.core.impl.a1();
        b1.b bVar2 = b1.b.YUV;
        a1Var2.a(androidx.camera.core.impl.b1.a(bVar2, aVar));
        arrayList.add(a1Var2);
        androidx.camera.core.impl.a1 a1Var3 = new androidx.camera.core.impl.a1();
        a1Var3.a(androidx.camera.core.impl.b1.a(bVar, aVar));
        b1.b bVar3 = b1.b.JPEG;
        b1.a aVar2 = b1.a.MAXIMUM;
        a1Var3.a(androidx.camera.core.impl.b1.a(bVar3, aVar2));
        arrayList.add(a1Var3);
        androidx.camera.core.impl.a1 a1Var4 = new androidx.camera.core.impl.a1();
        a1Var4.a(androidx.camera.core.impl.b1.a(bVar2, aVar));
        a1Var4.a(androidx.camera.core.impl.b1.a(bVar3, aVar2));
        arrayList.add(a1Var4);
        androidx.camera.core.impl.a1 a1Var5 = new androidx.camera.core.impl.a1();
        a1Var5.a(androidx.camera.core.impl.b1.a(bVar, aVar));
        a1Var5.a(androidx.camera.core.impl.b1.a(bVar2, aVar2));
        arrayList.add(a1Var5);
        androidx.camera.core.impl.a1 a1Var6 = new androidx.camera.core.impl.a1();
        a1Var6.a(androidx.camera.core.impl.b1.a(bVar2, aVar));
        a1Var6.a(androidx.camera.core.impl.b1.a(bVar2, aVar2));
        arrayList.add(a1Var6);
        androidx.camera.core.impl.a1 a1Var7 = new androidx.camera.core.impl.a1();
        b1.a aVar3 = b1.a.PREVIEW;
        a1Var7.a(androidx.camera.core.impl.b1.a(bVar, aVar3));
        a1Var7.a(androidx.camera.core.impl.b1.a(bVar, aVar));
        arrayList.add(a1Var7);
        androidx.camera.core.impl.a1 a1Var8 = new androidx.camera.core.impl.a1();
        a1Var8.a(androidx.camera.core.impl.b1.a(bVar2, aVar3));
        a1Var8.a(androidx.camera.core.impl.b1.a(bVar, aVar));
        arrayList.add(a1Var8);
        androidx.camera.core.impl.a1 a1Var9 = new androidx.camera.core.impl.a1();
        a1Var9.a(androidx.camera.core.impl.b1.a(bVar, aVar3));
        a1Var9.a(androidx.camera.core.impl.b1.a(bVar2, aVar));
        arrayList.add(a1Var9);
        androidx.camera.core.impl.a1 a1Var10 = new androidx.camera.core.impl.a1();
        a1Var10.a(androidx.camera.core.impl.b1.a(bVar2, aVar3));
        a1Var10.a(androidx.camera.core.impl.b1.a(bVar2, aVar));
        arrayList.add(a1Var10);
        return arrayList;
    }

    public static List j() {
        ArrayList arrayList = new ArrayList();
        androidx.camera.core.impl.a1 a1Var = new androidx.camera.core.impl.a1();
        b1.b bVar = b1.b.RAW;
        b1.a aVar = b1.a.MAXIMUM;
        a1Var.a(androidx.camera.core.impl.b1.a(bVar, aVar));
        arrayList.add(a1Var);
        androidx.camera.core.impl.a1 a1Var2 = new androidx.camera.core.impl.a1();
        b1.b bVar2 = b1.b.PRIV;
        b1.a aVar2 = b1.a.PREVIEW;
        a1Var2.a(androidx.camera.core.impl.b1.a(bVar2, aVar2));
        a1Var2.a(androidx.camera.core.impl.b1.a(bVar, aVar));
        arrayList.add(a1Var2);
        androidx.camera.core.impl.a1 a1Var3 = new androidx.camera.core.impl.a1();
        b1.b bVar3 = b1.b.YUV;
        a1Var3.a(androidx.camera.core.impl.b1.a(bVar3, aVar2));
        a1Var3.a(androidx.camera.core.impl.b1.a(bVar, aVar));
        arrayList.add(a1Var3);
        androidx.camera.core.impl.a1 a1Var4 = new androidx.camera.core.impl.a1();
        a1Var4.a(androidx.camera.core.impl.b1.a(bVar2, aVar2));
        a1Var4.a(androidx.camera.core.impl.b1.a(bVar2, aVar2));
        a1Var4.a(androidx.camera.core.impl.b1.a(bVar, aVar));
        arrayList.add(a1Var4);
        androidx.camera.core.impl.a1 a1Var5 = new androidx.camera.core.impl.a1();
        a1Var5.a(androidx.camera.core.impl.b1.a(bVar2, aVar2));
        a1Var5.a(androidx.camera.core.impl.b1.a(bVar3, aVar2));
        a1Var5.a(androidx.camera.core.impl.b1.a(bVar, aVar));
        arrayList.add(a1Var5);
        androidx.camera.core.impl.a1 a1Var6 = new androidx.camera.core.impl.a1();
        a1Var6.a(androidx.camera.core.impl.b1.a(bVar3, aVar2));
        a1Var6.a(androidx.camera.core.impl.b1.a(bVar3, aVar2));
        a1Var6.a(androidx.camera.core.impl.b1.a(bVar, aVar));
        arrayList.add(a1Var6);
        androidx.camera.core.impl.a1 a1Var7 = new androidx.camera.core.impl.a1();
        a1Var7.a(androidx.camera.core.impl.b1.a(bVar2, aVar2));
        b1.b bVar4 = b1.b.JPEG;
        a1Var7.a(androidx.camera.core.impl.b1.a(bVar4, aVar));
        a1Var7.a(androidx.camera.core.impl.b1.a(bVar, aVar));
        arrayList.add(a1Var7);
        androidx.camera.core.impl.a1 a1Var8 = new androidx.camera.core.impl.a1();
        a1Var8.a(androidx.camera.core.impl.b1.a(bVar3, aVar2));
        a1Var8.a(androidx.camera.core.impl.b1.a(bVar4, aVar));
        a1Var8.a(androidx.camera.core.impl.b1.a(bVar, aVar));
        arrayList.add(a1Var8);
        return arrayList;
    }

    public static List k() {
        ArrayList arrayList = new ArrayList();
        androidx.camera.core.impl.a1 a1Var = new androidx.camera.core.impl.a1();
        b1.b bVar = b1.b.PRIV;
        b1.a aVar = b1.a.s1440p;
        a1Var.a(androidx.camera.core.impl.b1.b(bVar, aVar, 4L));
        arrayList.add(a1Var);
        androidx.camera.core.impl.a1 a1Var2 = new androidx.camera.core.impl.a1();
        b1.b bVar2 = b1.b.YUV;
        a1Var2.a(androidx.camera.core.impl.b1.b(bVar2, aVar, 4L));
        arrayList.add(a1Var2);
        androidx.camera.core.impl.a1 a1Var3 = new androidx.camera.core.impl.a1();
        b1.a aVar2 = b1.a.RECORD;
        a1Var3.a(androidx.camera.core.impl.b1.b(bVar, aVar2, 3L));
        arrayList.add(a1Var3);
        androidx.camera.core.impl.a1 a1Var4 = new androidx.camera.core.impl.a1();
        a1Var4.a(androidx.camera.core.impl.b1.b(bVar2, aVar2, 3L));
        arrayList.add(a1Var4);
        androidx.camera.core.impl.a1 a1Var5 = new androidx.camera.core.impl.a1();
        b1.b bVar3 = b1.b.JPEG;
        b1.a aVar3 = b1.a.MAXIMUM;
        a1Var5.a(androidx.camera.core.impl.b1.b(bVar3, aVar3, 2L));
        arrayList.add(a1Var5);
        androidx.camera.core.impl.a1 a1Var6 = new androidx.camera.core.impl.a1();
        a1Var6.a(androidx.camera.core.impl.b1.b(bVar2, aVar3, 2L));
        arrayList.add(a1Var6);
        androidx.camera.core.impl.a1 a1Var7 = new androidx.camera.core.impl.a1();
        b1.a aVar4 = b1.a.PREVIEW;
        a1Var7.a(androidx.camera.core.impl.b1.b(bVar, aVar4, 1L));
        a1Var7.a(androidx.camera.core.impl.b1.b(bVar3, aVar3, 2L));
        arrayList.add(a1Var7);
        androidx.camera.core.impl.a1 a1Var8 = new androidx.camera.core.impl.a1();
        a1Var8.a(androidx.camera.core.impl.b1.b(bVar, aVar4, 1L));
        a1Var8.a(androidx.camera.core.impl.b1.b(bVar2, aVar3, 2L));
        arrayList.add(a1Var8);
        androidx.camera.core.impl.a1 a1Var9 = new androidx.camera.core.impl.a1();
        a1Var9.a(androidx.camera.core.impl.b1.b(bVar, aVar4, 1L));
        a1Var9.a(androidx.camera.core.impl.b1.b(bVar, aVar2, 3L));
        arrayList.add(a1Var9);
        androidx.camera.core.impl.a1 a1Var10 = new androidx.camera.core.impl.a1();
        a1Var10.a(androidx.camera.core.impl.b1.b(bVar, aVar4, 1L));
        a1Var10.a(androidx.camera.core.impl.b1.b(bVar2, aVar2, 3L));
        arrayList.add(a1Var10);
        androidx.camera.core.impl.a1 a1Var11 = new androidx.camera.core.impl.a1();
        a1Var11.a(androidx.camera.core.impl.b1.b(bVar, aVar4, 1L));
        a1Var11.a(androidx.camera.core.impl.b1.b(bVar2, aVar4, 1L));
        arrayList.add(a1Var11);
        androidx.camera.core.impl.a1 a1Var12 = new androidx.camera.core.impl.a1();
        a1Var12.a(androidx.camera.core.impl.b1.b(bVar, aVar4, 1L));
        a1Var12.a(androidx.camera.core.impl.b1.b(bVar, aVar2, 3L));
        a1Var12.a(androidx.camera.core.impl.b1.b(bVar3, aVar2, 2L));
        arrayList.add(a1Var12);
        androidx.camera.core.impl.a1 a1Var13 = new androidx.camera.core.impl.a1();
        a1Var13.a(androidx.camera.core.impl.b1.b(bVar, aVar4, 1L));
        a1Var13.a(androidx.camera.core.impl.b1.b(bVar2, aVar2, 3L));
        a1Var13.a(androidx.camera.core.impl.b1.b(bVar3, aVar2, 2L));
        arrayList.add(a1Var13);
        androidx.camera.core.impl.a1 a1Var14 = new androidx.camera.core.impl.a1();
        a1Var14.a(androidx.camera.core.impl.b1.b(bVar, aVar4, 1L));
        a1Var14.a(androidx.camera.core.impl.b1.b(bVar2, aVar4, 1L));
        a1Var14.a(androidx.camera.core.impl.b1.b(bVar3, aVar3, 2L));
        arrayList.add(a1Var14);
        return arrayList;
    }

    public static List l() {
        ArrayList arrayList = new ArrayList();
        androidx.camera.core.impl.a1 a1Var = new androidx.camera.core.impl.a1();
        b1.b bVar = b1.b.JPEG_R;
        b1.a aVar = b1.a.MAXIMUM;
        a1Var.a(androidx.camera.core.impl.b1.a(bVar, aVar));
        arrayList.add(a1Var);
        androidx.camera.core.impl.a1 a1Var2 = new androidx.camera.core.impl.a1();
        a1Var2.a(androidx.camera.core.impl.b1.a(b1.b.PRIV, b1.a.PREVIEW));
        a1Var2.a(androidx.camera.core.impl.b1.a(bVar, aVar));
        arrayList.add(a1Var2);
        return arrayList;
    }

    public static List m() {
        ArrayList arrayList = new ArrayList();
        androidx.camera.core.impl.a1 a1Var = new androidx.camera.core.impl.a1();
        b1.b bVar = b1.b.YUV;
        b1.a aVar = b1.a.ULTRA_MAXIMUM;
        a1Var.a(androidx.camera.core.impl.b1.a(bVar, aVar));
        b1.b bVar2 = b1.b.PRIV;
        b1.a aVar2 = b1.a.PREVIEW;
        a1Var.a(androidx.camera.core.impl.b1.a(bVar2, aVar2));
        b1.a aVar3 = b1.a.RECORD;
        a1Var.a(androidx.camera.core.impl.b1.a(bVar2, aVar3));
        arrayList.add(a1Var);
        androidx.camera.core.impl.a1 a1Var2 = new androidx.camera.core.impl.a1();
        b1.b bVar3 = b1.b.JPEG;
        a1Var2.a(androidx.camera.core.impl.b1.a(bVar3, aVar));
        a1Var2.a(androidx.camera.core.impl.b1.a(bVar2, aVar2));
        a1Var2.a(androidx.camera.core.impl.b1.a(bVar2, aVar3));
        arrayList.add(a1Var2);
        androidx.camera.core.impl.a1 a1Var3 = new androidx.camera.core.impl.a1();
        b1.b bVar4 = b1.b.RAW;
        a1Var3.a(androidx.camera.core.impl.b1.a(bVar4, aVar));
        a1Var3.a(androidx.camera.core.impl.b1.a(bVar2, aVar2));
        a1Var3.a(androidx.camera.core.impl.b1.a(bVar2, aVar3));
        arrayList.add(a1Var3);
        androidx.camera.core.impl.a1 a1Var4 = new androidx.camera.core.impl.a1();
        a1Var4.a(androidx.camera.core.impl.b1.a(bVar, aVar));
        a1Var4.a(androidx.camera.core.impl.b1.a(bVar2, aVar2));
        b1.a aVar4 = b1.a.MAXIMUM;
        a1Var4.a(androidx.camera.core.impl.b1.a(bVar3, aVar4));
        arrayList.add(a1Var4);
        androidx.camera.core.impl.a1 a1Var5 = new androidx.camera.core.impl.a1();
        a1Var5.a(androidx.camera.core.impl.b1.a(bVar3, aVar));
        a1Var5.a(androidx.camera.core.impl.b1.a(bVar2, aVar2));
        a1Var5.a(androidx.camera.core.impl.b1.a(bVar3, aVar4));
        arrayList.add(a1Var5);
        androidx.camera.core.impl.a1 a1Var6 = new androidx.camera.core.impl.a1();
        a1Var6.a(androidx.camera.core.impl.b1.a(bVar4, aVar));
        a1Var6.a(androidx.camera.core.impl.b1.a(bVar2, aVar2));
        a1Var6.a(androidx.camera.core.impl.b1.a(bVar3, aVar4));
        arrayList.add(a1Var6);
        androidx.camera.core.impl.a1 a1Var7 = new androidx.camera.core.impl.a1();
        a1Var7.a(androidx.camera.core.impl.b1.a(bVar, aVar));
        a1Var7.a(androidx.camera.core.impl.b1.a(bVar2, aVar2));
        a1Var7.a(androidx.camera.core.impl.b1.a(bVar, aVar4));
        arrayList.add(a1Var7);
        androidx.camera.core.impl.a1 a1Var8 = new androidx.camera.core.impl.a1();
        a1Var8.a(androidx.camera.core.impl.b1.a(bVar3, aVar));
        a1Var8.a(androidx.camera.core.impl.b1.a(bVar2, aVar2));
        a1Var8.a(androidx.camera.core.impl.b1.a(bVar, aVar4));
        arrayList.add(a1Var8);
        androidx.camera.core.impl.a1 a1Var9 = new androidx.camera.core.impl.a1();
        a1Var9.a(androidx.camera.core.impl.b1.a(bVar4, aVar));
        a1Var9.a(androidx.camera.core.impl.b1.a(bVar2, aVar2));
        a1Var9.a(androidx.camera.core.impl.b1.a(bVar, aVar4));
        arrayList.add(a1Var9);
        androidx.camera.core.impl.a1 a1Var10 = new androidx.camera.core.impl.a1();
        a1Var10.a(androidx.camera.core.impl.b1.a(bVar, aVar));
        a1Var10.a(androidx.camera.core.impl.b1.a(bVar2, aVar2));
        a1Var10.a(androidx.camera.core.impl.b1.a(bVar4, aVar4));
        arrayList.add(a1Var10);
        androidx.camera.core.impl.a1 a1Var11 = new androidx.camera.core.impl.a1();
        a1Var11.a(androidx.camera.core.impl.b1.a(bVar3, aVar));
        a1Var11.a(androidx.camera.core.impl.b1.a(bVar2, aVar2));
        a1Var11.a(androidx.camera.core.impl.b1.a(bVar4, aVar4));
        arrayList.add(a1Var11);
        androidx.camera.core.impl.a1 a1Var12 = new androidx.camera.core.impl.a1();
        a1Var12.a(androidx.camera.core.impl.b1.a(bVar4, aVar));
        a1Var12.a(androidx.camera.core.impl.b1.a(bVar2, aVar2));
        a1Var12.a(androidx.camera.core.impl.b1.a(bVar4, aVar4));
        arrayList.add(a1Var12);
        return arrayList;
    }
}
