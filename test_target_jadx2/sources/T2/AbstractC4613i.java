package t2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import h.AbstractC3220a;

/* renamed from: t2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4613i {

    /* renamed from: a, reason: collision with root package name */
    private static volatile boolean f42288a = true;

    public static Drawable a(Context context, int i10, Resources.Theme theme) {
        return c(context, context, i10, theme);
    }

    public static Drawable b(Context context, Context context2, int i10) {
        return c(context, context2, i10, null);
    }

    private static Drawable c(Context context, Context context2, int i10, Resources.Theme theme) {
        try {
            if (f42288a) {
                return e(context2, i10, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e10) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e10;
            }
            return androidx.core.content.a.e(context2, i10);
        } catch (NoClassDefFoundError unused2) {
            f42288a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return d(context2, i10, theme);
    }

    private static Drawable d(Context context, int i10, Resources.Theme theme) {
        return androidx.core.content.res.f.f(context.getResources(), i10, theme);
    }

    private static Drawable e(Context context, int i10, Resources.Theme theme) {
        if (theme != null) {
            androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, theme);
            dVar.a(theme.getResources().getConfiguration());
            context = dVar;
        }
        return AbstractC3220a.b(context, i10);
    }
}
