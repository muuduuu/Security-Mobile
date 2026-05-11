package u5;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import android.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: u5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4870a extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public static final String f43493a = "a";

    public C4870a(Context context) {
        super(context);
    }

    private static String b(String str, String str2) {
        String str3 = str + " " + str2;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str3.getBytes(StandardCharsets.UTF_8));
            String substring = Base64.encodeToString(Arrays.copyOfRange(messageDigest.digest(), 0, 9), 3).substring(0, 11);
            Log.d(f43493a, String.format("pkg: %s -- hash: %s", str, substring));
            return substring;
        } catch (NoSuchAlgorithmException e10) {
            Log.e(f43493a, "hash:NoSuchAlgorithm", e10);
            return null;
        }
    }

    public ArrayList a() {
        ArrayList arrayList = new ArrayList();
        try {
            String packageName = getPackageName();
            for (Signature signature : getPackageManager().getPackageInfo(packageName, 64).signatures) {
                String b10 = b(packageName, signature.toCharsString());
                if (b10 != null) {
                    arrayList.add(String.format("%s", b10));
                }
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e(f43493a, "Unable to find package to obtain hash.", e10);
        }
        return arrayList;
    }
}
