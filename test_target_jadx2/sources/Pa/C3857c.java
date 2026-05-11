package pa;

import Nb.p;
import Oa.m;
import Tb.i;
import Yb.k;
import db.C3016k;
import expo.modules.adapters.react.ReactAdapterPackage;
import expo.modules.constants.ConstantsPackage;
import expo.modules.core.BasePackage;
import expo.modules.devlauncher.DevLauncherPackage;
import expo.modules.devmenu.DevMenuPackage;
import expo.modules.filesystem.FileSystemPackage;
import expo.modules.imageloader.ImageLoaderPackage;
import expo.modules.keepawake.KeepAwakePackage;
import expo.modules.linking.ExpoLinkingPackage;
import expo.modules.navigationbar.NavigationBarPackage;
import expo.modules.systemui.SystemUIPackage;
import gb.C3215a;
import java.util.Arrays;
import java.util.List;
import pb.l;
import sa.C4507a;
import ta.C4823a;
import ua.C4876a;
import xb.AbstractC5139a;
import za.C5268c;

/* renamed from: pa.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3857c implements l {

    /* renamed from: pa.c$a */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        static final List f38495a = Arrays.asList(new ReactAdapterPackage(), new ConstantsPackage(), new BasePackage(), new DevLauncherPackage(), new DevMenuPackage(), new FileSystemPackage(), new ImageLoaderPackage(), new KeepAwakePackage(), new ExpoLinkingPackage(), new NavigationBarPackage(), new SystemUIPackage());

        /* renamed from: b, reason: collision with root package name */
        static final List f38496b = Arrays.asList(Na.a.class, C4507a.class, C4823a.class, C4876a.class, va.f.class, C5268c.class, Aa.a.class, expo.modules.crypto.a.class, La.b.class, La.c.class, Ia.a.class, m.class, Pa.d.class, Qa.b.class, Ra.b.class, Ta.g.class, C3016k.class, C3215a.class, ob.f.class, Kb.a.class, Lb.a.class, Mb.a.class, p.class, Pb.b.class, Rb.a.class, i.class, Vb.e.class, Wb.b.class, k.class);
    }

    public static List<Ea.g> getPackageList() {
        return a.f38495a;
    }

    @Override // pb.l
    public List<Class<? extends AbstractC5139a>> getModulesList() {
        return a.f38496b;
    }
}
